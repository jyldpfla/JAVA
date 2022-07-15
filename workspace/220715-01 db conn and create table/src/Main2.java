import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
	// 드라이버 연결해줘야 하므로 connection 객체 static한 메소드로 빼주기
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id = "root";
		String password = "root";
		
		// 커넥션을 만드는 과정(닫으면 사용 못하므로 사용하고 난 뒤에 닫도록 해야함
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = makeConnection(); 
			stmt = conn.createStatement();
			
			int result = stmt.executeUpdate("INSERT INTO books (title, price) VALUES ('SQL 연습', 17000);");
			// 쿼리문 실행
			
			System.out.println(result + "행이 추가되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
