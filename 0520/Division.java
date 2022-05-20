// 정수 2개를 입력받아서 큰 수에서~ 작은 수로 나눈 몫과 나머지를 출력

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		// 정수 a,b 입력 받기
		System.out.print("정수 1: ");
		int x = number.nextInt();
		System.out.print("정수 2: ");
		int y = number.nextInt();
		// 0으로 나누면 멈추므로 조건 부여
		if (a != 0 && b != 0) {
			if (x > y) {
				// a / b, a % b 계산 및 결과 출력
				//System.out.print("몫: " + (x / y) + " 나머지: " + (x % y));
				System.out.printf("%s %d %s %d", "몫: ", (x / y), " 나머지: ", (x % y));
			} else {
				// b / a, b % a 계산 및 결과 출력
				System.out.print("몫: " + (y / x) + " 나머지: " + (y % x));
				
			// 나누기 많이 쓰니까 변수 지정해도 좋을 듯!
			}
		} else {
			System.out.println("0을 입력하면 안되지롱이");
		}
	}
}