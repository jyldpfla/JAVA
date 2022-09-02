package kr.co.greenart.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.greenart.model.User;
import kr.co.greenart.model.UserService;
import kr.co.greenart.model.UserValidator;

@Controller
public class UserController {
	private final static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserValidator validator;
	
	@Autowired
	private UserService service;
	
	@GetMapping("/user/list")
	public String list(Model model) {
		model.addAttribute("list", service.list()); // service.list(); // list 가져오기
		return "userlist";
	}
	
	@PostMapping("/user")
	public String submit(@ModelAttribute("user") @Valid User user, BindingResult errors) { 
		// User user -> getParameter가 아니라 타입에 잘 맞는 class 파일만 있어도 값을 가져올 수 있음 but 이렇게 되면, 입력 유효값 따진 것 아님 -> 유효값 따지는 정의 만들어주어야 함
		// @Valid : 유효성 검사를 위한 annotation
		
		logger.info("입력 정보: " + user.toString());
		
		// 유효성 체크 객체 사용
		// BindingResult : errors interace 상속한 클래스
//		validator.validate(user, errors);
		if (errors.hasErrors()) {
			return "userForm"; // forward로 다시 입력폼으로
		}
		
		service.add(user);
		
		return "redirect:/user/list";
		
	}
	
	@ModelAttribute("user") // attribute값 설정하기!
	public User user() {
		return new User("기본값", 1);
	}
	
	@GetMapping("/user")
	public String userForm(@ModelAttribute("user") User user) { // 이 파라미터가 model.setAttribute파트 대신 함
//		model.addAttribute("user", new User("기본값" , 1));
//		// 파라미터로 Model 객체 받고 위 User 생성자 안에 파라미터값 넣어주면 userForm path로 binding 됨
		return "userForm";
	}
	
}
