// 부모 클래스가 될 사람 클래스 만들기
public class Person {
	private String name; 
	// private로 만들어두면 자식클래스가 접근할 수 없음
	private int age; 
	// protected int age; 범위 넓혀주면 student에서 getAge로 값 반환 가능
	// 자식들이 접근할 수 있도록 만들어둔 접근제한자
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { // getter는 보통 pubic으로 만듦(대개 알려줄 때 만드므로)
		return name;
	}
}
