import java.util.Scanner;

public class TestMethod4 {
	// 정수 하나를 전달받아 1 ~ 100 사이의 수이면 true를 반환하고, 그렇지 않으면 false를 반환하는 메소드 작성.
	// public static int one(int a) {
		
	// }
	// public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		
		// System.out.println("정수 하나를 입력하세요.");
		// int a = scan.nextInt();
		
	// }	
	
	// 쌤 답
	// 리턴타입 between(파라미터(개수,타입,순서))
	public static boolean between(int number) {
		if (number >= 1 && number <= 100) {
			return true;
		} else {
			return false;
		}
	}	
	
	// 사용자가 국어, 영어, 수학 점수 입력을 하는데 (사용자 입력값은 무조건 1 ~ 100 사이여야함.)
	// 입력한 점수와, 점수 합을 출력해보세요~~~ , 잘못 입력했으면 잘못 입력했다고 출력
	// public static int sum(int a, int b, int c) {
	// }
	
	// public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		
		// System.out.print("국어 점수: ");
		// int kor = scan.nextInt();
		
		// if (kor >= 1 && kor <= 100) {
			// System.out.print("영어 점수: ");
			// int eng = scan.nextInt();
			// if (eng >= 1 && eng <= 100) {
				// System.out.print("수학 점수: ");
				// int math = scan.nextInt();
				// for(math; math >= 1 or math <= 100) {
					
				// }
			// }
		// } else {
			
		// }
		
	// 쌤 답
	//스캐너 선언 초기화
	Scanner scanner = new Scanner(System.in);
	int kor;
	int eng;
	int math;
	do {
		// 국어 점수 입력받기
		System.out.println("국어 점수?");
		kor = scanner.nextInt();
		// 국어 점수 확인하기
	} while (!(between(kor)));
	
	// 1. 범위가 맞으면 다음, 2. 틀리면 다시 입력.
	
	// 영어 점수 입력
	do {
		System.out.println("영어 점수?");
		eng = scanner.nextInt();
		// 1. 범위가 맞으면 다음, 2. 틀리면 다시 입력.
	} while (!(between(eng)));
	
	// 수학
	do {
		System.out.println("수학 점수?");
		math = scanner.nextInt();
		// 1. 범위가 맞으면 다음, 2. 틀리면 다시 입력.
	} while (!(between(math)));
	
	// 합 구하기
	int sum = kor + eng + math;
	// 국영수 점수 출력
	System.out.println("국어점수: " + kor);
	System.out.println("영어점수: " + eng);
	System.out.println("수학점수: " + math);
	// 합 출력
	System.out.println("총합: " + sum);
	
		
	}
	
}
