package kr.co.greenart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class MyContextListener implements ServletContextListener {
	private static DataSource dataSource;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("웹 어플리케이션 시작 시 이벤트가 발생합니다.");
		
		// 웹 어플리케이션 첫 구동 시 필요한 설정을 할 수 있음.
		ServletContext context = sce.getServletContext();
		// context에는 attribute, parameter 등의 값이 모두 들어가 있음
		
		String driver = context.getInitParameter("driver");
//		System.out.println("설정값 확인 : " + driver);
		String dburl = context.getInitParameter("dburl");
		String dbid = context.getInitParameter("dbid");
		String dbpw = context.getInitParameter("dbpw");
		
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(dburl);
		ds.setUsername(dbid);
		ds.setPassword(dbpw);
		
		dataSource = ds;
		
	}
	
	public static Connection getConnection() throws SQLException {
		// static 이유 : 객체를 우리가 만들 게 아니므로
		return dataSource.getConnection();
		// dataSource 객체가 다 담고 있으므로 ()안 비워져있음
		
	}
} 