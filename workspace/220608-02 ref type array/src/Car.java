public class Car {
	public int speed; // 속도
	public int gear; // 기어
	public String color; // 색상
	
	public Car() {
		speed = 0;
		gear = 1;
		color = "red";
	}
	
	public void speedUp() { // 속도 증가 메소드
		speed += 10;
	}
	
	public String toString() { // 객체의 상태를 문자열로 반환하는 메소드
		// 파라미터를 받지않고, 문자열로 반환
		return "속도: " + speed + "기어: " + gear + "색상: " + color;
	} 
	
}
