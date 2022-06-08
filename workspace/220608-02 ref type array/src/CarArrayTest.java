public class CarArrayTest {
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];
		Car c = new Car();
		
		for (int i = 0; i < cars.length; i++) {
			cars[i] = c; // 5개의 인스턴스 생성
		}
		for (Car car : cars) {
			c.speedUp();
		} // 참조하고 있는 대상을 변경
		 // c = null 이랑 다르므로(값 대입연산)
		for (Car car : cars) {
			System.out.println(car);
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