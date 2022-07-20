import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class Main {
	public static void main(String[] args) {
		
		try(Connection conn = DBUtil.getConnection(); // 여러개 사용시 ;로 구분
			// 7v에서 사용, ver별로 더 다양하게 사용 가능
				PreparedStatement pstmt = conn.prepareStatement("");) {
			pstmt.setString(1, "");
			try (ResultSet rs = pstmt.executeQuery();) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} // conn이 다 사용되고 나면 자동적으로 close가 호출됨
		
		try (FileInputStream fis = new FileInputStream("")) {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		Connection conn = null;
//		
//		try {
//			conn = DBUtil.getConnection();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	}
}
