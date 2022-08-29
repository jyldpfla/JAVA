package question.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jdbc.JdbcUtil;
import question.model.Option;

public class OptionDAO {
	private Option resultMapping_S(ResultSet rs) throws SQLException {
		int option_id = rs.getInt("option_id");
		int question_id = rs.getInt("question_id");
		String option_text = rs.getString("option_text");
		String group_text = rs.getString("group_text");
		
		return new Option(option_id, question_id, option_text, group_text);
	}
	
	// 총 답변 개수 구하기
	public int selectCount(Connection conn) throws SQLException {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT COUNT(*) FROM option_t");
			if (rs.next()) {
				return rs.getInt(1);
			}
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
		return 0;
	}
	
	// topic별 총 답변 개수 구하기
	public int selectCountByTopic(Connection conn, int topic_id) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("SELECT COUNT(*) FROM option_t AS A LEFT JOIN question_t AS B ON A.question_id = B.question_id WHERE B.topic_id = ?");
			pstmt.setInt(1, topic_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return 0;
	}
	
	// 질문별 답변 list에 담기
	// questionCount는 service에서 QuestionDao Question selectCount로 값 받아올 것! (topic별로 나누어서 count된 값)
	// 질문(key)이랑 답변(value, 여기서 만든 List) Mapping하기
	public Map<Integer, List<Option>> selectByQuestionId(Connection conn, int questionCount) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Option> optionList = new ArrayList<>();
		Map<Integer, List<Option>> qestionAndChoices = new HashMap<>();
		int i = 1;
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM option_t WHERE question_id = ?");
			while (rs.next()) {
				pstmt.setInt(1, i);
				optionList.add(resultMapping_S(rs));
				qestionAndChoices.put(i, optionList);
				i++;
			}
			return qestionAndChoices;
		} finally { 
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}
}
