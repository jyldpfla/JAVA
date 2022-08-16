//4단 말고도... 사용자의 입력을 받아 원하는 단수의 구구단 출력하는 프로그램.

import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	 
		System.out.print("원하는 단수를 입력하세요: ");
		int i = scanner.nextInt();
	 
		int j = 1;
		while (j <= 9) {
			System.out.printf("%d * %d = %d\n", i, j, i * j);
			j++;
		}
	} 
}