// 학생 : 이름, 나이
// 영국학생 : 인사할 수 있음 (Hello)
// 한국학생 : 인사할 수 있음 (안녕)
// 미국인 : 인사할 수 있음 (Wassup)

interface IHello {
	void hello();
}

interface EngHello extends IHello { // 구현이 아니라 인터페이스 상속이므로 extends
	void howoldru();
}

interface KorHello extends IHello { // 구현이 아니라 인터페이스 상속이므로 extends
	void whoisyourfather();
}

class Student {
	private String name;
	private int age;
	
	public Student() {}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class BritStudent extends Student implements IHello {
	@Override
	public void hello() {
		System.out.println("Hello");
	}
}
class KorStudent extends Student implements KorHello {
	@Override
	public void hello() {
		System.out.println("안녕");
	}

	@Override
	public void whoisyourfather() {
		System.out.println("메롱");
	}
}
class American implements IHello {
	@Override
	public void hello() {
		System.out.println("Wassup");
	}
}

public class Main2 {
	public static void main(String[] args) {
		// 인터페이스의 형으로 인스턴스를 참조하여 인사시켜 보기~~
		IHello s1 = new KorStudent();
		//KorStudent s1 = new KorStudent();도 가능
		IHello s2 = new BritStudent();
		IHello s3 = new American();
		
//		KorStudent[] arr = new KorStudent[3]; // 하나의 클래스만 담는 배열 생성됨
		
		IHello[] arr = new IHello[3]; // 클래스 다 담아서 사용 가능
		// inteface를 만들어둬서 type으로써 받을 수 있음
//		Object[] arr = new Object[3]; // 클래스 다 담아서 사용 가능		
		// Object 는 toString, equals만 명령 가능
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].hello(); // 다운캐스팅할 필요없음, Hello 자체가 인사할 수 있는 메소드를 가진 인터페이스이므로
		}
		
	}
}

















