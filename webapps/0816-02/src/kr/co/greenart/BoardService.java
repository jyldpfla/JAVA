package kr.co.greenart;

import java.sql.SQLException;
import java.util.List;

import javax.management.RuntimeErrorException;

public class BoardService {
	private BoardDAO dao;
	
	public BoardService(BoardDAO dao) {
		this.dao = dao;
	}

	// 목록<게시글> 게시글 보기 서비스() - 입력값 x, 출력값 게시글목록
	public List<BoardArticle> 게시글목록보기서비스() {
		// 필요한 로직을 포함하는 문장들~~ (트랙잭션 제어 등)
		
		try {
			// 결과 반환
			return dao.게시글목록가져오기(); // 결과 반환
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("데이터를 읽을 수 없습니다");
		} 
	}
		
	// 게시글 적기 서비스
	// 게시글 수정 서비스
	// 게시글 하나 내용 보기 서비스
}
