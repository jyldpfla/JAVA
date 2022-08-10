<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>JSP Expression Language</p>
	${ "qwer" }
	<%-- ${} el : jsp 페이지에서 출력을 도와줌 --%>
	${ 123 }
	${ 55.432 }
	${ true }
	<br />
	${ 1 + 2 }
	${ true && false }
	<%-- 연산, 관계연산 모두 가능 --%>
	<br />
	${ pageContext.request.requestURI }
	<!-- el에서 getter가 있는 속성이면 get을 쓰지 않고 이름만 쓰면 됨 (모든 객체들 대상) -->
</body>
</html>