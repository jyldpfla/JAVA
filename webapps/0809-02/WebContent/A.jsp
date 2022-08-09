<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> 현재 시간 빠밤! </p>
	<%= request.getAttribute("time") %>
	<%--<%= result %> result로 쓴 값 받아오기, 위랑 같음--%>
</body>
</html>