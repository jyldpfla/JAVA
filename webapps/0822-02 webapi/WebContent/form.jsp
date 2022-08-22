<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
	<form>
		<input type="text" name="id" id="textid"/><button id="btnchk">아이디 중복확인</button>
		<!-- button을 누르면 submit이 됨(기본적 속성) -->
		<input type="submit" />
	</form>
</body>
<script>
	let elem = document.getElementById("btnchk");
	elem.addEventListener("click", function (e) {
		e.preventDefault(); // 기본으로 설정된 eventlistener는 동작 x(ex.자동으로 submit 발생)
		e.stopPropagation(); // event가 전달
		let textid = document.getElementById("textid").value;

		if (!textid) {
			return;
		}
		
		fetch("http://localhost:8080/api/idcheck?id=" + textid)
		.then((resp) => resp.text())
		.then((json) => {
			let result = JSON.parse(json);
			if (result.duplicate) {
				alert("중복");
			} else {
				alert("사용 가능");
			}
		})
		.catch((e) => console.log(e));
	});
</script>
</html>