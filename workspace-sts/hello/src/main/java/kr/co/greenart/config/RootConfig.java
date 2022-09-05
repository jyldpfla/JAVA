package kr.co.greenart.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@PropertySource("classpath:kr/co/greenart/config/mysql.properties") // 내가 읽고자 하는 properties의 경로 
public class RootConfig {
	@Value("${jdbc.drivername}") // 설정한 값들을 꺼내와서 사용하고 싶을 때 사용
	// 중괄호 안 이름이 properties에 지정된 이름이어야 불러와짐
	private String drivername;
	// 위 annotation이 있어서 값이 자동으로 들어와서 저장됨
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	
//	@Autowired // JdbcTemplate 파라미터로 dbsource 필요하므로 해결방안 1
//	private DataSource ds;
	
	// db연결 bean 만들기
	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(drivername);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	// jdbc template으로 db 기능 제공 (계속 쓸거라서 bean화)
	@Bean
	@Autowired // 메소드 위에 두면 필요한 메소드를 주입할 수 있음
	public JdbcTemplate jdbcTemplate(DataSource ds) { //  해결방안 2 : 파라미터에 필요한 값을 적으면, datasource 타입인 bean 찾아서 넣어줌
		return new JdbcTemplate(ds);
	}
	
}
