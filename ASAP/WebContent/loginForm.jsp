<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}
h1 {
	text-align: center;
	margin: 200px 0 20px 0;
}
.loginbox {
	border: 1px solid black;
	width: 600px;
	height: 200px;
	text-align: center;
	margin: 0px auto;
}
.alignCenter {
	display : block;
	margin: 20px auto;
}
button {
	padding: 0 100px;
}
</style>
</head>
<body>
	<h1>Login</h1>
	<div class="loginbox">
		<form action="./mainpage.jsp">
			<label class="alignCenter">아이디    <input type="text" name="id" /></label> 
			<label class="alignCenter">비밀번호   <input type="text" name="password" /></label>
			<button type = "button"  id = "btnchk" class="alignCenter" onclick="location.href='${request.getContextPath()}signUpForm.jsp'"> 회원가입 </button>
		<input type="submit" class="alignCenter" value = "로그인"/>
		</form>
	</div>
</body>

</html>