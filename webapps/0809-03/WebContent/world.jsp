<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국가 목록</title>
</head>
<body>
	<ul>
		<li>국가이름A</li>
		<li>국가이름B</li>
		<li>국가이름C</li>
	</ul>
<%
	//driver load
	Class.forName("com.mysql.cj.jdbc.Driver"); // 패키지 : com.mysql.cj.jdbc, 클래스 : Driver
	// 패키지랑 클래스명은 그때마다 다르므로 검색해서 사용
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	// 페이지 하나에서 연동하려면 html, java가 많이 혼재되어 지저분한 코드가 됨
	try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root"); // 연결, url/user/password값 입력
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT Name FROM world.country");
		
		out.println("<ul>");
		while (rs.next()) {
			// int result = rs.getInt(1);
			// out.println(result == 1 ? "연결 성공" : "연결 실패");
			String name = rs.getString("Name");
			out.println("<li>" + name + "</li>");
		}
		out.println("</ul>");
		
		
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
</body>
</html>