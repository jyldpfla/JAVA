<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>
<%
  	// A페이지는 서버 시간, B페이지는 서버 날짜, C페이지는 랜덤 정수 숫자 표시 만들기
	String alphabet = request.getParameter("alphabet");
	if (alphabet.equals("a")) {
		LocalTime time = LocalTime.now(); 
		request.setAttribute("time", time);
		// request.setAttribute("result", LocalTime.now()); // 이렇게 한 줄로 써도 됨
		request.getRequestDispatcher("A.jsp").forward(request, response);
	} else if (alphabet.equals("b")) {
		LocalDate today = LocalDate.now();
		request.setAttribute("today", today);
		request.getRequestDispatcher("B.jsp").forward(request, response);
	} else if (alphabet.equals("c")) {
		int random = (int) (Math.random() * 1000);
		request.setAttribute("random", random);
		request.getRequestDispatcher("C.jsp").forward(request, response);
	}
	
%>

