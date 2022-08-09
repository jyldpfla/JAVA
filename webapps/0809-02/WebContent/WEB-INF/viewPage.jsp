<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <!-- 값 설정이 되어있지 않으므로 이 페이지 접근 못하도록 해야함 -->
  <!-- 공개되어있는 resource라서 사용자가 접근 가능 -> 접근 못하도록 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자가 볼 페이지</title>
</head>
<body>
	<p>정보</p>
	<p>연산의 결과</p>
	<%-- <%= request.getParameter("result") %> --%>
	<%-- <%= application.getAttribute("result") %> --%>
	<!-- 계속 존재하므로 같은 이름으로 등록하면 안됨 -->
	<%= request.getAttribute("result") %>
	<!-- result 값을 받아오는데 forward로 request, response객체가 고대로 넘어와서 값이 존재 -->
</body>
</html>