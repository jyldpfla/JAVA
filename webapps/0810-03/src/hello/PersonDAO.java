package hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PersonDAO {
	public int createPerson(Person person) throws SQLException, ClassNotFoundException {
		String query = "INSERT INTO persons (name, age, gender) VALUES (?, ?, ?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn= null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/persons");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, person.getName());
			pstmt.setInt(2, person.getAge());
			pstmt.setString(3, person.getGender());
			
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
}
