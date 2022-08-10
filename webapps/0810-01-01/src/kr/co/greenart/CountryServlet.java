package kr.co.greenart;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter pw = resp.getWriter(); // reponse객체에 getWriter가 있고 out할걸 PrintWriter형으로 알려줌 
//		pw.println("Hello Servlet");
//		pw.flush();
		// println갖고 html 태그 써서 만들어낼 수 있음
		// servlet에서는 보통 사용자에게 보여주는 화면을 만드는 것을 하지 않음 -> jsp 담당
		// jsp와 연결 필요
		
//		req.setAttribute("title", "서블릿에서 설정한 제목");
//		req.setAttribute("message", "서블릿에서 설정한 메시지");
//		// 요청 주소에 요청 흐름을 제어
//		req.getRequestDispatcher("messageoutput.jsp").forward(req, resp);
//		// jsp파일로 흐름이 넘어감
		
		String continent = req.getParameter("continent");
		String order = req.getParameter("order");
		// 사용자 요청 확인
		CountryDAO dao = new CountryDAO();
		List<Country> list = null;
		try {
			list = dao.getCountryByContinent(continent, order);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// DB 값 받아오기
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("viewcontinent.jsp").forward(req, resp);
		// 페이지 흐름 이어갈 수 있도록
		
		
	}
	
}
