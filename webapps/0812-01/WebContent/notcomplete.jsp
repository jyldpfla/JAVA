<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage = "showerror.jsp" %>
<%-- error가 났을 때 보여줄 페이지를 내가 만든 페이지에 연결 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러를 발생시킬 페이지</title>
</head>
<body>
	<%
		String name = null;
		System.out.println(name.toString());
	%>
</body>
</html>