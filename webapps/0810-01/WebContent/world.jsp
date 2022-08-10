<%@page import="kr.co.greenart.Country"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<%
	String continent = request.getParameter("continent");
	String order = request.getParameter("order");
	// 사용자 요청 확인
	CountryDAO dao = new CountryDAO();
	List<Country> list = dao.getCountryByContinent(continent, order);
	// DB 값 받아오기
	
	request.setAttribute("list", list);
	request.getRequestDispatcher("viewcontinent.jsp").forward(request, response);
	// 페이지 흐름 이어갈 수 있도록
%>