package kr.co.greenart;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect(req.getContextPath() + "/idremember.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String rememberme = req.getParameter("rememberme");
		// 쿠키에 있는 아이디로 로그인할 경우에만 testlogin으로 넘어가도록 made by (승석쨘, aka 천옥석)
		Cookie[] cookies = req.getCookies();
	      if (cookies != null) {
	         for(Cookie c : cookies){
	            if(c.getName().equals("rememberme") && c.getValue().equals(id)){
	               req.getRequestDispatcher("./testlogin.jsp").forward(req, resp);
	            }
	         }
	      }

		// password가 1234면 로그인 성공으로 간주
		if (password.equals("1234")) {
			// 로그인성공
			// 쿠키(아이디)를 담은 성공 메시지 응답
			if (rememberme != null && rememberme.equals("on")) {
				Cookie c = new Cookie("rememberme", URLEncoder.encode(id, "utf-8"));
				c.setMaxAge(60 * 60 * 24);

				resp.addCookie(c);
			}
			Cookie c2 = new Cookie("loginok", "ok");
			// 로그인이 잘 됐음을 알리는 임의의 이름과 값을 전달
			// 이 쿠키값으로 로그인 성공여부를 확인 가능
			
			resp.addCookie(c2);
			
			req.getRequestDispatcher("ok.jsp").forward(req, resp);
		} else {
			// 실패

		}
	}
}
