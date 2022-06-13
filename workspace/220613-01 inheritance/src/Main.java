// 상속 : 상하 계층 구조를 가지고 있는 클래스간에, 아래 클래스가 위의 클래스의 특징을 그대로 물려받는 것
public class Main {
	public static void main(String[] args) {
		Person p = new Person("사람이름", 22); // 이름과 나이를 가지는 사람 class 생성
		// 사람도 하나의 인스턴스이므로  -> 사람 1, 학생1, 작가 1이라고 생각하면 됨
		// 값을 그대로 받는 것x, 원래 참조하듯이 참조해서 값을 받아올 수는 있음 
		// -> Student s2 = new Student(p.getName(), p.getAge(), 22);
		// (필드가 public으로 선언) -> Student(p.name, p.age); 로 부르기
		
		Student s = new Student("학생이름", 17, 90); // 학생 생성자에 맞는 파라미터값 넣기
		// 부모의 생성자를 가져오므로, 부모의 생성자를 자신의 것처럼 사용
		// 참조변수는 intance 하나를 가짐
		// 이름과 나이의 특징을 부모에서 따와서 자신의 것처럼 가짐
		System.out.println(s.getName());
		System.out.println(s.getScore());
		
//		p.getScore(); // 사람은 점수를 가지고 있지 않으므로 score 필드와 getScore메소드를 갖고 있지 않음
		
		Author a = new Author("작가이름", 30, "반지의 길"); // 3개의 파라미터로 전달
		// 자기만 가지고 있는 booklist도 초기화
		System.out.println(a.getName());
		System.out.println(a.getBookList());
	}
}
