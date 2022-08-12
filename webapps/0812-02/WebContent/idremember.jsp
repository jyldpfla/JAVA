<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("rememberme")) {
				request.setAttribute("idvalue", URLDecoder.decode(c.getValue(), "utf-8"));
			}
		}
	%>
	<!-- cookie를 이용해 id 기억하기 -->
	<form action="./login" method="post">
		<input type="text" name="id" value="${ idvalue }" /> 
		<input type="password" name="password" />
		<input type="checkbox" name="rememberme" />
		<input type="submit" />
	</form>
	<a href="./testlogin.jsp">로그인해야 들어올 수 있어!</a>
</body>
</html>