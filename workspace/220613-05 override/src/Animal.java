// p. 249
public class Animal {
	public void sound() {
		System.out.println("동물은 제각각의 소리를 냅니다.");
	} // head 부분
}
class Dog extends Animal {
	@Override	// annotation
	// 부모 메소드와 헤드부분 다르게 작성한 자식 메소드 위에 @Override쓰고 compile 해주면 compile error가 메소드 헤드부분을 잘못썼다고 알려주고, 수정하면 error 사라짐
	public void sound() {
		System.out.println("멍멍"); // method override
	} // 부모에 있던 것을 그대로 작성
}

class Cat extends Animal {
	public void sound() {
		System.out.println("냐옹"); // 하나의 동작을 새롭게 써내려간 것
		// 부모에서 받아온 메소드를 자식 메소드에서 구체적으로 동작하도록 하는 것
	}
}