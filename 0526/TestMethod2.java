public class TestMethod2 {
	// 메소드의 이름. 영소문자. 여러 단어가 있으면 다음 단어의 첫 번째 글자를 대문자로.
	public static int sum () { // return type : void (없음)
		int a = 10;
		int b = 20;
		int sum = a + b;
		
		return sum;
	}
	
	// pi 메소드 { 3.14 실수값을 반환하는 메소드 }
	public static double pi() {
		double a = 3.14;
		
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println("시작");
		
		int result = sum(); // sum()로 메소드 호출이 일어남, 30이라는 값이 메인메소드 지역변수로 초기화됨
		System.out.println(result);
		
		double result2 = pi();
		System.out.println(result2);
		
		System.out.println("끝");
	}
}

