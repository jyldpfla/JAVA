package kr.co.greenart;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/returns")
public class ReturnTypesController {
	@GetMapping("/viewname")
	public String viewname() {
		return "hello"; // 해당 view를 forward 시켜줌
	}
	// view를 보내면서 attribute값을 보내고 싶으면 Model 이용해서 값 담아서 보낼 수 있음
	
	@GetMapping("/respbody")
	//@ResponseBody 여기 써도 됨(아니면 아래처럼 return 타입 왼쪽)
	public @ResponseBody String body() { // ResponseBody에 담고자하는 문자열을 담아서 출력하고 싶을 때
		return "body 내용";
	}
	
	// ModelAndView : 모델과 뷰를 같이 설정할 수 있는 객체, 위 view와 차이o
	@GetMapping("/mv")
	public ModelAndView mv() { // 파라미터값으로 넣어서 가져와도 됨
		ModelAndView mv = new ModelAndView(); // ModelAndView 객체를 직접 생성해도 되고
		mv.addObject("result", "모델앤뷰 객체로 설정");
		mv.setViewName("plusresult"); // setViewName : 뷰 이름 써주면 해당 뷰로 forward할 수 있도록 해줌
		return mv;
	}
	
	// 응답 Header와 Body 설정
	@GetMapping("/respentity")
	public ResponseEntity<String> entity() { // generic으로 되어있는부분 : response body의 타입
		// responseEntity에 있는 메소드로 설정하는 방법
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_TYPE, "text/pain; charset=utf-8").body("바디 내용");
		
		// 생성자로 하는 방법
//		String body = "바디 내용입니다";
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Content-Type", "text/plain; charset=utf-8");
//		ResponseEntity<String> en = new ResponseEntity<>(body, headers, HttpStatus.OK);
//		return en;
	}
	
	// redirect (이전까지 문자열 적으면 forward됨)
	@GetMapping("/red")
	public String redirect() {
		return "redirect:/";
	}
}
