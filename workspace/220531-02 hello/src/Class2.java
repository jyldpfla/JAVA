// 학생 관리 프로그램
// 콘솔 입출력
// 반에 학생을 등록. 3명
// 이름 목록을 볼 수 있어야 하고
// 평균을 볼 수 있고
// 1등 학생의 정보도 볼 수 있는 프로그램.
// 자유롭게

// 기존에 만들었던 클래스 << 수정. 수정을 해야하는 이유와 전 후가 어떻게 바뀌었는지 '다 기록'

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
//		if() {
//			System.out.printf("%s, %d\n%s, %d\n%s, %d", student1.getName(), student1.getAvg(), student2.getName(),
//					student2.getAvg(), student3.getName(), student3.getAvg());
//		} 
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
		if(a >= max(b, c)) {
			
		}
		
	}
	
	public int max(int left, int right) {
		return left >= right ? left : right;
	}
	
	// 학생 이름이랑 성적 출력 class 만들기, if문에서 짧게 줄여 쓸라고오!!!
	public void nameScore(String na, int Sc) {
		System.out.println(studen);
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
		// student11.getAllAvg();
	}
}

