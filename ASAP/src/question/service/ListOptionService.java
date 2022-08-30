package question.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jdbc.connection.ConnectionProvider;
import question.dao.OptionDAO;
import question.dao.QuestionDAO;
import question.model.Option;

public class ListOptionService {
	private OptionDAO odao = new OptionDAO();
	
	public Map<Integer, List<Option>> getOption(int topic_id) {
		try (Connection conn = ConnectionProvider.getConnection()) {
			Map<Integer, List<Option>> QAndOMap = new HashMap<>();
			
			QAndOMap = odao.selectQAndO(conn);
			
			return QAndOMap;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}