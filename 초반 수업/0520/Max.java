// 3개의 정수를 입력받아
// 가장 큰 수를 출력하세요.

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		System.out.print("정수 1: ");
		int x = number.nextInt();
		System.out.print("정수 2: ");
		int y = number.nextInt();
		System.out.print("정수 3: ");
		int z = number.nextInt();
		// Sytem.out.println("3개의 정수를 입력하세요");
		//int a = number.nextInt();
		//int b = number.nextInt();
		//int c = number.nextInt();
		
		if (z > x && z> y) {
			System.out.print(z);
		} else {
			if (x > y) {
				System.out.print(x);
			} else {
				System.out.print(y);
			}
		} 
		/*
		int max;
		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b >c) {
				max = b;
			} else {
				max = c;
			}
		}
		*/ 
	}
}