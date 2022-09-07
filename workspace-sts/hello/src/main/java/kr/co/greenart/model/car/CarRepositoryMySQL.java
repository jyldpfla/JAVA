package kr.co.greenart.model.car;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepositoryMySQL implements CarRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate; // JdbcTemplate 의존성 부여
	private CarRowMapper mapper = new CarRowMapper(); // mapper 사용 위해 필드 선언(안에서만 사용)
	
	private class CarRowMapper implements RowMapper<Car> {
		@Override
		public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
			int id = rs.getInt("id");
			String model = rs.getString("model");
			int price = rs.getInt("price");
			
			return new Car(id, model, price);
		}
		
	}

	@Override
	public List<Car> getAll() { 
		return jdbcTemplate.query("SELECT * FROM cars", mapper);
		// query : list를 반환해줌
	}

	@Override
	public Car getById(int id) { // 하나만 반환하는 것을 찾아야함
		return jdbcTemplate.queryForObject("SELECT * FROM cars WHERE id=?"
				, mapper
				, id);
		// queryForObject : 객체 1개를 반환
	}

	@Override
	public int add(Car car) {
		return jdbcTemplate.update("INSERT INTO cars (model, price) VALUES (?, ?)"
				, car.getModel()
				, car.getPrice());
	}

	@Override
	public int update(Car car) {
		return jdbcTemplate.update("UPDATE cars SET model=?, price=? WHERE id=?"
				, car.getModel()
				, car.getPrice()
				, car.getId());
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("DELETE FROM cars WHERE id=?",
				id);
	}

	@Override
	public int[] batchInsert(List<Car> list) {
		return jdbcTemplate.batchUpdate("INSERT INTO cars (model, price) VALUES (?, ?)",
				new BatchPreparedStatementSetter() {
					@Override
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						Car car = list.get(i);
						ps.setString(1, car.getModel());
						ps.setInt(2, car.getPrice());
					}
					
					@Override
					public int getBatchSize() {
						return list.size();
					}
				});
	}
}
