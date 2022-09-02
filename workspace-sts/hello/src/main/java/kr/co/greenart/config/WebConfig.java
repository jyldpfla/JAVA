package kr.co.greenart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc // 우리가 사용하는 WegMVC 기능 사용하도록 annotation
@ComponentScan("kr.co.greenart") // 컴포넌트 스캔 (servlet-context.xml에 scan하는 걸 여기서!)
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) { // 정적 자원에 쉽게 접근할 수 있도록 자원 요청을 하면 그대로 자원을 주도록 설정
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/"); // resources폴더에 파일 넣으면 해당 경로로 그대로 사용가능
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) { // ViewResolvers : dispatcher servlet이 view를 찾기 위해 접근하는 객체
		registry.jsp("/WEB-INF/views/", ".jsp"); // 앞 경로의 jsp파일에 등록 -> forward하려고 하는 view를 찾기 위해
	}

}
