package kr.co.greenart.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.greenart.controller.MyInterceptor;

@Configuration
@EnableWebMvc // 우리가 사용하는 WegMVC 기능 사용하도록 annotation
@ComponentScan("kr.co.greenart") // 컴포넌트 스캔 (servlet-context.xml에 scan하는 걸 여기서!)
public class WebConfig implements WebMvcConfigurer { // WebMvcConfigurer를 implements하므로 web환경에서 구동되도록 되어있음
	@Autowired
	private MyInterceptor interceptor; // interceptor 의존성 만들기
	
	// multipart 다루는 bean, Apache Commons FileUpload » 1.4있어야 함
	@Bean
	public MultipartResolver multipartResolver() { // spring에서 multipart를 다룰 수 있도록 만든 resolver
		// multipartresolver를 찾을 때 type이 아닌 이름으로 찾아서 이름을 multipartResolver 이렇게 지정해줘야함
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding("UTF-8");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) { // 정적 자원에 쉽게 접근할 수 있도록 자원 요청을 하면 그대로 자원을 주도록 설정
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/"); // resources폴더에 파일 넣으면 해당 경로로 그대로 사용가능
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) { // ViewResolvers : dispatcher servlet이 view를 찾기 위해 접근하는 객체
		registry.jsp("/WEB-INF/views/", ".jsp"); // 앞 경로의 jsp파일에 등록 -> forward하려고 하는 view를 찾기 위해
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 인터셉터 등록
		registry.addInterceptor(interceptor).addPathPatterns("/my/**"); // my로 매핑되는 모든 컨트롤러를 대상으로 실행
		// addPathPatterns(주소 패턴) : 주소 패턴에 맞으면 실행
	}
}
