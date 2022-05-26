public class Methods {
	// 숫자 하나가 짝수, 홀수인지 알고 싶음. 이 기능을 할 수 있는 메소드.
	// header에 리턴타입 이름(파라미터들)
	public static boolean isEven(int number) { //짝수면 참, 홀수면 거짓
		return number % 2 == 0;
	}
		
	// int isEven(int)
	
	// char isEven(int)
	
	
	
	
	public static int increase(int a) { //int로 return value 해줘야 함
		a++;
		return a;
	}
	
	// public static int,int createTwoNumber () {
		// return 20, 30; // 메소드는 return값을 하나만 가질 수 있음
	// }
	
	// public static boolean test() { // 메소드 작성시 header와 return 값 타입이 다르면 error
		// return 10;
	// }
	
	public static void main(String[] args) {
		boolean result = isEven(125);
		System.out.println(result);
		// int a = 10;
		// increase(a); // Call By Value
		// a = increase(a); // 메인메소드 a값에 increase a값 넣기
		
		// System.out.println(increase(a)); // 값을 복사해서 붙여넣은 것이고, 메인메소드 안 a값은 변하지 않음
		// System.out.println(a);
	}
} 