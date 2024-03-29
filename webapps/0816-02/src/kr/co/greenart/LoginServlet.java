package kr.co.greenart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginservice")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// password는 임의의 값 설정
		if (password != null & password.equals("qwer")) { // 로그인 성공
			HttpSession session = request.getSession();
			session.setAttribute("loginid", id);
		}
		
		request.getRequestDispatcher("/loginresult.jsp").forward(request, response);
	}
}
