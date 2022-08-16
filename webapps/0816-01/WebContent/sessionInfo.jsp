<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>세션 아이디 : <%= session.getId() %></p>
	<p>세션 생성시간 : <%= new Date(session.getCreationTime()) %></p>
	<p>마지막으로 세션에 접근한 시간 : <%= new Date(session.getLastAccessedTime()) %></p>
	<!-- 세션은 한 번 만들어지면 꽤 오랜시간 유지됨, 같은 아이디로 한 번 더 접근하면 유지해줌 but 특정 시간이 지날동안 같은 id로 접근하지 않으면 그 때 지움 -->
</body>
</html>