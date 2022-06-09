public class CarArrayTest {
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];
		// 자동차 배열 선언 및 초기화, 자동차가 만들어진 것 x
		Car c = new Car();
		// 자동차 만들기
		
		for (int i = 0; i < cars.length; i++) {
			cars[i] = c; // 5개의 인스턴스 생성(자동차), 각각의 index에 집어 넣기
		}
		for (Car car : cars) { // Car타입 변수에 cars 배열 값 넣기
			c.speedUp(); // 상태 변화
		} // 참조하고 있는 대상을 변경
		 // c = null 이랑 다르므로(값 대입연산)
		for (Car car : cars) { // 전체 순환 위해 for each문 다시 사용
			System.out.println(car); // 문자열 형태로 상태값 받을 수 있음
			// 객체를 문자열 형태로 받을 때 toString 자동 호출
		}
		
//		for (int i = 0; i < cars.length; i++) {
//			cars[i] = new Car(); // 5개의 인스턴스 생성
//		}
//		
//		for (int i = 0; i < cars.length; i++) {
//			cars[i].speedUp(); //5개의 자동차에 1번씩 속도를 올림
//		}
//		
//		for (int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i].toString());
//			// cars[i].toString해도 똑같이 나옴
//			// car에서 toString객체로 문자로 출력되게 해뒀으므로 없어도 똑같이 나옴 -> 객체 이름 toString이어야함
//		}
	}
}