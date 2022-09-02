<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>유저 정보 입력</title>
</head>
<body>
	<f:form modelAttribute="user" method="post">
	<!-- modelAttribute에 addattribute한 값을 넣어줌-->
		<f:errors path="name" /> <!-- 이름에 대한 error 출력 -> path=name -->
		<f:input type="text" path="name" /> 
		<!-- path: user 객체 안에 있는 필드값으로 binding이 됨(기본값으로 들어와져 있음) -->
		<f:errors path="age" />
		<f:input type="number" path="age" />
		<input type="submit" />
	</f:form>
</body>
</html>