package hello;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "testMethodServlet", urlPatterns = "/testMethod"
			, initParams = @WebInitParam(name = "name1", value = "value1")
			, loadOnStartup = 1)
//  server가 구동될 때부터 servlet이 만들어지도록 함(int값 : 여러 servlet이 있을 때 순서 지정해서 그 순서로 구동, 없으면 순서x)
public class TestMethodServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		// 서블릿이 없으면 한 번 만들고 계속 사용하는데, 그 때 호출되는 메소드
		// ServletConfig : 생성할 때 필요한 설정들이 담겨있음
		System.out.println("해당 서블릿을 생성할 때 호출됩니다.");
		System.out.println("ServletConfig 객체는 설정한 init param에 접근 가능합니다.");
		System.out.println(config.getInitParameter("name1"));
		// HelloServlet.java실행하면 결과 확인 가능
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("hello.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		doGet(req, resp); // get방식을 이용하도록 써줄 수 있음
		resp.setStatus(405); // 405 : 해당 주소에 요청을 보낸 방식이 허용되지 않음을 알려줌
		// post 방식 지원안함을 알려줄 수 있음
	}

}
