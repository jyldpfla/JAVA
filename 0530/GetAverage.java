// 학생

// 이름
// 국어 점수
// 영어 점수
// 수학 점수

// 생성자
// getter/setter

// 자기 평균 점수를 알려줄 수 있음

class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;	
	
	public Student (String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
	return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getmath() {
		return math;
	}

	public void setScore(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}

	public double avg () {
		return (kor + eng + math) / 3;
	}
}

public class GetAverage {
	public static void main(String[] args) {
		Student s = new Student("인하", 100, 100, 100);
		System.out.print(s.getName() + s.avg());
	}
}
