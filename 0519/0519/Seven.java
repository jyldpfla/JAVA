// 1. 사용자가 입력한 정수가 0이상이며 7의 배수일 때만 true를 출력하세요.

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수: ");
		int seven = input.nextInt();
		
		System.out.print(seven >= 0 && seven % 7 == 0);
	}
}