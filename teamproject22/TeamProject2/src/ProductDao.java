import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import kr.co.greenart.dbutil.DBUtil;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao{
	private Product resultMapping(ResultSet rs) throws SQLException {
		Integer id = rs.getInt("id");
		String product_Image = rs.getString("product_Image");
		
		return new Product(id, product_Image);
	}
	public List<Product> read() throws SQLException {
		String query = "SELECT id, product_Image FROM all_product WHERE product_Category = 1";
		
		Connection conn  = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;  
		List<Product> topList = new ArrayList<>();
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				topList.add(resultMapping(rs));
			}
			
			
			return topList;
			
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt); 
			DBUtil.closeConn(conn);
		}
		
	}
}
