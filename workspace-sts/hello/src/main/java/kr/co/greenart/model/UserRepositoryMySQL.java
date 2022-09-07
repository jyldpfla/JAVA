package kr.co.greenart.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Primary // 여러 repository중 먼저 꺼내지도록
// 미리 만들어둔 interface 구현 클래스
public class UserRepositoryMySQL implements UserRepository {
	@Autowired
	private JdbcTemplate JdbcTemplate;
	private UserRowMapper mapper = new UserRowMapper(); // bean으로 만들어도 되지만, 안에서만 사용할 것이므로
	
	private class UserRowMapper implements RowMapper<User> { // generic에 원하는 타입 넣기
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			
			return new User(id, name, age);
		}
		
	}
	
	@Override
	public int add(User user) {
		return JdbcTemplate.update("INSERT INTO users (name, age) VALUES (?, ?)"
				, user.getName() 
				, user.getAge()); // 1, 2 번째 int 값 설정
		// update : 행 개수를 return하고 수정하는 역할
	}

	@Override
	public List<User> list() {
		return JdbcTemplate.query("SELECT * FROM users", mapper);
		// rowMapper : 원하는 형태의 값을 반환할 수 있도록 하는 것, rs.next()기능
	}
	
}
