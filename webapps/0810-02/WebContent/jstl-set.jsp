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
	<% request.setAttribute("asdf", "zxcv"); %>
	<c:set var = "jjj" value="value2" scope="request" />
	<!-- 값 설정 -->
	<!-- scope를 통해 request에 값 저장 -->
	
	${ asdf }
	${ jjj }
	<hr />
	<c:url var="searchGoogle" value="http://google.com/search" scope="request">
		<c:param name="q" value="검색파라미터" />
	</c:url>
	<!-- 주소값을 만들어서 값 설정 -->
	<!-- 페이지 스코프는 제일 작은 스코프로, 페이지 안에서만 사용됨 -->
	
	<c:out value="출력할때쓰는데" />
		
	<a href="${ searchGoogle }">구글 검색</a>
	<!-- 알아서 한글 형식에 맞춰서 한글 변환해서 주소에 출력해줌 -->
</body>
</html>