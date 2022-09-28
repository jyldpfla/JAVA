
public class MyHolder<T> {
	private T o;
	// private로 생성한 객체에 대해 의존성을 주입해주고 싶으면? -> 생성자, setter로 주입 가능
	// 하나의 class로 정의된 객체라면 strong type이므로 다른 type이 올 수 없음
	// 유연한 구조를 위해 그 타입을 상속구조로 만들어서 부모의 타입으로 정의
	// 더 유연한 구조를 위해 interface로 만들어주면 됨
	// java의 type을 지정해줘야하기 때문에 생기는 문제 -> generic으로 동적으로 쓸 수 있도록 함(임의의 타입으로 지정)
	// class나 인터페이스 우측에 <>주고 알파벳대문자 아무거나 사용(보통 타입의 약자를 따서 T로 지칭)
	
	public MyHolder() {}
	
	public MyHolder(T o) {
		super();
		this.o = o;
	}
	
	public T getO() {
		return o;
	}

	public void setO(T o) {
		this.o = o;
	}
	
	
}
