package kr.co.greenart;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jmx.snmp.Enumerated;

@WebServlet("/errorhandle")
public class ErrorhandleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> e = request.getAttributeNames();
		// Enumeration : iterator와 비슷하게 있으면 하나 가져옴
		// 설정된 attribute이름만 반환
		
		while (e.hasMoreElements()) { // 하나 더 있는지
			String name = e.nextElement();
			System.out.println(name + " : ");
			System.out.println(request.getAttribute(name)); // 있으면 출력
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
