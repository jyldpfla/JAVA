<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>질문지로 가보자아!</title>
</head>
<body>
	<p>request 보낼려고 만든 페이지</p>
	<form action="question/list.do" method="post">
		<p>request 값으로 topic_id 받아올 거임!</p>
		<input type="text" name="topic_id">
		<input type="submit">
	</form>
</body>
</html>