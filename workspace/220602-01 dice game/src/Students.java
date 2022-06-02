import java.util.Scanner;

public class Students {
	private String name;
	private int kor, eng, math;
	String username;

//		public Students(String name, int kor, int eng, int math) {
//			this.name = name;
//			this.kor = kor;
//			this.eng = eng;
//			this.math = math;
//		}

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

	// 메뉴바
	public void getAll() {
		Scanner choice = new Scanner(System.in);
		int choice1 = 0;
		while (choice1 != 5) {
			System.out.println("1. 학생 정보 등록\n2.학생 이름 목록\n3. 반 학생 평균 \n4. 반 1등 학생 \n5. 프로그램 종료");
			choice1 = choice.nextInt();
			if (choice1 == 1) {
				getUser();
			} else {
				break;
			}
		} // do while은 결과에 상관없이 무조건 한 번은 실행됨
	}

	// 콘솔 입출력을 위한 학생 정보 받아오기
	public void getUser() {
		for (int a = 0; a < 3; ) {
			System.out.println("학생 정보를 기록하시겠습니까? 1. yes 2. no");
			Scanner answer1 = new Scanner(System.in);
			int answer = answer1.nextInt();
			if (answer == 1) {
				answer1.nextLine();
				System.out.println("학생 이름을 입력하세요: ");
				String username = answer1.nextLine();
				System.out.println("국어 성적을 입력하세요: ");
				int userkor = answer1.nextInt();
				System.out.println("영어 성적을 입력하세요: ");
				int usereng = answer1.nextInt();
				System.out.println("수학 성적을 입력하세요: ");
				int usermath = answer1.nextInt();
				if(a == 0) {
					
				}
				
				a += 1;
			} else {
				System.out.println("3명의 정보를 입력하여야 합니다.");
			}
		}
	}
	
}