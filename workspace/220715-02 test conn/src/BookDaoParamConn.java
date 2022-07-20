import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class BookDaoParamConn {
	// bookdao를 사용하는 객체가 열고닫고를 관리해서 transaction 사용하도록
	public int update(Connection conn, String title, int price) throws SQLException {
	// connection 객체는 닫지 않고 그대로  둘 거임!
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("UPDATE books SET price = ? WHERE title like ?");
			pstmt.setInt(1, price);
			pstmt.setString(2, title);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
		
	}
	;
	public int insert(Connection conn, String title, int price) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("INSERT INTO books (title, price) VALUES (?, ?)");
			pstmt.setString(1, title);
			pstmt.setInt(2, price);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
	};
	public int delete(Connection conn, int bookId) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("DELETE FROM books WHERE bookId = ?");
			pstmt.setInt(1, bookId);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
	};
	
}
