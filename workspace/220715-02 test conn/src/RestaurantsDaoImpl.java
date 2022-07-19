import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class RestaurantsDaoImpl implements RestaurantsDao {
	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		// 문자열 형태 변환 -> parsing
		// 객체의 형태로 된 걸 다른 객체로 변환 -> mapping
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String number = rs.getString("number");
		String address = rs.getString("address");
		
		return new Restaurant(id, name, number, address);
	}
	
	// 여러 값 한 번에 넣기
	public int[] create(List<Restaurant> list) throws SQLException {
		String query = "INSERT INTO restaurant (name, number, address) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			// 같은 sql문을 반복해서 넣기 => 배치작업 : 같은 작업을 반복하는 것을 한 번에 하도록
			for(Restaurant r : list) {
				pstmt.setString(1, r.getName());
				pstmt.setString(2, r.getNumber());
				pstmt.setString(3, r.getAddress());
				pstmt.addBatch(); // 값 하나씩 넣기
			}
			
			return pstmt.executeBatch(); // int값 여러개를 배열로 반환
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
	
	@Override
	public int create(String name, String number, String address) throws SQLException {
		String query = "INSERT INTO restaurant (name, number, address) VALUES (?, ?, ?)"; 
		// 파라미터 개수에 맞춰 ? 삽입
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		// Statement처럼 명령주는 것은 동일, but 미리 준비하고 그 후에 실행
		// 준비 : ?를 포함하는 sql문이 있다면, 파라미터로 값을 받아와서 안에 값을 넣어주는 역할
		// 값을 다 넣고 나면 실행
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query); // 쿼리문 준비 시켜두기
			pstmt.setString(1, name); // 순서, 값
			pstmt.setString(2, number);
			pstmt.setString(3, address);
			
			return pstmt.executeUpdate(); // 이미 쿼리 넣어서 준비되어있기 때문에 ()안 비움
		} finally {
			DBUtil.closeStmt(pstmt); // 사용 후 닫아주어야함
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
			pstmt = conn.prepareStatement(query); // 쿼리문 준비 시켜두기
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
		String query = "SELECT * FROM restaurant WHERE id = ? "; // 파라미터가 와야할 자리에 ?
		
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
