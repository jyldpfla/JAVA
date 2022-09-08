package kr.co.greenart.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.greenart.model.car.Car;
import kr.co.greenart.model.car.CarService;

@Controller
@RequestMapping("/car")
@ResponseBody // controller에서 응답하는 것은 모두 responsebody에 담겨서 감
public class CarController {
//	@GetMapping
//	public ResponseEntity<String> view() {
//		// 특정 응답문만 body에 담아 보내고 싶다면??
//		return ResponseEntity.ok("Asdf");
//	}
	private static Logger logger = LoggerFactory.getLogger(CarController.class);
	
	@Autowired
	private CarService service;
	
	// 자동차 목록을 불러와서 목록을 응답 body에 text형태로 보내고 싶으면?
	// -> responsebody를 이용해 text로 출력 가능
	// jackson databind 의존성 추가했으므로 원하는 return타입을 json형태로 알아서 변환해줌
	@GetMapping
	public @ResponseBody List<Car> view() {
		return service.list();
	}
	
	@GetMapping("/{id}")
	public Car carById(@PathVariable int id) {
		// @PathVariable : 변수값으로 path 사용
		return service.getById(id);
	}
	
	// 사용자가 원하는 데이터 추가
	@PostMapping
	public ResponseEntity<String> add(@RequestBody Car car) { // 라이브러리 의존성 덕에 requestbody에 담아 보내면 값 들어감
		// json의 형태로 보내도 Car형태로 보내줌
		logger.info(car.toString());
		service.add(car);
		
		return ResponseEntity.ok("{ \"result\" : \"ok\" }");
	}
	
	@PutMapping // 추가를 post로 하고 위에 get도 있으므로 다른 방식으로 수정 요청하기
	public ResponseEntity<String> update(@RequestBody Car car) {
		service.update(car);
		
		return ResponseEntity.ok("{ \"result\" : \"ok\" }");
	}
	
	@DeleteMapping("/{id}") // id 값 필요하므로 pathEntity로 전달 받기
	public ResponseEntity<String> delete(@PathVariable int id) {// path 값 변수로 받기
		service.delete(id); // service 객체에 delete메소드 이용
		
		return ResponseEntity.ok("{ \"result\" : \"ok\" }"); // 삭제 성공했으면 response로 'result : ok' 뜨도록
	}
}
