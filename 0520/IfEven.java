// if else 문

// 사용자가 정수를 입력받아
// 짝수면 "짝수입니다." 출력하기
// 홀수면 "홀수입니다." 출력하기

import java.util.Scanner;

public class IfEven {
	public static void main(String[] args) {
		/*
		if(조건식) {
			// 문장 1
			// 문장 2
		} else {
			// 문장 3
			// 문장 4
		}
		//문장 5
		// 참이면 문장 125 거짓이면 문장 345
		*/


		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수: ");
		int number = scanner.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		} 
		
		
		System.out.println("프로그램 종료");
	}
}  