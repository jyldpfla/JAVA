package kr.co.greenart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editcookie")
public class EditCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c = new Cookie("yourname", "edit");
		resp.addCookie(c);
		Cookie c2 = new Cookie("korname", ""); // 삭제될 거라서 보통 value ""빈문자열로 둠
		c2.setMaxAge(0); // 0으로 주면 삭제, 그 외 숫자는 만료기간 설정
		// 초 단위로 기간 설정 가능 (ex. 3600 : 1시간)
		
		resp.addCookie(c2);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
	
}
