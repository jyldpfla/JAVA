<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>포워드 : ${ forwardtest }</p>
	<p>리다이렉트 : ${ redirecttest }</p>
	<!-- return 값으로 가는 곳에는 없으므로 안뜸 -->
	<p>파람 : ${ param.redirecttest }</p>
	<!-- 파라미터 값으로 꺼내야함(주소창에 파라미터로 들어가있으므로) --> 
	<!-- 주소에 내가 심은 값이 다 보임 -->
</body>
</html>