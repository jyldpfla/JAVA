
// p. 151
class Car {
	// 필드 정의
	String color; // 색상
	int speed; // 현재 속도
	int gear; // 현재 기어
	
	void print() {
	System.out.print("(" + color + ", " + speed + ", " + gear + ")" );
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car(); // 인스턴스화를 할 때는 new를 꼭 붙여야 함
		myCar.color = "red"; // 메소드를 통해 접근하는 것이 바람직, 지금은 메소드 사용하지 않고 값 전달했으므로 객체지향적으론 바람직x
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();
		
		// 색상: blue 속도: 60 기어: 3
		Car jCar = new Car();
		jCar.color = "blue";
		jCar.speed = 60;
		jCar.gear = 3;
		jCar.print();
		
		{
			int a = 100;
			Car someCar = new Car();
		}
		// 중괄호를 나가면 instance가 사라지는 것이 아니라 참조변수가 사라지는것이지만, 참조할 방법이 없으므로 쓰레기가 됨
		// java에서는 garbage collection이 자동 처리해줌, 공간이 멈춰야 삭제할 수 있으므로 잠깐 멈추는 현상이 있는 것이 단점
	}
}
