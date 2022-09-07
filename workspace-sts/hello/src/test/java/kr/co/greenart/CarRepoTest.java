package kr.co.greenart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.greenart.model.car.Car;
import kr.co.greenart.model.car.CarRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { kr.co.greenart.config.RootConfig.class })
// repository가 instance화 돼있거나, spring이므로 bean으로 등록되어있어야하는데
// 읽을 파일을 RootConfig로 설정해뒀으므로 RootConfig에서 bean으로 등록
// WebConfig에는 kr.co.greenart 전부 읽어서 componentscan하므로  RootConfig에서 bean으로 등록 안해도 되는데, 현재는 web에서 구동되게 되어있으므로
// 라이브러리 추가하지 않는 이상 구동환경이 달라서 error 남 -> rootconfig에서 해야됨
public class CarRepoTest {
	@Autowired
	private CarRepository repository; // bean으로 등록되어있으므로 new로 instance화 필요 없음
	
	@Test
	public void initTest() { // autowired 되는지 안되는지 확인
		assertNotNull(repository);
	}
	
	// 테이블에 자료 없을 때 자료부터 만들기
	@BeforeClass // 해당 메소드가 이 클래스에 정의된 test 메소드가 실행되기 전에 한 번 먼저 실행됨, 미리 설정해야하는 환경이 필요할 때 사용
	public static void addTestData() { // before class는 static 메소드로(먼저 실행되므로)
		// 테스트 클래스 수행 전에 실행됩니다~~ 스태틱하게 선언
//		Random r = new Random();
//		repository.add(new Car(0, "테스트 자료" + r.nextInt(10000), r.nextInt(10000)));
//		// 0은 안쓰는 값이라서 넣어둠(id값), auto increment 돼있어서 자동으로 id값 설정됨
//		repository.add(new Car(0, "테스트 자료" + r.nextInt(10000), r.nextInt(10000)));
//		repository.add(new Car(0, "테스트 자료" + r.nextInt(10000), r.nextInt(10000)));
	}
	
	@Test
	public void create() {
		Random r = new Random();
		Car car = new Car();
		car.setModel("새모델" + r.nextInt(10000));
		car.setPrice(1000);
		
		int result = repository.add(car);
		assertEquals(1, result);
	}
	
	@Test
	public void read() {
		List<Car> list = repository.getAll();
		
		assertNotNull(list);
	}
	
	@Test
	public void update() {
		int result = repository.update(new Car(1, "변경", 300));
		
		assertEquals(1, result);
	}
}
