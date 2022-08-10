package hello;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private int some = 10;
	
	public HelloServlet() {
		super();
		System.out.println("헬로 서블릿 생성자는 언제 호출되나요오?");
		// 요청하면 객체 만들고 계속 그 객체 사용하므로 재요청해도 다시 안나옴
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		some++;
		PrintWriter pw = resp.getWriter();
		pw.println(req.getRequestURI());
		pw.flush();
		System.out.println("필드값: " + some);
	}
	
}
