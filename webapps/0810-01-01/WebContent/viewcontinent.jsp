<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ not empty list }">
	<!-- empty list는 비어있으면(null, ""등) true 안 비어있으면 false -->
		<ul>
			<c:forEach var="country" items="${list}">
			<!-- list가 그 list인지 el이 알아서 인식해서 가져옴 -->
			<!-- items에서 하나씩 꺼내서 country란 이름으로 바꿈 -->
				<li>${ country.name } ${ country.population }</li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>
