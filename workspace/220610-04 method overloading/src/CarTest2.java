// p. 184
class Car {
	// 필드 선언
	private int speed;	//속도
	// 중복 메소드: 정수 버전
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	} 
	
	// 중복 메소드: 실수 버전
	public void setSpeed(double s) {
		speed = (int)s; // 필드가 int형으로 선언돼있으므로, 손실을 감수하고 정수부분만 취하기(int)
		System.out.println("실수 버전 호출");
	}
}
public class CarTest2 {
	public static void main(String[] args) {
		Car myCar = new Car();	// 첫 번째 객체 생성
		myCar.setSpeed(100);	// 정수 버전 메소드 호출
		myCar.setSpeed(79.2);	// 실수 버전 메소드 호출
		
		myCar.setSpeed(1000L); // 더 큰 범위의 실수를 표현하는 타입이 있으므로 double을 찾아감
		myCar.setSpeed('A'); // Char형 문자는 숫자처럼 취급되므로
//		myCar.setSpeed("A");		
	}
}
