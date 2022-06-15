// 삼각형// 중심정(x, y)// 밑변// 높이// 넓이를 구해서 알려줄 수  있음

// 직사각형// 중심정(x, y)// 가로// 세로// 넓이를 구해서 알려줄 수  있음

// 원// 중심정(x, y)// 반지름// 넓이를 구해서 알려줄 수  있음

public class Main {
	public static void main(String[] args) {
//		Shape s1 = new Shape();
//		Shape s2 = new Shape();
		
		Shape r = new Rectangle(0, 0, 10, 10);
		System.out.println(r.getArea());
		
		Shape c = new Circle(0, 0, 5);
		System.out.println(c.getArea());
		
		Triangle t = new Triangle(0, 0, 5, 5);
		System.out.println(t.getArea());
		
		Shape s = t; // upcasting
		System.out.println(s.getArea()); // 도형은 넓이를 구할 수 있다고 정의되어있음
		// upcasting 후 부모 클래스 참조해서  실제 instance에 동작을 시켜도 구체화된 자식 클래스에서 메소드 가져와서 동작
		
	}
}
