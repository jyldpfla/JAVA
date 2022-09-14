package kr.co.greenart.model.file;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class FileController {
	private int pow(int a) {
		return a * a;
	}
	
	@Autowired
	private FileRepository repo;
	
	@GetMapping
	public String fileForm() {
		return "fileForm";
	}
	
	// multipart 다룰 메소드
	@PostMapping
	public String submit(@RequestParam MultipartFile upload) { 
		// @RequestParam(value = "asdf")로 하면 이름 변경 가능, upload라는 param으로 받아와서 이름 upload임
		String filename = upload.getOriginalFilename(); // getOriginalFilename() : 진짜 파일 이름
		int result = repo.save(upload); // 파일 저장
		
		return "redirect:file/result";
	}
	
	// file 화면창 출력
	@GetMapping("/result")
	public String view(Model model) {
		List<String> list = repo.getAllnames();
		model.addAttribute("list", list);
		return "fileView";
	}
	
	// 다운로드
	@GetMapping("/down")
	public ResponseEntity<Resource> down(@RequestParam String item) {
		// ResponseEntity : 응답 header, body 설정 가능
		// resource라는 이진 데이터가 응답 body가 담겨야 하고
		// 응답 head 파일이름, 어떤 이미지인지 등이 담겨있어야함
		Resource resource = repo.getByName(item);
		
		if (resource == null) {
			return (ResponseEntity<Resource>) ResponseEntity.notFound();
			// 데이터를 resource라는 형으로 다루면  spring에서 편리하게 다룰 수 이씅ㅁ
		}
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		// 여러 타입을 이용하므로 정의 어려워서 이진데이터인 것만 알려주기
		try {
			headers.add("Content-Disposition", "attachment; filename=" + URLEncoder.encode(item, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(resource, headers, HttpStatus.OK);
	}
}
