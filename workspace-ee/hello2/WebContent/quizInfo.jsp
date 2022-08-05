<%@page import="java.net.URLDecoder"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8"); // encoding 버전 설정, 한글 깨지지 않도록
%>

사용자 정답 = <%= request.getParameter("answer") %> <br />
<%
if(Double.valueOf(request.getParameter("answer")) == 170.8) {
%>
어뜨케 알아찌
<%
} else {
%>
틀렸넹 나한테 관심을 좀 가져야겠땨
<%	
}
%>
<br />
</body>
</html>