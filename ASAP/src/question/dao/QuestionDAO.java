package question.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;
import question.model.Question;

public class QuestionDAO {
	private Question resultMapping_S(ResultSet rs) throws SQLException {
		int question_id = rs.getInt("question_id");
		int topic_id = rs.getInt("topic_id");
		String question_text = rs.getString("question_text");
		
		return new Question(question_id, topic_id, question_text);
	}
	
	// 토픽 별 전체 질문 개수 구하는 메소드
	public int selectCount(Connection conn, int topic_id) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("SELECT COUNT(*) FROM question_t WHERE topic_id = ?");
			pstmt.setInt(1, topic_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
			return 0;
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}
	
	// request로 받아온 topic_id와 파라미터 값으로 startRow, size를 받아서 지정 범위의 질문들을 불러옴
	public List<Question> selectByTopicId(Connection conn, int topic_id, int startRow, int size) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Question> questionList = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement("SELECT * FROM question_t where topic_id = ? limit ?,?");
			pstmt.setInt(1, topic_id);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, size);
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				questionList.add(resultMapping_S(rs));
			}
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return questionList;
	}
	
	// topic_id, topic 받아오기
	public Question selectTopic(Connection conn,int topic_id) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("SELECT A.topic_id, topic FROM topic_t AS A LEFT JOIN question_t AS B ON A.topic_id = B.topic_id WHERE B.topic_id = ? LIMIT 1;");
			pstmt.setInt(1, topic_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return new Question(rs.getInt(1), rs.getString(2));			
			}
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return null;
	}
}
