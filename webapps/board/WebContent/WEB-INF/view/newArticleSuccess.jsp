<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
</head>
<body>

	게시글을 등록했습니다.
	<br>
	${ctxPath = pageContext.request.contextPath ; ""}
	<!-- ; "" 이게 없으면 ctxPath가 출력되는데, el문법상 저렇게 써두면 ""때문에 빈문자열이 출력됨. ''도 가능 -->
	<a href="${ctxPath}/article/list.do">[게시글목록보기]</a>
	<a href="${ctxPath}/article/read.do?no=${newArticleNo}">[게시글내용보기]</a>
</body>
</html>