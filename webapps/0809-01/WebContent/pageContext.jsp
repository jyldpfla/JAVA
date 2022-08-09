<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>context가 뭔가요?</p>
	<!-- 개발자들이 사용할 수 있는 정보들을 모아두는 공간, 객체, 어플리케이션 하나 -->
	<%
		ServletRequest req = pageContext.getRequest(); 
		// pageContext객체를 통해 get 메소드로 페이지에서 사용하는 요청 가져올 수 있음
		// getter로 정보 가져올 수 있음
		out.println(req == request);
		// 기존 request와 동등한지 확인했을 때 같은 객체임을 확인 가능
		out.println("<br />");
		ServletResponse resp = pageContext.getResponse();
		out.println(resp == response);
	%>
</body>
</html>