import java.util.Scanner;

public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideException {
		if (right == 0) {
			throw new MyZeroDivideException("나눌 수 없음");
			// return 값 int x
			// 메소드에서는 예외처리
		} else {
			return left / right;
		}
	}
	
	public static int myFunction() {
		// 미완성 -> compile error
		throw new UnsupportedOperationException("내일 만들게. 아직 덜 만듦");
	}
	
	public static void main(String[] args) {
		myFunction();
		Scanner scan = new Scanner(System.in);
		
		scan.nextInt();
//		int result = divide(100, 50);
//		// 예외를 상속하는 RunTimeException 존재(예외처리 안해도 compiler가 그냥 넘어감)
		// MyZeroDivideException expends RunTimeException이렇게 쓰면 됨
		
//		try{
//			int result = divide(100, 50);
//		} catch (MyZeroDivideException e) {
//			System.out.println(e.getMessage());
//		}
	}
}
