// 사용자가 입력한 정수가
// 짝수면 true
// 홀수면 false를 출력해보세요.

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수: ");
		int a = input.nextInt();
		
		boolean result = (a % 2) == 0;
		System.out.print("이 정수는 짝수인가요? " + result);
	} 
}