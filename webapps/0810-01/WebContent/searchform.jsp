<%@page import="kr.co.greenart.CountryDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 사용자가 대륙을 선택할 수 있게 --%>
	<%-- 선택한 대륙의 국가들의 이름, 인구를 볼 수 있는 (인구 내림차순 정렬) 페이지 --%>
	
	<% 
		List<String> list = (List<String>) request.getAttribute("list");
	%>
  	<form action="world.jsp">
		대륙 선택 <select name="continent">
			<option value="none">=== 선택 ===</option>
			<%
				for (int i = 0; i < list.size(); i++) {
			%>
			<option value="<%= list.get(i) %>"><%= list.get(i) %></option>
			<!-- value에 ""를 안붙이면 html 필기법에 따라 띄어쓰기에서 끊기고 앞 문자는 value값, 뒤 문자는 html의 속성을 쓰듯이 속성으로 들어가게 됨 -->
			<%
				} 
			%>
		</select>
		순서 선택 <select name="order">
			<option value="none">=== 선택 ===</option>
			<option value="ASC">오름차순</option>
			<option value="DESC">내림차순</option>
		</select>
		<input type="submit" />
	</form> 
</body>
</html>