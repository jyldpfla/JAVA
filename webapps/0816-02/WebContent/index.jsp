<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<c:if test="${ empty loginid }">
			<a href="./loginform.jsp">로그인 하기</a> <!-- 로그인이 되어있으면 없어야함 -->
		</c:if>
		<c:if test="${ not empty loginid }">
			<!-- 로그인 되어야 접근 가능 -->
			<a href="./board">게시글 보기</a>
			<a href="">회원정보 보기</a>
			<a href="./logout.jsp">로그아웃</a>
		</c:if>
	</nav>
</html>