package kr.co.greenart;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// 서블릿이 요청 객체를 다루기 전
		System.out.println("doFilter 전!!");

		System.out.println("세션 값을 확인합니다.");
		HttpSession session = ((HttpServletRequest) req).getSession();
		// 자식으로 형변환 해주어야함
		Object loginid = session.getAttribute("loginid");
		// 원래흐름
		if (loginid != null) {
			System.out.println("로그인 확인되었습니다. 게시판 목록으로 forward합니다.");
			chain.doFilter(req, resp);
		} else {
			System.out.println("로그인 되지 않은 유저.");

//			resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			// 코드만 설정하고 error페이지 이동은 발동되지 않음
//			// SC_UNAUTHORIZED : 응답 코드 401번, 인증이 되어 있지 않을 때 보여주는 코드 
//			req.getRequestDispatcher("needlogin.jsp").forward(req, resp);

			((HttpServletResponse)resp).sendError(401); // error페이지 이동까지 발동됨
		}

		// 서블릿이 요청을 처리하고 응답 보내기 전
		System.out.println("doFilter 후!!");
	}
}
