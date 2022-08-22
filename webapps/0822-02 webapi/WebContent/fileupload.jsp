<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 선택</title>
</head>
<body>
	<form action="/fileupload" method="post" enctype="multipart/form-data">
		<!-- 파일 타입이 file일 때(binary도 가능)일 때는 encoding type을 multipart/form-data로 지정(파일도 담겨있음을 알려줌)-->
		<input type="file" name="fileupload" />
		<input type="submit" />
	</form>
</body>
</html>