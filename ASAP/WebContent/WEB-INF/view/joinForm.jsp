<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>회원 가입</title>
</head>
<body>
<form action="join.do" method="post">
<style type="text/css">
* {
   margin: 0;
   padding: 0;
}
h1 {
   text-align: center;
   margin: 200px 0 20px 0;
}
.signupbox {
   border: 1px solid black;
   width: 600px;
   height: 300px;
   text-align: center;
   margin: 0px auto;
   padding : 70px 0 0 0;
}
.alignCenter {
   display : block;
   margin: 20px auto;
}
button {
   padding: 0 100px;
}
</style>
</head>
      <body>
         <h1>회원가입</h1>
         <div class="signupbox">
            <form action="join.do" method="post">
               <label class="alignCenter">아이디 <input type="text" name="id"
                  value="${param.id}" /></label>
               <c:if test="${errors.id}">ID를 입력하세요.</c:if>
               <c:if test="${errors.duplicateId}">이미 사용중인 아이디입니다.</c:if>

               <label class="alignCenter">비밀번호 <input type="password"
                  name="password" /></label>
               <c:if test="${errors.password}">암호를 입력하세요. </c:if>

               <label class="alignCenter">비밀번호 확인 <input type="password"
                  name="confirmPassword" /></label>
               <c:if test="${errors.confirmPassword}">확인를 입력하세요. </c:if>
               <c:if test="${errors.notMatch}">암호와 확인이 일치하지 않습니다.</c:if>

               <label class="alignCenter">닉네임 <input type="text"
                  name="nickname" value="${param.name}" /></label>
               <c:if test="${errors.nickname}">닉네임을 입력하세요. </c:if>

               
               <input type="submit" class="alignCenter" onclick="merongmerong" value="회원가입" />
            </form>
      </body>
      
<script language="javascript">  
boolean merong = '<c:out value="${merong}"/>';
function merongmerong() {
	alert(1234);
	if (merong) {
		alert(123);
	}
}
/* function doAction(){

var data = new FormData(form);

$.ajax({
  type: "POST",
  url: "join.do",   // form을 전송할 실제 파일경로
  data: data,

  beforeSend : function() {
     // 전송 전 실행 코드
  },
  success: function (data) {            
        let what= document.getElementsByName("id");
        alert("회원가입 성공! 로그인 창으로 이동합니다.");
     console.log(data);
  },
  error: function (e) {
     // 전송 후 에러 발생 시 실행 코드
     console.log("ERROR : ", e);
  }
});
}; */

</script>

      
</html>