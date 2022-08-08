<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>퀴즈 프로그램</title>
</head>
<body>
	<p>다음 문제의 답을 입력하세요.</p>
	<p>장예림의 키는?(소수점 1자리까지 작성)</p>
	<form action="/minee/quizInfo.jsp" method = "post">
		<label>정답 작성란 <input name="answer" type=number step=0.1></label>
		<input type=submit value="정답 제출">
	</form>
</body>
</html>