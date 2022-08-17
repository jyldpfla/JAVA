package kr.co.greenart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
	// 로거 객체 만들어주기
	private final static Logger logger = LoggerFactory.getLogger(BoardServlet.class);
	
	private BoardService service;
	// 게시글 보기 전체적인 로직을 가진 객체로 BoardService를 생성
	// 객체의존성이 생김(연결을 위해 필드로 객체 선언해야함)
	// getter, setter나 선택자 만들어주어야함

	@Override
	public void init() throws ServletException {
		 service = new BoardService(new BoardDAO());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 필터와 흐름만 이어주면 됨
//		System.out.println("사용자가 GET방식의 요청을 하였습니다.(게시판 목록)");
		logger.info("로거를 통해 메세지를 남깁니다,");
		// 간단한 프로그램 흐름, 일반적인 정보 알려줄 때 사용
		logger.info("사용자가 Get 요청함. (게시판 목록)");
		
		List<BoardArticle> articles = service.게시글목록보기서비스();
		req.setAttribute("articles", articles);
		
		req.getRequestDispatcher("/WEB-INF/articles.jsp").forward(req,resp);
		// articles 숨기기 위해 WEB-INF 폴더에(사용자가 주소로 직접 요청 불가)
		// request객체가 resource 위치 아므로 경로지정 따로 더 안해줘도 됨
		
	}

}
