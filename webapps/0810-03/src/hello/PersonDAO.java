package hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
	public int createPerson(Person person) throws SQLException, ClassNotFoundException {
		String query = "INSERT INTO persons (name, age, gender) VALUES (?, ?, ?)";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, person.getName());
			pstmt.setInt(2, person.getAge());
			pstmt.setString(3, person.getGender());
			
			// 입력값 유효한지 확인 필요

			return pstmt.executeUpdate();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public List<Person> readPerson() throws SQLException, ClassNotFoundException {
		String query = "SELECT name, age, gender FROM persons";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Person> list = new ArrayList<>();

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				list.add(new Person(name, age, gender));
			}

		} finally {
			if(rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return list;
	}
}
