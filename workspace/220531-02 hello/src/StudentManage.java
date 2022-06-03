import java.util.Scanner;

public class StudentManage {
	private ClassRoom room;
	
	// 학생 정보 입력받기
	public Student inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 정보, 이름, 국영수 순으로 입력해주세요.");
		String name = scan.nextLine();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		return new Student(name, kor, eng, math);
	}
	
	// 학생 정보 담기
	public void start() {
		Student stu1 = inputStudent();		
		Student stu2 = inputStudent();		
		Student stu3 = inputStudent();		
		
		// 학생의 정보가 담긴 필드(방) 만들기
		room = new ClassRoom(stu1, stu2, stu3);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴");
		System.out.println("1. 학생 이름 보기 2. 총 평균 보기 3. 1등 보기");
		int number = scan.nextInt();
		
		if(number == 1) {
			room.printNames();
		} else if (number == 2) {
			System.out.println("총 평균: " + room.getTotalAvg());
		} else if (number == 3) {
			Student top = room.getTop();
			System.out.println(top.getName());
			System.out.println(top.getAverage());
		}
	}
}
