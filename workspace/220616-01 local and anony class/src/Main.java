interface PrintAll {
	void printAll();
}

public class Main {
	public static void main(String[] args) {
		new PrintAll() { // 이름이 없는 익명 지역 클래스
			@Override
			public void printAll() {
				System.out.println("출력할 것이 없는 것이에여");
			}
		}.printAll(); // 참조도 불가능한 일회용 익명 클래스
		
		PrintAll a = new PrintAll() { // 참조변수 선언
			// 인스턴스를 클래스로 만들어서 참조(PrintAll을 타입으로 사용)
			@Override
			public void printAll() {
				System.out.println("출력할 것이 없는 것이에여");
			}
		}; // 메인메소드 안이므로 ; 필요
		
		a.printAll();
		a.printAll();
		
//		class Point implements PrintAll{ // 이름을 가진  local 클래스
//			int x;
//			int y;
//			public Point(int x, int y) {
//				super();
//				this.x = x;
//				this.y = y;
//			}
//			@Override
//			public void printAll() {
//				System.out.println(x);
//				System.out.println(y);
//			}
//		}
//		
//		Point p = new Point(10, 20);
//		p.printAll();
	}
}
