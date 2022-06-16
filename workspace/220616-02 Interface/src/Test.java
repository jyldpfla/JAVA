class MyClass {
	public static int num; // 마이클래스 사용되고 아래로 쭉 읽음
	
	public int fields = 10000; // 그냥 코딩을 써둔 것
	
	static {
		System.out.println("테스트테스트"); // 쭉읽어서 테스트테스트 출력하고 다시 hello로 돌아감
		MyClass2.hello(); //로드될 때 만들어지므로 블럭이 있을 때 실행됨
	}
}

class MyClass2  {
	static void hello() {
		System.out.println(MyClass.num); // 클래스 최초로 사용, 마이클래스로 넘어감
//		System.out.println(MyClass.fields);
		// 필드는 객체를 만들었을 때 생성됨, 인스턴스가 있어야 변수공간이 있어야 만들어짐
		System.out.println(new MyClass().fields);
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println("시작~~~~~~~~"); // 프로그램 시작
		MyClass2.hello(); // 클래스를 로드할 때(클래스를 최초로 사용할 때)
	}
}
