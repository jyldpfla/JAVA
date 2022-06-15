// 종단 클래스 

// class Test extends MyImpleClass // 더 이상의 상속 불가
public final class MyImpleClass extends MySubClass {
//	@Override
//	public void myMethod() { // MySubClass에서 종단메소드 만들었으므로 재정의 불가
//		System.out.println("새롭게 재정의를 하였습니다.");
//	}
	
	@Override
	public void myMethod2() {
		System.out.println("마이메소드2 오버라이드 구현");
	}
	
	public static void main(String[] args) {
		MyClass m = new MyImpleClass();
		m.myMethod();
//		m.myMethod2(); // MyClass에는 myMethod2가 없으므로 안됨
		
		MySubClass sub = (MySubClass) m;
		sub.myMethod2();
	
		sub.myMethod2();
		
	}	
}
