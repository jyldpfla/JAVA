public class Student extends Human {
    private String major;

//	public Student(String name, int age, String major) { // 매개변수의 값으로 필드를 초기화한다.
//		super(name, age, "학생");
//		this.major = major;
//	} // 필드값 고정시켜서 직업 고정하는 방법 1
	
	public Student(String name, int age, String profession, String major) { // 매개변수의 값으로 필드를 초기화한다.
		super(name, age, profession);
		this.major = major;
	} // getter를 이용해서 profession값 지정할 때
	
	@Override
	public String getProfession() {
		return "학생";
	} // 학생 profession 학생값 return하는 메소드 만들어주기(부모 메소드 overriding)

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
//    	return "이름: " + getName() + ", 나이: " + getAge() + ", 전공: " + major;
		// name, age가 private이므로 public한 getter들 사용
		return super.toString() + ", 전공: " + major;
		// 부모메소드 호출, 부모 필드도 호출 가능
	} 
}
