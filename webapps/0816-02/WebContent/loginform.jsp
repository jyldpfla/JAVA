<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 양식</title>
</head>
<body>
	<form action="${ pageContext.request.contextPath }/loginservice" method="post">
	<!-- 현재 경로라 ./ 이렇게 해도 됨 -->
		<input type="text" name="id"/>
		<input type="password" name="password"/>
		<input type="submit"/>
	</form>
</body>
</html>