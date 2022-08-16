public class Car {
	private int speed; // 속도
	private int gear; // 기어
	private String color; // 색상, 외부에서의 필드에서나 메소드에서는 해당 필드를 접근해서 볼 수도 변경할 수도 없음


	// 첫 번째 생성자, 초기화의 목적성
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	// 색상만 주어진 생성자
	public Car(String c) {
		this(c, 0, 1); // 자기 자신의 생성자를 호출한다., 자기 자신을 참조하여 ()의 값대로 값이 들어감
		//자기 자신을 부르는 this는 언제나 생산자 첫 줄이어야함
		System.out.println("초기화 과정 중~~");
	}
	
	// -> 정보를 숨겨두고 원할 때 메소드를 통해 호출 가능
	// 접근 (색상)
	public String getColor() {
		return color;
	}
	
	// 설정(색상), 색을 지정해달라고 요청하면 여기에 값을 넣어줌
	public boolean setColor(String c) {
		if (c != null) {
			color = c;
			return true;
		}
		return false; 
		// 메소드로 만들면 추가적인 논리 흐름을 만들어 낼 수 있음
	}
	
	// public Car(int s) {
		// speed = s;
	// }
	
	// setter 설정자 <<
	public int getSpeed() { // 값을 알려주는 경우 get 주로 사용
		return speed;
	}
	
	// getter 접근자 << 
	public void setSpeed(int s) { // 값 받아와서 설정하는 경우 set 주로 사용
		speed = s;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void setGear(int g) {
		gear = g;
	}
}