package kr.co.greenart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kr.co.greenart.model.file.FileRepository;

@Controller
@RequestMapping("/file")
public class FileController {
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
	
	@GetMapping("/result")
	public String view() {
		return "fileView";
	}
}
