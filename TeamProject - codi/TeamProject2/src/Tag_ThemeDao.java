import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class Tag_ThemeDao {
	public String[] readTag() throws SQLException {
		String query = "SELECT codi FROM tag_theme";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<String> tags = new ArrayList<>();
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String tag = rs.getString("codi");
				tags.add(tag);
			}
			
			// 배열 다운캐스팅
			Object[] tagAll = new String[tags.size()];
			tagAll = tags.toArray();
			String[] tag = (String[]) tagAll;
			
			return tag;
			
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
		
		
		
		
		
	}
}
