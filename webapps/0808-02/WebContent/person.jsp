<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		입력폼. 필수!!!!!
		사용자 이름
		사용자 나이
	 -->
	 <form action="personresult.jsp">
	 	사용자 이름 <input type="text" name="name" required>
	 	사용자 나이 <input type="number" name="age" required>
	 	<input type="submit" value="제출">
	 </form>
</body>
</html>