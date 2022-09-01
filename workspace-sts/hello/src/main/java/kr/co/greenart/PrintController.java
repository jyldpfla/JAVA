package kr.co.greenart;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// "/print" GET 요청 -> text 입력 가능 form으로 forward
// form.jsp submit 시 "/print" POST 요청 -> 입력한 text 그대로를 볼 수 있는  (view)print.jsp로 forward
// "/print" POST 요청 -> 

@Controller
public class PrintController {
	@RequestMapping(value ="/print", method=RequestMethod.GET)
	public String req(HttpServletRequest request) {
		return "form";
	}
	
	@RequestMapping(value ="/print", method=RequestMethod.POST)
	public String req(HttpServletRequest request, @RequestParam String param, Model model) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		model.addAttribute("result", param);
		
		return "print";
	}
}
