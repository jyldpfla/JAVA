public class Car {
	// 3개의 필드 선언
	int speed; 	// 속도
	int gear;	// 기어
	public String color;	// 색상, 테스트를 위하여 공용 필드로 만들자.
	// public하므로 대입 연산 가능
	
	public void speedUp(int increment) {	// 속도 증가 메소드
		speed += increment;
	}
	
	public void speedDown(int decrement) {	// 속도 감소 메소드
		speed -= decrement;
	}
}
