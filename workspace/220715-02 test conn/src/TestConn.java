import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.greenart.dbutil.DBUtil;

public class TestConn {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.println("실행 흐름 1");
		
		try {
			conn = DBUtil.getConnection();
			
			System.out.println("실행 흐름 2");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT 1");
			
			if (rs.next()) {
				int result = rs.getInt(1);
				System.out.println("확인 : " + result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		
	}
}
