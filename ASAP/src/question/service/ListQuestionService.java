package question.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jdbc.connection.ConnectionProvider;
import question.dao.QuestionDAO;
import question.model.Question;

public class ListQuestionService {
	private QuestionDAO qdao = new QuestionDAO();
	private int size;
	
	public QuestionPage getQuestionPage(int topic_id, int pageNum) {
		// pageNum = currentPage
		
		// MBTI 질문이면 size = 6, 동물 유형이면 size = 8
		if (topic_id == 3) {
			size = 6;
		} else if (topic_id == 4) {
			size = 1;
		} 
		
		try (Connection conn = ConnectionProvider.getConnection()) {
			int total = qdao.selectCountByTopic(conn, topic_id); // 전체 질문 개수 구하기
			List<Question> question_context = qdao.selectByTopicId(conn, topic_id, (pageNum - 1) * size, size); // pageNum에 해당하는 게시글 목록 구하기
			// 시작행은 0번 기준 (pageNum - 1) * size ( 3페이지를 요청하면 (3 - 1) * 6인 12행부터(13번째 레코드부터)
			
			String topic = qdao.selectTopic(conn, topic_id).getTopic();
			int question_id = qdao.selectTopic(conn, topic_id).getQuestion_id();
			
			return new QuestionPage(topic_id, topic, question_id, total, pageNum, size, question_context);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
