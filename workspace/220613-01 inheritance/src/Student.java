// 자식 클래스가 될 학생 클래스

// 학생
// 이름 (필드)
// 나이
// 점수

// 이름 알려주기 (메소드)
// 점수 알려주기

public class Student extends Person {
//	private String name; // 중복해서 쓸 필요가 없음
//	private int age;
	private int score; // 하위클래스에 필요한 추가적인 필드(특성)
	
	public Student(String name, int age, int score) {
		super(name, age); // 부모의 생성자 호출
		// this는 자기자신을 참조, name필드는 person클래스에서 참조해옴
		this.score = score;
	}
//	public String getName() {
//		return name; // 중복 메소드 필요x
//	}
	
//	public void setAge() { // 접근제한자 protected일 때 가능
//		age = 10;
//		// 부모의 것이라고 말하고 싶으면 super.age = 10;
//		// 자신의 필드처럼 사용하므로 this.age = 10;도 가능
//		// 접근제한자 범위에 맞춰 부모의 것을 물려받아서 자기꺼처럼 접근해 set 가능
//	} 
	
//	public int getAge() { 
	// Person에서 접근제한자 범위 protected로 늘려주면 여기서 getter 설정 가능
//		return age;
//	}
	public int getScore() { // 하위 클래스에 필요한 추가적 메소드
		return score;
	}

}
