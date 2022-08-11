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
	<form action="./apply" method="post">
	<!-- post로 보내면 한글이 깨짐 -> servlet에서 해결! -->
		 이름 <input type="text" name ="name" required />
		 나이 <input type="number" name ="age" required />
		 남자 <input type="radio" value="male" name="gender" required />
		 여자 <input type="radio" value="female" name="gender" required />
		 <input type="submit">
		 <c:if test="${ not empty errors }">
		 	<div>
		 		<c:forEach var="message" items="${ errors }">
		 			<p>${ message.value }</p>
		 		</c:forEach>
		 	</div>
		 </c:if>
	</form>
</body>
</html>