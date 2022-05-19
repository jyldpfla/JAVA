// 사용자가 3대 측정
// 벤치, 스쿼트, 데드
//합이 500 이상이면 true
// false

import java.util.Scanner;

public class UnderArmour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("벤치: ");
		int a = input.nextInt();
		System.out.print("스쿼트: ");
		int b = input.nextInt();
		System.out.print("데드: ");
		int c = input.nextInt();
		
		System.out.print("3대 측정값이 500이 넘습니까? " + (a + b + c >= 500));
		// System.out.println(500 <= a + b + c);
	}
}