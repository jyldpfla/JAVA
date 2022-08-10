<%@page import="kr.co.greenart.Country"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	List<Country> countries = (List<Country>) request.getAttribute("list"); 	
 	
	for(int i = 0; i < countries.size();i++) {
		out.println("<br/>" + countries.get(i));
		// out.println() 써도 web browser에서 띄어쓰기가 아무리 많아도 한 칸으로 축약해서 인식하므로 <br /> 써야 띄어쓰기 됨
	}
%>
