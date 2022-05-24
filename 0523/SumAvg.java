// 사용자가 몇 개의 정수를 입력할지 먼저 정한 후.
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램

// 짝수
// 홀수 

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("몇 개의 정수를 입력하시겠습니까?");
		int a = input.nextInt();
		int sum = 0;
		System.out.println("정수를 입력하세요");
		
		for (int b = 0; b < a ; b++) {
			int num =  input.nextInt();
			sum += num;
			
			//sum += input.nextInt(); 로 축약 가능
		} 
		int avg = sum / a;
		
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
		
		
		int sum2 = 0;
		for (int b = 0; b < a; b++) {
			int num= input.nextInt();
			if (num % 2 == 0) {
				sum2 += num;
			}
		}

		System.out.printf("짝수의 합: %d,\n평균: %d", sum2, sum2 / a);
		
		int sum3 = 0;
		for (int b = 0; b < a; b++) {
			int num= input.nextInt();
			if (num % 2 == 1) {
				sum2 += num;
			}
		}

		System.out.printf("홀수의 합: %d,\n평균: %d", sum3, sum3 / a);
		
		/*
		int sumEven = 0;
		int sumOdd = 0;
		int countEven = 0;
		int countOdd = 0;
		for (int i = 0; i < count; i ++) {
			int num = scan.nextInt();
			if (num % 2 == 0) {
				sumEven += num;
				countEven++;
			} else {
				sumOdd += num;
				countOdd++;
			}
		}
		*/
		
	}
}