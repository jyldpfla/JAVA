// 사용자의 학점
// 점수를 입력받아
// 90점 이상 A
// 80점 이상 90점 미만 B
// 70점 이상 80점 미만 C
// 60점 이상 70점 미만 D
// 60점 미만 F

import java.util.Scanner;

public class ScoreText {
	public static void main(String[] args) {
		Scanner credit = new Scanner(System.in);
		
		System.out.print("학점: ");
		int a = credit.nextInt();
		
		if (a >= 90) {
			System.out.print("A");
		} else if (80 <= a) {
			System.out.print("B");
		} else if (70 <= a) {
			System.out.print("C");
		} else if (60 <= a) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
		
		/*
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("학점은 " + grade);
		
		
		*/
	}
}
		