// 사용자가 입력한 두 정수의 합을 출력하고, 0이면 true를 출력하고
// 그렇지 않은 경우 false를 출력해보세요.

import java.util.Scanner;

public class TestSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 1: ");
		int a = input.nextInt();
		System.out.print("정수 2: ");
		int b = input.nextInt();
		
		int sum = a + b;
		
		System.out.println("두 정수의 합: " + sum);
		
		System.out.println("두 수의 합이 0과 같나요? " + (0 == sum));
		//boolean result = (sum == 0 );
		//System.out.println("두 수의 합이 0과 같나요? " + result);
		
		
	}
}