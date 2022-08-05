<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
  <!-- page directive : jsp에서 필요한 설정들을 미리 해두는 공간 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		// java 내용 시작되면 html 흐름에서 java 흐름으로 읽어냄
		// scriptlet
		System.out.println("사용자가 jsp 페이지를 요청했습니다.");
		int a = 10;
	%>
	<!-- 다시 html문서 복사하는 흐름으로 돌아옴 -->
	<p> jsp 페이지 입니다. </p>
	<strong><%= 
	java.time.LocalTime.now()
	// 표현식 : 메소드를 읽어서 toString으로 출력해줌
	%></strong><br />
	<p>a의 값은 <%= a %>입니다.</p>
	<%-- 주석처리하는법 
	<p>b의 값은 <%= b // 오류 떠서 파일 보여줄 수 x %>입니다.</p>
	<%
		int b = 20;
	%>
	--%>
</body>
</html>