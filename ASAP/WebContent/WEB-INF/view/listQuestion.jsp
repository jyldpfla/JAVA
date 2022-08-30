<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>질문지</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}
h1 {
	text-align: center;
	padding: 40px auto;
}
.question {
	text-align: center;
}
.choice {
	display: flex;
}
.leftchoice {
	/* magin: 0 auto; */
	/* float: left; */
	text-align: center;
}
.rightchoice {
	/* magin: 0 auto; */
	/* float: right; */
	text-align: center;
}
</style>
</head>
<body>
	<h1>${questionPage.topic}</h1>
	<!-- 질문 출력 -->
	<c:forEach var="question" items="${questionPage.question_context}">
		<p class="question">${question.question_text}</p>
		<p>${question.question_id}</p>
	<%-- <c:if test="${question.question_id == optionList.}"></c:if> --%>
	</c:forEach>
	<c:forEach var="option" items="${optionList}">
		<p>${option.value}</p>
	</c:forEach>
	<div class="choice">
		<div class="leftchoice">
			<%-- <p> ${optionList.get(1)} </p> --%>
		</div>
		<div class="rigthchoice">
			<p> 이렇게 저렇게 선택지2 </p>
		</div>
	</div>
	<!-- 이전 버튼 -->
	<c:if test="${questionPage.startPage > 5}">
		<a href="list.do?topic_id=${questionPage.topic_id}&pageNum=${questionPage.startPage - 5}">[이전]</a>
	</c:if>
	<!-- 페이지 이동 -->
	<c:forEach var="pageNum" begin="${questionPage.startPage}" end="${questionPage.endPage}">
		<a href="list.do?topic_id=${questionPage.topic_id}&pageNum=${pageNum}">[${pageNum}]</a>
	</c:forEach>
	<!-- 다음 버튼 -->
	<c:if test="${questionPage.endPage < questionPage.totalPages}">
		<a href="list.do?topic_id=${questionPage.topic_id}&pageNum=${questionPage.startPage + 5}">[다음]</a>
	</c:if>
</body>
</html>