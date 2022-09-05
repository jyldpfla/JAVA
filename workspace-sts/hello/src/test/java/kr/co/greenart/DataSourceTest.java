package kr.co.greenart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)// spring text위해 사용
@ContextConfiguration(classes = {kr.co.greenart.config.RootConfig.class} )
// db 설정 해 놓은 클래스 파일을 읽어올 수 있도록 패키지명, 클래스명 썼음
public class DataSourceTest {
	@Autowired
	private DataSource ds;
	
	@Test
	public void testDS() {
		assertNotNull(ds); 
	}
	
	@Test
	public void testConnection() throws SQLException {
		// 닫고 열지 않아도 됨
		try (Connection conn = ds.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT 1")) {
			
			rs.next();
			int result = rs.getInt(1);
			
			assertEquals(1, result);
		}
	}
}
