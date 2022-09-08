package kr.co.greenart.model.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class CarRepositoryNamed implements CarRepository{
	@Autowired
	private NamedParameterJdbcTemplate jdbc; // 객체 의존성을 config에서 만든 bean으로 주기

	@Override
	public List<Car> getAll() {
		return jdbc.query("SELECT * FROM cars", new BeanPropertyRowMapper<Car>(Car.class));
		// BeanPropertyRowMapper : column이름, 넘겨준 class랑 필드 이름이 같고 그에 해당하는 getter, setter가 존재하면
		// 알아서 setter를 불러와줌 => rowmapper없이 class 이용해서 가능
		// 해당하는 column 값 찾아서 map에 넣어주는 과정을 필드명이랑 이름이 같으면 넣어줌
	}

	@Override
	public Car getById(int id) {
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("id", id);
		return jdbc.queryForObject("SELECT * FROM cars WHERE id=:id", map, new BeanPropertyRowMapper<Car>(Car.class));
		// ?대신 이름을 부여(:이름) -> 이름값을 가지는 map을 넘겨주면 됨
		// map에서 id를 찾아서 value 넣어줌
	}

	@Override
	public int add(Car car) {
		return jdbc.update("INSERT INTO cars (model, price) VALUES (:model, :price)"
				, new BeanPropertySqlParameterSource(car));
		// BeanPropertySqlParameterSource(다루고자하는 객체명) : 객체에서 원하는 필드명을 getter로 끌어와서 사용
		// 배열형태로 보내야 함(알아서 map 만들어서 Map 형태로 보내줌)
	}

	@Override
	public int[] batchInsert(List<Car> list) {
		return jdbc.batchUpdate("INSERT INTO cars (model, price) VALUES (:model, :price)"
				, SqlParameterSourceUtils.createBatch(list));
		// SqlParameterSourceUtils.createBatch : list에서 하나씩 값을 꺼내서 배열형태로 보내주는 메소드
		// 배치라서 여러번 반복 수행 -> BeanPropertySqlParameterSource(배열)가 여러개 있어야함
		// list를 보내주면 BeanPropertySqlParameterSource로 배열 형태로 하나씩 만들어서 보내줌
	}

	@Override
	public int update(Car car) {
		return jdbc.update("UPDATE cars SET model=:model, price=:price WHERE id=:id"
				, new BeanPropertySqlParameterSource(car));
	}

	@Override
	public int delete(int id) {
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("id", id);
		return jdbc.update("DELETE FROM cars WHERE id=:id", map);
	}
	
	
}
