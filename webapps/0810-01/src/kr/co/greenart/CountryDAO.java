package kr.co.greenart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CountryDAO {
	public List<String> getContinents() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<String> list = new ArrayList<>();

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT DISTINCT continent FROM country");

			while (rs.next()) {
				String continent = rs.getString("continent");
				list.add(continent);
			}

		} finally {
			if (rs != null) {
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

	public List<Country> getCountryByContinent(String continent, String order) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Country> list = new ArrayList<>();

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT name, population FROM country WHERE continent = '" + continent
					+ "' ORDER BY population " + order);

			while (rs.next()) {
				String name = rs.getString("name");
				int population = rs.getInt("population");

				list.add(new Country(name, population));
			}

		} finally {
			if (rs != null) {
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
