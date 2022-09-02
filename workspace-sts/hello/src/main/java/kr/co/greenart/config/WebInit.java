package kr.co.greenart.config;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// 설정 다하고 pom.xml 제외하고 다지우기 -> maven이라 error -> pom.xml에 plugin 추가(필기 확인)
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootConfig.class }; // 클래스 배열을 return값으로 넘김
		// root-context.xml 지우고 class파일로 관리
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebConfig.class };
		// servlet-context.xml 파일을 class 파일로 만들어서 관리
	}

	@Override
	protected String[] getServletMappings() { // servlet-mapping하는 것
		return new String[] { "/" };
		// web.xml에 servlet-mapping에 있던 것을 위처럼 대신 써줌
		// <servlet-mapping>
		// <servlet-name>appServlet</servlet-name>
		// <url-pattern>/</url-pattern>
		// </servlet-mapping>
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();// spring에서 만들어둔 필터
		encodingFilter.setEncoding("UTF-8");
		encodingFilter.setForceEncoding(true);
		return new Filter[] { encodingFilter };
	}

}
