import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class clothesUpdate {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("UPDATE all_product SET product_Image = ? WHERE product_Name = '악세_4'");
			pstmt.setBlob(1, new FileInputStream(new File("C:\\Users\\jyldp\\Desktop\\팀프로젝트2\\TeamProject - codi\\TeamProject2\\resource\\악세사리\\목걸이4.png")));
			
			pstmt.executeUpdate();
			System.out.println("실행 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

}
