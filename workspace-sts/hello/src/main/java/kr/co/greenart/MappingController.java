package kr.co.greenart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mapping")
public class MappingController {
	@GetMapping(value = "/??.two", produces ="text/plain; charset=utf-8")
	// produces : 출력할 때 타입 설정
	public @ResponseBody String two() {
		return "두글자 매핑";
	}
	
	@GetMapping("/*.do")
	public @ResponseBody String doURI() {
		return "do로 끝나는 매핑";
	}
	
//	@GetMapping(value = "/ppp", params = "com = val") 
	// 위에 param 넣으면 필수로 param이 됨 (com이 param 이름이고 값이 val이어야만 함
	@GetMapping(value = "/ppp", params = "com") // 값이 없어도 됨
	//!com : com이라는 param이 없어야함
	// value는 같아도 입력값이 있을 때 없을 때 나눠서 메소드 작성 가능
	public @ResponseBody String ppp(@RequestParam(defaultValue = "default") String com) {
		// 값이 없을 경우 @RequestParam에서 지정한 defaultValue의 값이 default값이 됨
		return com;
	}
	
}
