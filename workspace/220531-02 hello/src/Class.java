// 학급(반)
// 학생
// 학생
// 학생

// 1. 3명의 학생의 이름을 콘솔에 출력할 수 있음.
// 2. 학생 3명의 총 평균을 알려줄 수 있음.
// 3. 점수가 가장 높은 학생(참조)을 알려줄 수 있음. => 동일 점수. 1, 2 , 3 
// 학생(참조) -> return type이 학생이어야 함

class Students {
	private String name;
	private int kor, eng, math;

	public Students(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getAvg() {
		return (kor + eng + math) / 3;
	}

	// public String name() {
	// return getName();
	// }
}

class Class1 {
	private Students student1;
	private Students student2;
	private Students student3;

	public Class1(Students student1, Students student2, Students student3) {
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
	}

	public Students getStudent1() {
		return student1;
	}

	public void setStudent1(Students student1) {
		this.student1 = student1;
	}

	public Students getStudent2() {
		return student2;
	}

	public void setStudent2(Students student2) {
		this.student2 = student2;
	}

	public Students getStudent3() {
		return student3;
	}

	public void setStudent3(Students student3) {
		this.student3 = student3;
	}

	public void getAllName() {
		System.out.println(student1.getName());
		System.out.println(student2.getName());
		System.out.println(student3.getName());
	}

	public int getAllScore() {
		return (student1.getAvg() + student2.getAvg() + student3.getAvg()) / 3;
	}

	public void getAllAvg(int a, int b,int c) {
		a = student1.getAvg();
		b = student2.getAvg();
		c = student3.getAvg();
		/* if (student1.getAvg() == student2.getAvg() && student1.getAvg() == student3.getAvg()) {
			System.out.printf("%s, %d\n%s, %d\n%s, %d", student1.getName(), student1.getAvg(), student2.getName(),
					student2.getAvg(), student3.getName(), student3.getAvg());
		} else if (student1.getAvg() > student2.getAvg() && student1.getAvg() > student3.getAvg()) {
		 	System.out.printf("%s, %d", student1.getName(), student1.getAvg());
		} else if (student2.getAvg() > student3.getAvg()) {
			System.out.printf("%s, %d", student2.getName(), student2.getAvg());
		} else {
			System.out.printf("%s, %d", student3.getName(), student3.getAvg());
		} */
		
	}
	
	public int max(int left, int right) {
		return left > right ? left : right;
	}
}

public class Class {
	public static void main(String[] args) {
		Students student1 = new Students("전인하", 100, 10, 100);
		Students student2 = new Students("장예림", 100, 100, 100);
		Students student3 = new Students("길대수", 100, 100, 100);

		Class1 student11 = new Class1(student1, student2, student3);
		student11.getAllName();
		System.out.println(student11.getAllScore());
		student11.getAllAvg();
	}
}
