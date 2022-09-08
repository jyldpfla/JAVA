package kr.co.greenart.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:kr/co/greenart/config/mysql.properties") // 내가 읽고자 하는 properties의 경로 
//@ComponentScan("kr.co.greenart.model.car") // 컴포넌트 스캔 시켜서 사용하기 위해
// 객체 테스트하려면 객체가 있어야함 -> bean으로 등록하려면, 읽고 있는 RootConfig파일에 bean으로 등록하거나,
// 컴포넌트 표시해두고 스캔해서 알아서 bean으로 등록되도록
@EnableTransactionManagement // 트랜잭션 사용하기 위한 annotation -> 관리자 등록 필요(bean으로 등록)
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
	
	// 트랜잭션 관리자
	@Bean
	@Autowired
	public PlatformTransactionManager txManager(DataSource ds) {
		return new DataSourceTransactionManager(ds);
	}
	
	// mapping 쉽게하기 위해 bean 생성 (+ componentscan 주석처리함)
	@Bean
	@Autowired
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource ds) {
		return new NamedParameterJdbcTemplate(ds);
	}
	
}
