// 사용자의 입력 n, m에 대해
// n^m(n의 m제곱)을 출력하기

import java.util.Scanner;

public class Pow {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1: ");
		int n = scan.nextInt();
		
		System.out.print("제곱 수: ");
		int m = scan.nextInt();
		
		/* 답
		long pow = 1;
		for (int i = 0; i <m; i++) {
			pow *= n;
		}
		System.out.println(pow);
		*/
		
		int num1 = 1;
		//int j = n;
		
		for (int i = 0; i < m; i++) {
			int num2 = num1 * n;
			num1 = num2;
			System.out.println(num2);
			// System.out.println(j);
			// j = n * j;
		}
	}
}