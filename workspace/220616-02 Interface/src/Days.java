public interface Days {
//	int NUM = 10; // 아래와 동일
//	public static final int NUM = 10;
	
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	int WENDSDAY = 3;
	// 상수들을 정의해두고 인터페이스에서 사용 가능
	
}

interface MyInterface {
	default void printHello() {
		System.out.println("Hello");
	}
	
	public static void myStaticMethod() {
		
	} // 호출시 MyInterface.myStaticMethod() 이렇게 호출
	
	public static int sum(int a, int b) {
		return a + b;
	} // 객체의 동작을 나타내는 건 아니고, 정적인 메소드를 인터페이스의 위치로 옮긴 것
	// 동작이 아니라 기능을 그냥 옮겨둔 것
	
	
}