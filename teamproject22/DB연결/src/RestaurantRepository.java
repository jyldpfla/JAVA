
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class RestaurantRepository {
	// ������� ���� ���
	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		String name = rs.getString("name");
		String number = rs.getString("number");
		String address = rs.getString("address");

		return new Restaurant(name, number, address);
	}

	// �߰� (Create)
	public int add(Restaurant res) throws SQLException {
		String query = "INSERT INTO (name, price, address) VALUES ('" + res.getName() + "','" + res.getNumber() + "','"
				+ res.getAddress() + "')";

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// List ������ (Read)
	public List<Restaurant> list() throws SQLException {
		String query = "SELECT * FROM restaurant";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				list.add(resultMapping(rs));
			}

			return list;
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// Read(pk) ������
	public Restaurant selectByRestaurant(int ID) throws SQLException {
		String query = "SELECT * FROM restaurant WHERE id = " + ID;

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				return resultMapping(rs);
			} else {
				return null;
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		
	}
	
	// Update(pk, �� ��ȣ��, �� ��ȭ��ȣ, �� �ּ�)
	public int update(Restaurant res) throws SQLException {
		String query ="UPDATE restaurant SET name = '" + res.getName() + "', number = '" + res.getNumber() + "', address = '" + res.getAddress() + "'";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
			
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// Delete(pk)
	public int delete(int ID) throws SQLException {
		String query = "DELETE FROM restaurant WHERE ID = " + ID;
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	

}
