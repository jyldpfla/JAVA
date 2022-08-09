<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
 	String continent = request.getParameter("continent");
 	String order = request.getParameter("order");

	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	/* List<String> list = new ArrayList<>(); */
	

try {
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
	stmt = conn.createStatement();
	rs = stmt.executeQuery("SELECT name, population FROM country WHERE continent = '" + continent +  "' ORDER BY population " + order);
	
	while (rs.next()) {
		String name = rs.getString("name");
		int population = rs.getInt("population"); 
		out.println("<br />");
		
		out.println("국가명 : " + name  + "<br />");
		out.println("인구 수 : " + population);
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
%>
