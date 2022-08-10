<%@page import="kr.co.greenart.MyMath"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>합</title>
</head>
<body>
<%
	MyMath m = new MyMath();
	// MyMath는 클래스고, jsp파일에서 import 가능하므로 객체 생성 및 호출 가능
	out.println(m.sum(10, 20));
%>
</body>
</html>