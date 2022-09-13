package kr.co.greenart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import kr.co.greenart.config.RootConfig;
import kr.co.greenart.model.car.Car;
import kr.co.greenart.model.car.CarService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = RootConfig.class)
@Transactional
// @TransactionConfiguration(defaultRollback = true) << 스프링 4버전 이하
public class CarServiceTest {
	@Autowired
	private CarService service;
	
	@Test(expected = DataAccessException.class) // 예외 던져서 error로 안뜨도록
	public void bulkInsert() {
		List<Car> list = Arrays.asList(new Car(0, "AAA", 100)
				, new Car(0, "BBB", 100)
				, new Car(0, "AAA", 100) 
				// 중복이라 수행이 제대로 안됨 -> insert 전 상황으로 돌아갈 수 있도록
				// transaction을 주고 rollback 시켜야함
				, new Car(0, "CCC", 100));
		
		int[] result = service.bulkInsert(list);
		assertNull(result);
	}
	
	@Test
	@Rollback(value = true) // true 값 주면 test메소드는 무조건 rollback함
	public void delete() {
		int result = service.delete(1);
		
		assertEquals(1, result);
	}
}
