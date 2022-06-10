// Method Overloading
public class Main {
	public static void someMethod(int param) {
		
	}
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
//	public static void sum(int alskjfalkjfdlaf, int akldjflakjf) {
//		
//	} // 파라미터의 이름과는 관계x
	
	public static void sum(double a, double b) { 
		// 이름이 같아도 파라미터의 타입, 순서, 개수가 다르면 다른 메소드로 인식
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
//		someMethod(3873.03736);
//		someMethod("asdf");
		
		// Method Overloading
//		System.out.println(123123);
//		System.out.println(123.123);
//		System.out.println("123123");
		sum(10.0, 40.0); // 파라미터 sum만들기 전엔 실수에는 동작하지 않음, 해당하는 메소드를 찾지 못하므로
		// 타입에 알맞은 메소드 호출됨
//		sum("asdf", "qwer"); // 해당 메소드x
	}
}
