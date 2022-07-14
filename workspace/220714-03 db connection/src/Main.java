import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		// url 써서 접근하고 싶은 db 사용
		String id ="root";
		String password = "root";
		// id랑 pw도 필요
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 드라이버 사용하려고 씀, 지금 이해 못행
			// ()안 : 패키지.클래스를 나타냄
			System.out.println("드라이버 적재 성공");
			
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결 성공");
			// connection이라는 클래스 객체로 관리
			// mysql드라이버를 통해 데이터베이스 서버 접속을 만들어줄 수 있고 그 값으로 객체 반환
		} catch (ClassNotFoundException e) { // checked exception
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) { // checked exception
			System.out.println("데이터베이스 연결에 실패하였습니다.");
			System.out.println(e.getMessage());
		} finally {
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결을 닫았습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
