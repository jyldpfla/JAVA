package kr.co.greenart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/after")
public class AfterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		Cookie loginCookie = null;
		if (cookies != null) {
			for(Cookie c : cookies) {
				if (c.getName().equals("loginok")) {
					loginCookie = c;
				}
			}
		}
		
		if(loginCookie != null) { //로그인 되었을 때
			// 로그인이 되었을 때 특정값을 하난 넣어주면 됨
			req.getRequestDispatcher("/WEB-INF/testlogin.jsp").forward(req, resp);
			// servlet으로 해두고 getReqeustDispatcher해둔 이유 : 요청 흐름 제어할 수 있어서
		} else {
			// 사용자에게 로그인하라고 안내를 줌
			resp.sendRedirect("/.idremember.jsp");
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
