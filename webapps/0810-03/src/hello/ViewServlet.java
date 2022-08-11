package hello;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PersonDAO dao = new PersonDAO();
		List<Person> list = new ArrayList<>();
		
		try {
			list = dao.readPerson();
			
			req.setAttribute("list", list);
			req.getRequestDispatcher("view.jsp").forward(req, resp);
			
			// 응답 끝내고 새요청으로 보낼 때, 목록 페이지로 보내기
//			resp.sendRedirect(req.getContextPath() + "list");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
