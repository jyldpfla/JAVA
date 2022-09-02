package kr.co.greenart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/handle")
public class HandlerMethodArgs {
	@GetMapping("/cookie") 
	public @ResponseBody String args(@CookieValue(name ="JSESSIONID" ) String jsessionid) {
		// @CookieValue : cookie값도 바로 가져올 수 있음
		// name으로 attribute값에 이름 부여
		return jsessionid;
	}
	
	// header에 값 담기
	@GetMapping("/header") 
	public @ResponseBody String head(@RequestHeader("Accept") String accept) {
		return accept;
	}
	
	@GetMapping("/{path1}/{path2}") // 주소 자체를 변수로 사용하기 위해 쓰는 방법
	public @ResponseBody String paths(@PathVariable String path1, @PathVariable String path2) {
		return path1 + path2;
	}
}
