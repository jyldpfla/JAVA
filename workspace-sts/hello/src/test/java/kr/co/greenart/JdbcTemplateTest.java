package kr.co.greenart;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.greenart.config.RootConfig;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { RootConfig.class })
public class JdbcTemplateTest {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void test() {
		int result = jdbcTemplate.queryForObject("SELECT 1", int.class);
		// queryForObject : 결과 값이 하나인 query문을 쓸 수 있음
				
		assertEquals(1, result);
	}
	
	@Test
	public void update() {
		int result = jdbcTemplate.update("UPDATE users SET name=?, age=? WHERE id=?"
				, "새이름"
				, 22
				, 1); // 쿼리문 쓰고 값 넣어주기
		
		assertNotEquals(0, result);
	}	
	
//	@Test
//	public void delete() {
//		int result = jdbcTemplate.update("DELETE FROM users WHERE id=?", 2);
//		
//		assertEquals(1,result);
//	}
	
	@Test
	public void queryForList() {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM users");
		// 행 한 줄은 map으로 표현 가능, map 여러 줄 list로 담으면 됨
		
		assertEquals(2, list.size()); // assertEquals : 조건에 부합하면 assert
		assertEquals("새이름", list.get(0).get("name"));
	} 
}
