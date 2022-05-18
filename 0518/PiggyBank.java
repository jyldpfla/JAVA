//102p 6번 (저금통)

import java.util.Scanner;

public class PiggyBank {
	public static void main(String[] args) {
		
		Scanner pin = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int m500 = pin.nextInt();
		System.out.print("100원 개수: ");
		int m100 = pin.nextInt();
		System.out.print("50원 개수: ");
		int m50 = pin.nextInt();
		System.out.print("10원 개수: ");
		int m10 = pin.nextInt();
		
		int sum = m500 * 500 + m100 * 100 + m50 * 50 + m10 * 10;
		System.out.print("총 금액은 " + sum + "원 입니다.");
		
	}
}