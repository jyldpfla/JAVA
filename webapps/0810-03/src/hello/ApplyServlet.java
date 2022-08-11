package hello;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApplyServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// post로 했을 때 한글 깨짐 현상 -> utf-8로 인코딩해주면 됨
		req.setCharacterEncoding("utf-8"); 
		
		String name = req.getParameter("name");
		int age = Integer.parseInt((String) req.getParameter("age"));
		String gender = req.getParameter("gender");
		
		// 입력값 유효한지??
		// 모든 값은 필수
		// 이름, 성 10자
		// 나이 정수
		// 이메일 고유 50자(쌤 db에 있음)
		
		PersonValidator validator = new PersonValidator();
		Map<String, String> errors = new HashMap<String, String>();
		errors.putAll(validator.isValidName(name));
		errors.putAll(validator.isValidAge(String.valueOf(age)));
		// 위처럼 하려면 key값이 다 달라야함, key, value값 기준이면 상관x
	
		
		// 그러면 잘못된 값일 때 사용자에게 뭐라고 해야하지?
		if (errors.size() > 0) {
			req.setAttribute("errors", errors);
			req.getRequestDispatcher("apply.jsp").forward(req, resp);
			// 다시 입력창으로, error 메세지 보여주면서 다시 입력하도록 함
			// error 없으면 아래 흐름으로
		}
		
		Person person = new Person(name, age, gender);
		PersonDAO dao = new PersonDAO();
		try {
			dao.createPerson(person);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
