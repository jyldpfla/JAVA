<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String choice = request.getParameter("radioB");
		
		if (choice.equals("person")) {
			response.sendRedirect("./persons.jsp");
		} else if (choice.equals("fruit")) {
			response.sendRedirect("./fruit.jsp");
		} else if(choice.equals(null)){
			response.sendRedirect("./want.jsp");
		}
		
	%>
 	
</body>
</html>
