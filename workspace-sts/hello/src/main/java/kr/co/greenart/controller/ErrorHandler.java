package kr.co.greenart.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice() // controller 영역에서 예외 핸들링 등 controller 전역에서 반복적으로 일어나는 일을 관리할 수 있는 component
// mapping 안한 이유 : 대개 controller 전역에서 사용
// 특정 controller에서만 동작해야하는 경우
// ()안 - ① annotations : 해당 annotation이 붙어있는 controller에만 동작
// ② : controller class 지정 ③ : 패키지 써두면 그 패키지 안 controller 만
public class ErrorHandler {
	@ExceptionHandler(value = NullPointerException.class) // 예외 핸들링 핸들러메소드
	// value = 처리할 예외 지정
	public String nullExcep(Model model, NullPointerException ex) {
		model.addAttribute("error", "서버에서 오류가 발생했습니다. 죄송ㅋㅋㅈㅅ"  + ex.getMessage());
		return "errorpage";
	}
	
}
