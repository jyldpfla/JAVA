// 생성자
public class Box {
	int length;
	int width;
	int height;
	
	public Box() {
		width = 1;
		length = 1;
		height = 1;
	} // 기본
	
	public Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
	}
	
	public static void main(String[] args) {
		Box b3 = new Box(); // 파라미터가 없으므로 error
		// 기본생성자가 없으면 컴파일러가 기본 생성자를 만들어주고 호출 가능
		
		
		
		// Box b = new Box(50, 60, 70);
		// // 원하는 값 주면 기본 생성자 덕에 원하는 값으로 초기화 가능
		// System.out.println(b.width);
		// System.out.println(b.length);
		// System.out.println(b.height);
		
		// // 박스 인스턴스화. 생성자를 호출해서 가로 90 세로 100 높이 110
		// Box b2 = new Box(90, 100, 110);
		// System.out.println(b2.width);
		// System.out.println(b2.length);
		// System.out.println(b2.height);
	}
}
