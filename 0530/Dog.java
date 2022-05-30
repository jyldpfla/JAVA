public class Dog {
	// 강아지 Dog 클래스
	// name: 이름
	// breed: 종
	// age: 나이

	private String name;
	private String breed;
	private int age;
	
	// 강아지 3개의 모든 필드를 초기화 할 수 있는
	// 생성자
	public Dog(String name, String breed, int age) {
		this.name = name;
		// 필드 이름, 파라미터 이름은 겹쳐도 됨, 지역변수인 변수 먼저 가져오려고 함
		// 구분지어줄 때 필드를 말하고 싶으면 자기자신 참조(this.변수이름)를 하도록 써줌
		this.breed = breed;
		this.age = age;
	}
	
	void printAll() {
		System.out.println(name);
		System.out.println(breed);
		System.out.println(age);
	}
	
	// 강아지 이름, 종을 전달받은 값으로 초기화하고
	// 나이는 1살로 초기화할 수 있는 생성자
	public Dog(String n, String b) {
		this(n, b, 1);
	}
	
	// 모든 필드를 private 접근 제한자로 정보 은닉(캡슐화)하고
	// 각 필드의 public한 getter/setter를 작성해보세용~~
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}

	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String b) {
		breed = b;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	
	
}