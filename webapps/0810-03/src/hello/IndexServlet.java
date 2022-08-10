package hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String choice = req.getParameter("choice");
		
		if (choice.equals("apply")) {
			req.getRequestDispatcher("apply.jsp").forward(req,resp);
		} else if (choice.equals("edit")) {
			req.getRequestDispatcher("edit.jsp").forward(req,resp);
		}
		
	}
}
