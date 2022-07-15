import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {
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
	
	// 책 전체 출력
	public static void selectAllBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // 사용 후 닫아주어야함
		
		try {			
			conn = makeConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM books"); 
			// select문의 결과값으로 resultset을 반환
			
			// resultset 한줄씩 결과 보기
			while (rs.next()) { // 1번 호출할 때마다 다음줄로 넘어감, 다음줄 있는지 boolean값으로 알려줌
				int id = rs.getInt("bookId"); // 컬럼별로 값 받아오기
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				System.out.println(id + ", " + title + ", " + price);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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
	
	// 책 추가 메소드 만들기 (result가 int형으로 출력되므로 int값을 반환함)
	public static int insertBook(String title, int price) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		
		try {
			conn = makeConnection(); 
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate("INSERT INTO books (title, price) VALUES ("
					+ "'" + title + "', " + price + ");");
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
		return result;
	}
	public static void main(String[] args) {
//		insertBook ("새로운 책입니당", 13000);
		insertBook ("asdf", 0);
		selectAllBook();
	}
}

