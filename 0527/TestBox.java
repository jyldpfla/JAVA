// 객체 만들기 (참조형)
public class TestBox {
	public static void main(String[] args) {
		// Box none = null;
		// none.width = 10; // 없음을 참조하고 있으므로 가로가 없어서 실행 중 error 남
		Box box1; // class가 하나의 type으로 사용, 참조형 변수가 선언됨
		// Box 파일에 만든 Box class 이용
		box1 = new Box(); // 박스 인스턴스
		box1.width = 3;
		box1.length = 3;
		box1.height = 3;
		
		// Sytsem.out.println(box1.color);
		
		Box box2 = new Box();
		box2.width = 10;
		box2.length = 10;
		box2.height = 10;
		
		// System.out.println("부피: " + box1.volume);
		System.out.println(box1.getVolume());
		System.out.println(box2.getVolume());
		
		box1.printAllState();
		box2.printAllState(); // 참조형 모두 각자의 인스턴스에 고유한 상태 값을 가지고 있음
		
		// System.out.println(box1.width);
		// System.out.println(box2.width);
		
		// box1.width = 5;
		// System.out.println(box1.width);
	}
}