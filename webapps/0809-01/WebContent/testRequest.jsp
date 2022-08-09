<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>자바 웹 어플리케이션은 각각의 고유한 context root 경로를 가집니다</p>
	<p><%= request.getContextPath() %> </p>
	<!-- 경로 요청 -->
	
	<form action="<%= request.getContentLength() %>/testRequest.jsp">
		<input type="submit" />
	<!-- context root 경로는 변경이 가능 -> 변경되면 주소이름 그대로 쓴 부분 전부 변경해야하므로 표현식 사용-->
	<!-- context root를 /로 설정하면 tomcat 카탈리나 베이스에 이미 설정이 다 된 뒤로 배포돼서 먹히지 않음 -->
	<!-- 그래서 어플리케이션 지웠다가 다시 올리면 됨 -->
	<!-- server에  >누르면 파일들 있는데 삭제하고 , 마우스 우클릭 clean tomcat하고 다시 올리기 -->
	<!-- 많이 사용하는 경로는 /로 설정, context root를 책과 관련된 프로젝트면 /book등으로 명시 -->
	</form>
</body>
</html>