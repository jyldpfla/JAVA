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
	
	// question_id를 db에서 가져와서 selectOptionByQuestion의 parameter 값으로 넣어줘서 list부터 생성하고 map에 담기
	// topicCount : 토픽 아이디별 질문 개수
	// topicStart : 토픽 아이디 시작 개수
	public Map<Integer, List<Option>> selectQAndO(Connection conn) throws SQLException {
		Statement stmt = null;
		ResultSet rs = null;
		Map<Integer, List<Option>> QAndOMap = new HashMap<>();
		List<Option> oList = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT DISTINCT question_id FROM option_t WHERE option_id IS NOT NULL");
			while (rs.next()) {
				OptionDAO odao = new OptionDAO();
				oList = odao.selectOptionByQuestion(conn, rs.getInt(1));
				QAndOMap.put(rs.getInt(1), oList);
			}
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			}
		return QAndOMap;
	}
	
	// parameter 값으로 question_id를 받아오기
	// question_id에 맞는 option값이 여러개 나오는걸 list에 담기
	public List<Option> selectOptionByQuestion(Connection conn, int question_id) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Option> oList = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement("SELECT * FROM option_t WHERE question_id = ?");
			pstmt.setInt(1, question_id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				oList.add(resultMapping_S(rs));
			}
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return oList;
	}
}
