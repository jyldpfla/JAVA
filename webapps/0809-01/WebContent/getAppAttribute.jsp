<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 확인용 페이지 -->
<p>어플리케이션 기본 객체에 설정이 되어있는 값을 확인하는 페이지</p>
<%= application.getAttribute("myStr") %>
<!-- null값이 출력됨 -> 설정된 값이 없다 -->
<!-- 이름 값 설정하는 페이지가 구동되고 난 뒤엔 설정값이 나옴(서버내에서 구동되고 있으면 나옴) -->
<!-- 어플리케이션이 동작하는 동안 계속 존재 -->
<%= application.getAttribute("myInt") %>

</body>
</html>