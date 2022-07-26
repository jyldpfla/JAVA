
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class RestaurantsDaoImpl implements RestaurantsDao {
	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		// ���ڿ� ���� ��ȯ -> parsing
		// ��ü�� ���·� �� �� �ٸ� ��ü�� ��ȯ -> mapping
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String number = rs.getString("number");
		String address = rs.getString("address");
		
		return new Restaurant(id, name, number, address);
	}
	
	// ���� �� �� ���� �ֱ�
	public int[] create(List<Restaurant> list) throws SQLException {
		String query = "INSERT INTO restaurant (name, number, address) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			// ���� sql���� �ݺ��ؼ� �ֱ� => ��ġ�۾� : ���� �۾��� �ݺ��ϴ� ���� �� ���� �ϵ���
			for(Restaurant r : list) {
				pstmt.setString(1, r.getName());
				pstmt.setString(2, r.getNumber());
				pstmt.setString(3, r.getAddress());
				pstmt.addBatch(); // �� �ϳ��� �ֱ�
			}
			
			return pstmt.executeBatch(); // int�� �������� �迭�� ��ȯ
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
	
	@Override
	public int create(String name, String number, String address) throws SQLException {
		String query = "INSERT INTO restaurant (name, number, address) VALUES (?, ?, ?)"; 
		// �Ķ���� ������ ���� ? ����
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		// Statementó�� ����ִ� ���� ����, but �̸� �غ��ϰ� �� �Ŀ� ����
		// �غ� : ?�� �����ϴ� sql���� �ִٸ�, �Ķ���ͷ� ���� �޾ƿͼ� �ȿ� ���� �־��ִ� ����
		// ���� �� �ְ� ���� ����
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query); // ������ �غ� ���ѵα�
			pstmt.setString(1, name); // ����, ��
			pstmt.setString(2, number);
			pstmt.setString(3, address);
			
			return pstmt.executeUpdate(); // �̹� ���� �־ �غ�Ǿ��ֱ� ������ ()�� ���
		} finally {
			DBUtil.closeStmt(pstmt); // ��� �� �ݾ��־����
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public List<Restaurant> read() throws SQLException {
		String query = "SELECT * FROM restaurant";
		
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query); // ������ �غ� ���ѵα�
			rs = pstmt.executeQuery(); 
			
			while (rs.next()) {
				
				
				list.add(resultMapping(rs));
			}
			
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt); 
			DBUtil.closeConn(conn);
		}
		
		return list;
	}

	@Override
	public Restaurant read(int id) throws SQLException {
		String query = "SELECT * FROM restaurant WHERE id = ? "; // �Ķ���Ͱ� �;��� �ڸ��� ?
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return resultMapping(rs);
			}
			
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
				return null;
	}

	@Override
	public int update(int id, String name, String number, String address) throws SQLException {
String query = "UPDATE restaurant SET name = ?, number = ?, address = ? WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, number);
			pstmt.setString(3, address);
			pstmt.setInt(4, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public int delete(int id) throws SQLException {
		String query = "DELETE FROM restaurant WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

}
