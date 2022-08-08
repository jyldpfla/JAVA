<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<String> list = new ArrayList<>();
	for (int i = 0; i < 100; i++) {
		list.add("book" + i);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 여러 줄로 적어도 여러 공백을 한 개의 공백으로 치환시켜서 한 줄로 출력 -->
	<%
		String pageStr = request.getParameter("page");
		int pageNum = Integer.parseInt(pageStr);

		int start = (pageNum -1) * 10;
		
		for(int i = start; i < start + 10; i++) {
			out.print(list.get(i));
		}
		
	%>
</body>
</html>