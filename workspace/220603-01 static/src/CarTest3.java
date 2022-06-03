
public class CarTest3 {
	public static void main(String[] args) {
//		Car.printStaticNumber();
		// 객체를 통해서 부른 것,정적변수는 객체가 아니므로 이렇게 x
		
		int n = Car.getNumberOfCars(); /// 정적 메소드 호출
//		// 정적 변수는 class안에 존재하므로 class 통해서 부름
//		System.out.println("지금까지 생성된 자동차 수 = " + n);
//		// 0으로 출력됨
		
		Car c1 = new Car("blue", 100, 1); // 첫 번째 생성자 호출
		c1.printStaticNumber();
		Car c2 = new Car("white", 0 ,1); // 두 번째 생성자 호출
		
		n = Car.getNumberOfCars(); /// 정적 메소드 호출
		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}
}
