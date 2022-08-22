package person;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/api/idcheck")
public class IDCheckServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		// 중복 여부 확인 -> data format을 이용해
		String json;
		if (id.length() > 5) { // 임의 중복 확인 조건
			json = "{\"duplicate\":true}";
		} else {
			json = "{\"duplicate\":false}";
		} 
		resp.setContentType("application/json; charset=utf-8"); // 정해주지 않으면 tomcat이 지정
		// setHeader도 가능
		PrintWriter pw = resp.getWriter();
		pw.println(json);
		pw.flush();
	}
}
