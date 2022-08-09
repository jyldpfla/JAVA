<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- request에 attribue값 설정 후 get으로 값 꺼내오기 -->
	<%
		request.setAttribute("reqAttr", "요청 객체에 존재하는 값");
		request.setAttribute("reqInt", 22);
		// request 객체는 사용자의 한 번의 요청에 대해서만 유지됨
	%>
	
	<%= request.getAttribute("reqAttr") %>
	<%= request.getAttribute("reqInt") %>
</body>
</html>