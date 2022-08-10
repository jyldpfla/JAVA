<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- ul, li 목록 표현 -->
<%
//world.jsp의 분리 ver
	List<String> list = (List<String>) request.getAttribute("countries");
	// request.getAttribute("contries")는 object형으로 상향 캐스팅 되어있으므로 down-casting 해주어야함
%>
<ul>
<% for (int i = 0; i < list.size(); i++) { %>
	<li><%= list.get(i) %></li>
<% } %>
</ul>
</body>
</html>