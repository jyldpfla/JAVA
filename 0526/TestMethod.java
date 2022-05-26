public class TestMethod {
	public static void printRepeat() { //메소드 머리(head) 메소드 이름
		// 메소드 몸통(body) 메소드 동작
		for (int i = 0; i < 3; i++) { //메인메소드부터 읽히므로 처음에 실행되지 않음
			System.out.println("반복 중");
		}
	} 
	
	// printHello
	public static void printHello() {
		int number = 10;
		System.out.println("Hello");
		System.out.println("초기화한 변수 값:" + number);
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작~");
		
		printHello();
		// System.out.println("헬로안에서 초기화한 변수 값: " + number); // 지역변수기 때문에 변수 호출x
		
		// 메소드 호출
		// for (int i = 0; i < 2; i++) {
			// printRepeat();
		// }
		
		System.out.println("프로그램 끝~");
	}
}