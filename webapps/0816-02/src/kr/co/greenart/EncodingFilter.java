package kr.co.greenart;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(filterName = "EncodingFilter", urlPatterns = "/*"
			, initParams = @WebInitParam(name = "encoding", value = "UTF-8"))
// /* : 사용자가 보내는 모든 요청에 대한 패턴 매칭 (서블릿에선 /* 사용x)
// * : 모든 것에 대한 패턴 매칭
public class EncodingFilter implements Filter {
	private String encoding;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// 객체가 필요해서 처음 호출될 때 1번 생성
		encoding = filterConfig.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(encoding); // 인코딩 값은 변하지 않으므로, init parameter/ 상수 설정 가능
		response.setCharacterEncoding(encoding);
		
		chain.doFilter(request, response);
	}
}
