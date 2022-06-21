import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// 학생
// 이름
// 나이

// (학생은 이름과 나이가 같으면 동일 학생입니다)

// 홍길동 15
// 둘리 22
// 도우너 33

// 위의 학생을 원소로 가지는 리스트를 생성하고
// (도우너 33) 학생의 인덱스를 찾아보세요.
class Student implements Comparable<Student> { // 비교할 수 있도록 Comparable implements
	private String name;
	private int age;
	private int score;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return score - o.score;
	}
	
	
}

public class Main2 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 15, 90);
		Student s2 = new Student("둘리", 22, 80);
		Student s3 = new Student("도우너", 33, 95);
		
		List<Student> list = new LinkedList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		int index = list.indexOf(new Student("도우너", 33, 0));
		// 이름, 나이 equals만 정의해뒀으므로 점수 달라도 찾아냄
		System.out.println(index);
		
		// 정렬
		Collections.sort(list);
		// 학생 클래스를 참조하고 있는데 정렬 기준 없어서 error -> comparable implements하고 compareTo 메소드로 기준 설정
		System.out.println(list);
		
		
		// 나이를 가지고 비교하고 싶을 때는 이미 점수가 기준이므로 제 3의 클래스 comparator를 이용
		Comparator<Student> comparator = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// {} 안에 메소드, 필드 재정의, 메소드 재정의 등
				return o1.getAge() - o2.getAge();
			}	
		};
		
		Collections.sort(list, comparator); // comparator기준으로 list 정렬
		System.out.println(list);
	}
}

