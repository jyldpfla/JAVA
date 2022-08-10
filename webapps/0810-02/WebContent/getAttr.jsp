<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>${ requestScope.name1 }</p>
	<!-- requestScope.어트리뷰트이름 : request객체의 어트리뷰트값을 가져옴 -->
	<p>${ requestScope.name2 }</p>
	<p>${ applicationScope.name3 }</p>
	<!-- applicationScope.어트리뷰트이름 : application객체의 어트리뷰트값을 가져옴 -->
	<p>${ requestScope.name4 }</p>
	<p>${ applicationScope.name4 }</p>
	<hr />
	<p>${ name1 }</p>
	<p>${ name2 }</p>
	<p>${ name3 }</p>
	<p>${ name4 }</p>
	<!-- page, request, session을 다루는 scope가 존재 -->
	<!-- 영역 크기(큼) app > session > Req > page (작음) -->
	<!-- 좁은 범위부터 찾아서 좁은 범위의 값을 가져옴 -->
	<hr />
	<p>${ null }</p>
	<!-- 없으면 공백 출력 -->
</body>
</html>