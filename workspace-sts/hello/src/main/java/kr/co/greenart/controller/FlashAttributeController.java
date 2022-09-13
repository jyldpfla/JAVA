package kr.co.greenart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/flash")
public class FlashAttributeController {
	@GetMapping("/1")
	public String forward(Model model) {
		model.addAttribute("forwardtest", "포워드 테스트");
		return "flashview";
	}
	
	@GetMapping("/2")
	public String view() {
		return "flashview";
	}
	
	@GetMapping("/3")
	public String redirect(Model model) {
		model.addAttribute("redirecttest", "리다이렉트 테스트");
		return "redirect:2";
		 // 스프링에서 리다이렉트하는데 모델이 있네? 쓰려고 한건가? 하고 주소에 알아서 파라미터를 집어넣어준다
	     // 그렇기 때문에 쓰려면 파라미터 객체에서 꺼내써야한다
	     // 근데 이렇게 쓰면 주소에 내가 심은 값이 다 보인다
	}
	
	// redirect 하면 요청이 2번 보내짐 
	// -> 요청 정보가 저장되려면 session이 사용되어야하는데, 매번 session에 저장하면 불필요한 정보가 계속해서 저장될 수 있음
	// => 1번의 redirect에 대해 값을 유지해줄 수 있는 attribute를 spring에서 제공 -> flash
	@GetMapping("/4")
	public String flash(RedirectAttributes ra) {
		ra.addFlashAttribute("redirecttest", "플래시 어트리뷰트의 모델값"); 
		// addFlashAttribute : redirect 1번에 대해서는 유지됨 -> 세션에 저장된 값 지우거나 할 필요 없음
		// 모델 객체처럼 attribute 심기
		// 주소에는 값이 출력되지 않음
		return "redirect:2";
	}
}
