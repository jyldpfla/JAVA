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
	margin: 20px 0;
}
.choice {
	display: flex;
}
.radioB {
	margin: 0 10px;
}
.radio-container {
	text-align: center;
	margin: 20px 0;
}
.submit {
	display: block;
	margin: 10px auto;
	padding: 0 40px;
}
.page-container {
	text-align: center;
}
</style>
</head>
<body>
	<form action="./list.do">
	<h1>${questionPage.topic}</h1>
	<!-- 질문 출력 -->
	<c:forEach var="question" items="${questionPage.question_context}">
			<p class="question">${question.question_text}</h2>
		<c:forEach var="options" items="${optionMap}">
			<c:if test="${question.question_id == options.key}">
				<div class="radio-container">
				<c:forEach var="option" items="${options.value}">
					<label class="radioB"><input type="radio" name="${option.question_id}" value="${option.option_id}" qTopic="${questionPage.topic}">${option.option_text}</label>
					<p>${option.question_id}</p>
					<p>${option.option_id}</p>
				</c:forEach>
				</div>
			</c:if>
		</c:forEach>
	</c:forEach>
	<c:if test="${questionPage.currentPage == questionPage.endPage}">
		<input type="submit" class="submit" name="submit" value="제출" />
	</c:if>
	<div class="page-container">
		<!-- 이전 버튼 -->
		<c:if test="${questionPage.startPage > 5}">
			<a href="list.do?topic_id=${questionPage.topic_id}&pageNum=${questionPage.startPage - 5}">[이전]</a>
		</c:if>
		<!-- 페이지 이동 -->
		<c:forEach var="pageNum" begin="${questionPage.startPage}" end="${questionPage.endPage}">
			<input type="submit" name="move"/>
 			<a href="list.do?topic_id=${questionPage.topic_id}&pageNum=${pageNum}">[${pageNum}]</a>
		</c:forEach>
		<!-- 다음 버튼 -->
		<c:if test="${questionPage.endPage < questionPage.totalPages}">
			<a href="list.do?topic_id=${questionPage.topic_id}&pageNum=${questionPage.startPage + 5}">[다음]</a>
		</c:if>
	</div>
	</form>
</body>
</html>