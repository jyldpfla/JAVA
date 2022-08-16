// 사용자에게 국어, 영어, 수학 점수를 정수로 입력받아
// 총점과 평균점수를 출력하는 프로그램

import java.util.Scanner;

public class Score{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int korean = scan.nextInt();
		
		System.out.print("영어 점수: ");
		int english = scan.nextInt();
		
		System.out.print("수학 점수: ");
		int math = scan.nextInt();
		
		System.out.println("총점: " + (korean + english + math));
		System.out.println("평균 점수: " + ((korean + english + math) / 3));
	}
}

/* 선생님 답
import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어점수?? ");
		int kor = scan.nextInt; 
		System.out.print("영어점수?? ");
		int eng = scan.nextInt; 
		System.out.print("수학점수?? ");
		int math = scan.nextInt;
		
		int sum = kor + eng + math;
		int avg = sum /3;
		
		System.out.println("합은 : " + sum);
		System.out.println(("평균은 : " + avg)'
	}
}
*/