//do while 문
import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		// while (false) {
			// 문장 1
		// }
		Scanner scan = new Scanner(System.in);
		System.out.println("10을 나눌 수 입력하셈");
		
		/*
		int num = scan.nextInt();
		if (num == 0) {
			System.out.println("0으로 나눌 수 없음");
		} else {
			System.out.println(10 / num);
		}
		*/
		
		int num;
		do {
			num = scan.nextInt();
			if (num == 0) {
				System.out.println("0으로 나눌 수 없음");
			}
		} while (num == 0);
			System.out.println(10 / num);
	}
}