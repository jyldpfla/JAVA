// 1. 원의 반지름(실수형)을 전달받아 원넓이(실수형)를 반환하는 메소드 작성 후
// 메인메소드에서 호출하여 출력을 통해 값을 확인해보세요.
public class Circle {
	public static double circle2(double r) {
		return r * r * 3.14;
	}


	public static void main(String[] args) {
		double area = circle2(5);
		
		System.out.printf("원의 넓이는 %f입니다.", area);
	}
}