package kr.co.greenart;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// "/print" GET 요청 -> text 입력 가능 form으로 forward
// form.jsp submit 시 "/print" POST 요청 -> 입력한 text 그대로를 볼 수 있는  (view)print.jsp로 forward
// "/print" POST 요청 -> 

@Controller
@RequestMapping(value = "/print") // 상단에 value값 써주면 아래 메소드는 모두 같은 value값 가짐
public class PrintController {
//	@RequestMapping(method=RequestMethod.GET) // 아래와 같음
	@GetMapping
	public String printForm() {
		return "form";
	}

	@PostMapping
	public String printView(HttpServletRequest request, @RequestParam String param, Model model) {
		// 파라미터값은 servlet이 읽어서 갖다주는데 읽어올 때 깨져서 오므로 servlet보다 먼저 동작해서 encoding해야함
		// -> filter인데 web.xml 지웠으므로, WebInit.java에서 처리
		model.addAttribute("result", param);
		
		return "print";
	}
	
	@GetMapping("/sub") // value값으로 mapping 하고자 하는 주소 쓸 수 있음
	// 클래스 상단에 request mapping이 있으면 그 mapping의 sub(하위)경로로 value가 붙음
	public @ResponseBody String sub() { // @ResponseBody : return값이 경로가 아니라 응답 body에 담겨져 보내짐
		return "/print/sub";
	}
}
