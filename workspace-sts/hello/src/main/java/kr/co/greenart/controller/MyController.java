package kr.co.greenart.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my")
public class MyController {
	private static final Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@GetMapping // 매핑 메소드
	public String myView() {
		logger.info("사용자의 요청을 로깅합니다."); 
		// 요청 처리 전(핸들링 전) 사용자의 요청이 있었음을 기록 
		// -> 매번 이 요청이 있음이 기록되길 원한다면? 
		// -> 사용자가 요청할 때마다 반복되어야함 (servlet이 실행되기 전 'filter'가 작업을 수행)
		// filter는 요청 주소로 동작, spring은 servlet이 하나이므로 filter 구현 어려움
		// 그래서 servlet 지나는 controller(주소 매핑o) 전 후로 끼워 넣어서 구현 
		// => 인터셉터 : handler, controller 구현되기 전 후로 동작
		return "myview"; // 뷰로 포워드
	}
	
	@GetMapping("/{var}")
	public String myParhVar(@PathVariable String var) {
		logger.info("사용자의 요청을 로깅합니다."); 
		return "myview";
	}
	
	@GetMapping("/burn")
	public String burnAtrr(HttpSession session) {
		logger.info("사용자의 요청을 로깅합니다.");
		session.setAttribute("burn", "읽고 삭제하시오");
		return "myview";
	}
	
	@GetMapping("/null")
	public String nullExcp() {
		throw new NullPointerException("임의로 발생시킨 널 예외");
	}
}
