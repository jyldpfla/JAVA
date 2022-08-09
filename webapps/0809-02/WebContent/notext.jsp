<%
	int result = 1 + 1;
	request.setAttribute("result", result);
	request.getRequestDispatcher("/WEB-INF/viewPage.jsp").forward(request, response);
	// getRequestDispatcher : forward할 수 있는 객체, 페이지 흐름을 이동시킬 수 있음
	// redirect는 페이지명이 변경되지만, getRequestDispatcher는 변경되지 않음
	// forward : 내가 쓰는 요청 객체와 응답객체를 그대로 가지고 가라는 명령
	
	//response.sendRedirect(".viewPage.jsp" + result);
	// 응답을 받은 후 새로 요청하므로 값이 사라짐
	// 주소값에 값 넣어둠
	// 사용자는 이 페이지를 거쳤다가 감
%>
