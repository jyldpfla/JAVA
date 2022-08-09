<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 보는 페이지 -->
	<%= request.getAttribute("reqAttr") %>
	<!-- 보는 페이지부터 켜면 설정값 없으므로 null -->
	<%= request.getAttribute("reqInt") %>
</body>
</html>