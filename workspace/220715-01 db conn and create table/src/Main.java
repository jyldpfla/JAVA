import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 사용할 드라이버 패키지와 이름 쓰기
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root"); // 드라이버와 연결 지어주기 
		
			// table A : 컬럼 B VARCHAR(10) PK
//			String query = "CREATE TABLE A (B VARCHAR(10) PRIMARY KEY)"; // 대소문자 구분X, 테이블 생성
			String query = "DROP TABLE A"; // 테이블 삭제
			stmt = conn.createStatement(); // Statement : 명령어를 수행해주는 객체, 사용하면 닫아주어야함
			
			stmt.executeUpdate(query); // executeUpdate : 수정작업을 동작하고 싶을 때
			// 수정작업 : 추가, 생성, 변경, 삭제
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
