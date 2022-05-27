// 전역 변수
// public class Math {
	// public static final double PI = 3.14438987437498;
// }

public class StaticVariableAndConst3 {
	public static final int NUMBER = 100; // 전역 변수
	
	public static void test() {
		// NUMBER++;
		System.out.println("테스트메소드에서 : " + NUMBER);
	}
	
	public static void main(String[] args) {
		// NUMBER++;
		// System.out.println("메인메소드에서 : " + NUMBER);
		
		// test();
		
		// System.out.println(Math.PI);
		// Math.PI++;
		
		// double a = Math.abs(-372); // abs: 절대값
		// System.out.println(a);
		
		double r = Math.random(); // random: 랜덤으로 숫자
		r = (int) (r * 10);
		System.out.println(r);
	}
}