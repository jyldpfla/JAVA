public class TestMethod3 {
	public static int getSum(int a, int b) { // parameters 개수, 타입, 순서
		return a + b;
	}
	
	// 두 개 int 정수를 전달받아 곱 연산결과를 반환하는 메소드를 작성하고 호출해 반환값을 메인메소드에서 출력.
	public static int getMultiply(int a, int b) {
		return a * b;
	} 
	
	public static void main(String[] args) {
		int sum = getSum(30, 60);
		System.out.println(sum);
		
		//System.out.print(a); 실행 안되겠죠오?
		
		System.out.println(getSum(100,200));
		
		System.out.println(getMultiply(3,9));
	}
}
