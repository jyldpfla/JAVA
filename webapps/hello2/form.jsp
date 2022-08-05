<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 정보 입력 페이지</title>
</head>
<body>
	<form action="/minee/requestInfo.jsp" method="post">
	<!-- action : 입력양식에 들어간 정보를 보여줄 수 있는 곳으로 옮기라고 명령 -->
	<!-- method : 사용자가 submit을 눌렀을 때 어떠한 방식으로 요청을 만들지 명시 -->
		<label>이름<input type="text" name="name" /></label>
		<label>나이<input type="number" name="age" /></label>
		<label><input type="radio" name="gender" value="male" />남성</label>
		<label><input type="radio" name="gender" value="female" />여성</label>
		<label><input type="checkbox" name="hobby" value ="java">자바</label>
		<label><input type="checkbox" name="hobby" value ="html">하이퍼 텍스트 마트업 랭귀지</label>
		<label><input type="checkbox" name="hobby" value ="css">캐스캐이딩 스타일 시트</label>
		<label><input type="checkbox" name="hobby" value ="javascript">자바스크립트</label>
		<input type="submit" value="입력 완료" />
		<!-- 버튼 누르면 사용자 정보 전송 위해 주소를 정보 담아서 변경, 새 요청이 일어나면서 정보를 browser가 가져감 -->
	</form>
</body>
</html>