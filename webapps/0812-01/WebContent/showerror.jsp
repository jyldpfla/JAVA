<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%-- page directive에 errorpage임을 써둘 수 있음 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러를 보여줄 페이지</title>
</head>
<body>
	<p>요청 처리 중 에러가 발생했습니다. 다시 시도해주세요.</p>
	<%--<%= exception.getClass().getName() %> // 어떤 에러인지 확인 가능--%>
</body>
</html>