// 사용자에게 5번의 정수를 입력 받아
// 최근 입력한 순(역순)으로 출력하기

// 예) 10 20 30 40 50 -> 50 40 30 20 10

// 사용자가 0 이하의 정수를 입력할 때까지 반복하여 입력 p.228
// 최근 5개를 출력(순서 상관없음)

// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		// 1번
		int[] fiveBox = new int[5];
		
		for(int i = 0; i < fiveBox.length; i++) {
			System.out.println("정수를 입력하세요: ");
			Scanner scan = new Scanner(System.in);
			fiveBox[i] = scan.nextInt();	
			if (i == fiveBox.length - 1) {
				for (int j = fiveBox.length - 1; j >= 0; j--) {
					System.out.print(fiveBox[j]);
				}
			}
			System.out.println();
		}
		
		// 1번 쌤 답
//		Scanner scan = new Scanner(System.in);
//		int[] arr = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}
		
		
		// 2번
		int size = 0;
		int[] minusBox = new int[size];
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		do {
			System.out.println("정수를 입력하세요: ");
			minusBox[i] = scan.nextInt();
			i++;
			size = i + 1;
		} while(i >= 0);
		
		System.out.println(minusBox[i]);
		
		// 2번 쌤 답
//		Scanner scan = new Scanner(System.in);
//		final int MAX_LENGTH = 5;
//		int[] arr = new int[MAX_LENGTH];
//
//		int i = 0;
//
//		while (true) {
//			int n = scan.nextInt();
//			if (n <= 0) {
//				break;
//			}
//			arr[i] = n;
//
//			i++;
//
//			if (i == MAX_LENGTH) {
//				i = 0;
//			}
//		}
//		scan.close();
//		for (i = 0; i < MAX_LENGTH; i++) {
//			System.out.println(arr[i]);
//		}

		
	}
}
