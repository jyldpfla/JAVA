<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 위 주소 <ctrl><space>하면 3번재꺼!, prefix : 사용할 라이브러리를 어떤 이름으로 사용할지 명명 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- jstl의 태그 이용해서 반복해보기 -->
	<c:forEach var="i" begin="1" end="10">
	<!-- i라는 값을 el에서 쓸 수 있도록 해줌 -->
		<c:if test="${ i % 2 == 0 }">
		<!-- text라는 attribute에 조건 -->
			<p>${ i }</p>
		</c:if>
	</c:forEach>
	<hr/>
	<c:choose>
		<c:when test="false">
			<p>첫 번째 조건이 참일 때</p>
		</c:when>
		<c:when test="false">
			<p>두 번째 조건이 참일 때</p>
		</c:when>
		<c:otherwise>
			<p>모든 조건이 참이 아닐 때</p>
			<!-- otherwise : else, default와 비슷, 없어도 됨 -->
			<!-- 여기서는 html코드가 올 것으로 컴파일러가 예상을 하므로 해석이 가능하지만 -->
		</c:otherwise>
		<%-- 여기는 html이 아니라 java로 번역할 파트가 올 것으로 예상하므로 html 주석을 넣으면 해석할 수 없기 때문에 오류가 남 --%>
	</c:choose>
	<%-- jstl은 태그로 써져있어서 html으로 보이지만, 태그의 형태를 한 jsp에서만 쓸 수 있는 custom tag라서 java코드로 번역이 되는데 html주석은 해석할 수 없기때문에  --%>
	
	<%-- if else를 대신할 태그, switch case와 비슷, 첫 조건이 맞으면 break걸려서 다른게 맞아도 실행x --%>
</body>
</html>