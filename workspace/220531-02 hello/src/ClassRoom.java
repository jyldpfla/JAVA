// 쌤 답
public class ClassRoom {
	private Student stu1;
	// 학생의 정보(이름, 성적)를 관리할 수 있는 데이터 타입 - String, 정보 하나씩 쓰기 어려움
	// type Student로 사용
	private Student stu2;
	private Student stu3;
	
	public ClassRoom() {}
	// 기본생성자, 생성자 없어도 됨
	// 생성자의 목적은 초기화,기본 생성자를 써둬서 초기화 방법을 여러개 만들어 둔 것
	// 아래 생성자와 달리 학생 3명의 참조가 필요 없어짐
	
	public ClassRoom(Student stu1, Student stu2, Student stu3) {
		super();
		this.stu1 = stu1;
		this.stu2 = stu2;
		this.stu3 = stu3;
	}
	
	// 학생 이름 호출하는 메소드
	public void printNames() { // 학생 정보 다 받아져 있으므로 변수 필요x, return값 필요 x
		System.out.println("1번 학생: " + stu1.getName());
		System.out.println("2번 학생: " + stu2.getName());
		System.out.println("3번 학생: " + stu3.getName());
	}
	
	// 3명 학생의 평균 구하기
	public int getTotalAvg() {
		return (stu1.getAverage() + stu2.getAverage() + stu3.getAverage()) / 3;
		// 값 저장이 안되므로 sysout으로 값 출력 or 메소드로 호출하기 위해 반환 값 내기
	}
	
	// 최상위 성적 학생 구하기
	public Student getTop() { // 학생 정보가 필요하므로 type은 Student
		return	max(max(stu1, stu2), stu3);
		
		// compare 메소드 이용한 방법
//		if(stu1.compare(stu2) && stu1.compare(stu3)) {
//			return stu1;
//		} else if(stu2.compare(stu1) && stu2.compare(stu3)) {
//			return stu2;
//		} else {
//			return stu3;
//		}
	}
	
	// 학생 간 성적 비교 - 최고 성적 구해서 학생 정보 출력
	public Student max(Student left, Student right) {
		if(left.getAverage() >= right.getAverage()) {
			return left;
		} else {
			return right;
		}
	}
	
	public Student getStu1() {
		return stu1; // 학생 1명에 대한 참조(이름, 성적)를 알려줌
	} 

	public void setStu1(Student stu1) {
		this.stu1 = stu1;
	}

	public Student getStu2() {
		return stu2;
	}

	public void setStu2(Student stu2) {
		this.stu2 = stu2;
	}

	public Student getStu3() {
		return stu3;
	}

	public void setStu3(Student stu3) {
		this.stu3 = stu3;
	}
	
	
	
}
