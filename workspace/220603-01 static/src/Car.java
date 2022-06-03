public class Car {
	private String color;
	private int speed;
	private int gear;
	// 자동차의 시리얼 번호
	private int id;
	
	public static final int SHARE_NUMBER = 22;
	// 변하지 않으므로 공유의 의미에선 좋음
	
	// 실체화된 Car 객체의 개수를 위한 정적 변수
	private static int numberOfCars = 0;
	// public으로 선언하는 경우 거의 x, 변경하거나 사용했는지 확인이 어려움, private는 공간 안에서만 사용하므로 
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		// 자동차의 개수를 증가하고 id 번호를 할당한다.
		
		numberOfCars++; // 번호 하나씩 증가되도록
		id = ++numberOfCars;
	}
	
//	public static void printColor() {
//		System.out.println(color);
//		// color 변수는 인스턴스화 후  초기화값 넣어줘야 생기는데, 정적 메소드는 실행전에 만들어지므로 error
//		// static한 method안에서는 필드값을 가지고 하는 것이 안됨
//	}
	
	public void printStaticNumber() {
		System.out.println(numberOfCars);
	}
	
	// 정적 메소드
	public static int getNumberOfCars() {
		return numberOfCars; // OK!
		// 변수가 private하므로 불러줄 수 있는 메소드 있어야함
	}
}
