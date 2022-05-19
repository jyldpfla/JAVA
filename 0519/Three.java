// 2. 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 true를 출력하세요. 나머지 경우는 false
// 예) 1 2 3 -> true, 4 5 6 -> true, 7 9 10 -> false

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 1: ");
		int a = input.nextInt();
		System.out.print("정수 2: ");
		int b = input.nextInt();
		System.out.print("정수 3: ");
		int c = input.nextInt();
		
		System.out.print(b == (a + 1) && c == (b + 1));
		
		
	}
}

