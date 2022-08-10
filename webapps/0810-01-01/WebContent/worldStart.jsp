<%@page import="kr.co.greenart.Country"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<%
	// 사용자 요청 확인
	CountryDAO dao = new CountryDAO();
	List<String> list = dao.getContinents();
	// DB 값 받아오기
	
	request.setAttribute("list", list);
	request.getRequestDispatcher("searchform.jsp").forward(request, response);
	// 페이지 흐름 이어갈 수 있도록
%>