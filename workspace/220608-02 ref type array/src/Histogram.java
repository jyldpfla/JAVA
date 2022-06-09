// p237 2번
// 배열 index마다 입력한 값이 들어가도록 반복문 작성 
// 배열의 index마다 *이 출력되도록 for문 작성 + 값에 맞춰서 알맞은 십의자리에 들어가도록 for, if조건문 작성 (만약에 
// 출력

import java.util.Scanner;

public class Histogram {
	public static void number(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= 1 && a[i] <= 10) {
				System.out.println("1 - 10: " + "*");
			}
		}
//	 	for (int j = 0; j < a.length; j++) {
//			for(int i = 0; i <= 90 ;) {
//				System.out.printf("%d - %d: \n", i + 1, i + 10);
//				i += 10;
//			}
//	 	}
		
	}


	
	public static void main(String[] args) {
		int[] integer = new int[10];
		Scanner scan = new Scanner(System.in);
			for(int i = 0; i < integer.length; i++) {
				System.out.println("정수를 입력하세요: ");
				integer[i] = scan.nextInt();
			}
	}
}
