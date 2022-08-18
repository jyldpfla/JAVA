package mvc.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;
import mvc.command.NullHandler;

public class ControllerUsingURI extends HttpServlet {
	// <커맨드, 핸들러인스턴스> 매핑 정보 저장
	private Map<String, CommandHandler> commandHandlerMap = new HashMap<>();
	
	public void init() throws ServletException {
		String configFile = getInitParameter("configFile");
		Properties prop = new Properties();
		String configFilePath = getServletContext().getRealPath(configFile);
		try (FileReader fis = new FileReader(configFilePath)) {
			prop.load(fis);
		}  catch (IOException e) {
			throw new ServletException(e);
		}
		Iterator keyIter = prop.keySet().iterator();
		while (keyIter.hasNext()) {
			String command = (String) keyIter.next();
			String handlerClassName = prop.getProperty(command);
			try {
				Class<?> handlerClass = Class.forName(handlerClassName);
				// <?> : generic, ?는 아무것도 아닌형, object형과 비슷하지만 다름
				// Class.forName() : ()안의 것을 투영(reflection)해서 객체를 만드는 것
				// 클래스파일을 객체화
				CommandHandler handlerInstance = (CommandHandler) handlerClass.newInstance();
				// instance생성 가능 -> loginservlet, logoutservlet 인스턴스 생성하는데
				// , commandhandler를 부모로 implements하므로 다운캐스팅할 때 loginservlet과 logoutservlet이 제대로 implements 되어있지 않으면
				// logout을 형변환하려고 했는데 못해서 오류가 남
  
                // 즉, init으로 생성된 CommandHandler는 (init이므로 servlet이 필요할 때 바로 처음 생성되고, 계속 쓰여짐, init이 중요)
                // .newInstance로 로그인핸들러와 로그아웃핸들러의 인스턴스를 만드는데
                // 만들 때 로그아웃의 형이 logouthandler형이라서 오류가 난 것이다
                // 즉 implements commandhandler를 안해서 형이 다르므로 다운이 안돼서 오류
				commandHandlerMap.put(command,handlerInstance);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				throw new ServletException(e);
			}
		}
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getRequestURI();
		if (command.indexOf(request.getContextPath()) == 0) {
			command = command.substring(request.getContextPath().length());
		}
		CommandHandler handler = commandHandlerMap.get(command);
		if (handler == null) {
			handler = new NullHandler();
		}
		String viewPage = null;
		try {
			viewPage = handler.process(request, response);
		} catch (Throwable e) {
			throw new ServletException(e);
		}
		if (viewPage != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}
	}
}
