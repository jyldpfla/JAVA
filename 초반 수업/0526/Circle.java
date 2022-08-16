// 1. 원의 반지름(실수형)을 전달받아 원넓이(실수형)를 반환하는 메소드 작성 후
// 메인메소드에서 호출하여 출력을 통해 값을 확인해보세요.
public class Circle {
	public static double getCircleArea(double radius) { // 헤더 (반환타입 이름 파라미터)
		return radius * radius * 3.14; // 바디 // 문장
	}


	public static void main(String[] args) {
		double area = getCircleArea(5);
		
		System.out.printf("원의 넓이는 %.1f입니다.", area); // %랑 f사이에 .숫자로 소수점 뒤 자릿수 지정 가능
	}
}