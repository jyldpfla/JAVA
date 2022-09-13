package kr.co.greenart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

// 정보를 갖고 있는 객체에 대해 정보를 얼마나 활용하고 가지고 있을지 구체적으로 지정
@Controller
@RequestMapping(value = "/session", produces = "text/plain; charset=utf-8")
@ResponseBody // 응답 객체 body에 담기라고 해줘야 forward가 제대로 됨
// 아니면 getmapping method에서 String return값이면 주소값으로 mapping되므로 이상한데로 forward 됨
@SessionAttributes("modelname") // 세션으로 관리해달라고 했지만, 계속해서 담아두는 것이 아님, 이 클래스 안에서만 session값처럼 사용 가능
// 한 번의 요청마다 값이 사라지는 것이 아니고, req, session 그 사이 어딘가쯤 정도라고 생각하면 됨
// 하나의 controller에서 session값처럼 쓰고 싶으면 이렇게 쓰면 됨
// if 웹애플리케이션 전역에서 사용하고 싶을 때는(ex. 로그인 정보) -> 일반적인 session scope로 사용해야함(HttpSession)
public class SessionController {
	@GetMapping("/add")
	public String addSessionValue(HttpSession session) { // 사용자요청이 왔을 때 session 객체 달라고 parameter로 넣어주면
	// dispatcher servlet이 session 넘겨줌	
		session.setAttribute("myname", "myvalue"); // 넘겨 받은 세션에 attribute 설정
		return "세션에 값 설정";
	}
	
	// 세션 값 확인
	@GetMapping("/check")
	public String getSessionValues(HttpSession session) {
		return (String) session.getAttribute("myname");
	}
	
	@GetMapping("/model")
	public String addModelValue(Model model) {
		model.addAttribute("modelname", "modelvalue");
		return "모델에 값 설정";
	}
	
	@GetMapping("/modelcheck")
	public String getModelValue(Model model) {
		return (String) model.getAttribute("modelname");
		// model 주소 보내고 해도 안나옴 -> spring이 model에 집어넣은 attribute값은 안보이게 함
		// sessionAttributes로 설정해서 나오게 하기 -> session이 있어야 가능(add 먼저)
	}
	
	// model에 심어져있는 session attribute 관리
	@GetMapping("/status")
	public String complete(SessionStatus status) { // SessionStatus
		status.setComplete(); // model에서 사라지는 거임
		return "세션 어트리뷰트 삭제되었음";
	}
}
