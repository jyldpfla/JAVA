<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>값 확인</title>
</head>
<body>
	<p>요청객체 값 확인 : <%= request.getAttribute("reqTest") %></p>
	<!-- 새로 만든 것이라 값이 들어가있지 않음 -->
	<p>세션객체 값 확인 : <%= session.getAttribute("sessionTest") %></p>
	<!-- 새 요청이라 값을 심은 적이 없는데, /session 실행하고 나면 값이 들어가있음 -->
</body>
</html>