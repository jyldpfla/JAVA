package kr.co.greenart.model.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarService {
	@Autowired
	private CarRepository repo;
	
	public List<Car> list() {
		return repo.getAll();
	}
	
	public Car getById(int id) {
		return repo.getById(id);
		// 없는 값이면 error 뜸
	}
	
	public int add(Car car) {
		return repo.add(car);
	}
	
	public int update(Car car) {
		return repo.update(car);
	}
	
	// 자동차 목록을 전달받아 주기
	@Transactional // 트랜잭션이 필요하다고 알려줌, rootconfig에 등록된 transaction 찾아서 관리
	// 여기서 runtimeerror발생 시 rollback해줌
	public int[] bulkInsert(List<Car> list) {
//		int[] results = new int[list.size()];
//		// 여러 행을 한꺼번에 넣는 메소드 짜기 -> 반복문
//		for (int i = 0; i < list.size(); i++) {
//			results[i] = repo.add(list.get(i));
//		}
		// jdbcTempate이용한 방법(위는 이용 전)
		int[] results = repo.batchInsert(list);
		return results;
	}
	
	@Transactional
	public int delete(int id) {
		return repo.delete(id);
	}
}
