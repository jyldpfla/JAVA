import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import kr.co.greenart.dbutil.DBUtil;

public class CodiSetDaoImpl implements CodiSetDao {
	
	@Override
	public int createCodi(String product1, String product2, String product3, String product4, String product5, String product6, String product7, String product8, Blob codiset_image, String user_id, String tag_theme) throws SQLException {
		String query = "INSERT INTO codiset_new (product1, product2, product3, product4, product5, product6, product7, product 8, codiset_image, user_id, tag_theme) VALUES (?, ?, ?, ? ,? ,?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, product1);
			pstmt.setString(2, product2);
			pstmt.setString(3, product3);
			pstmt.setString(4, product4);
			pstmt.setString(5, product5);
			pstmt.setString(6, product6);
			pstmt.setString(7, product7);
			pstmt.setString(8, product8);
			pstmt.setBlob(9, codiset_image);
			pstmt.setString(10, user_id);
			pstmt.setString(11, tag_theme);
			
			return pstmt.executeUpdate();
			
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}

	}
	
}
