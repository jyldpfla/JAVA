import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class CodiSetDaoImpl implements CodiSetDao {
	
	@Override
	public int createCodi(CodiSet set) throws SQLException {
		List<String> product = new ArrayList<>();
		product.add(set.product1);
		product.add(set.product2);
		product.add(set.product3);
		product.add(set.product4);
		product.add(set.product5);
		product.add(set.product6);
		product.add(set.product7);
		while(product.contains("")) {
			product.remove(product.indexOf(""));
		}
		System.out.println("프로덕트 값" + product);
		
		String a = "";
		String b = "";
		for (int i = 0; i < product.size(); i++) {
			a += "product" + (i + 1) + ", ";
			b += "?, ";
		}
		System.out.println(a);
		System.out.println(b);
		
		String query = "INSERT INTO codiset_new (" + a + "codiset_image, user_id, tag_theme) VALUES (" + b + "?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			for (int i = 0; i < product.size(); i++) {
				pstmt.setString(i+1, product.get(i));
			}
//			pstmt.setString(1, set.getProduct1());
//			pstmt.setString(2, set.getProduct2());
//			pstmt.setString(3, set.getProduct3());
//			pstmt.setString(4, set.getProduct4());
//			pstmt.setString(5, set.getProduct5());
//			pstmt.setString(6, set.getProduct6());
//			pstmt.setString(7, set.getProduct7());
			pstmt.setBlob(product.size() + 1, set.getCodiset_image());
			pstmt.setString(product.size() + 2, set.getUser_id());
			pstmt.setString(product.size() + 3, set.getTag_theme());
			
			return pstmt.executeUpdate();
			
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}

	}
	
}
