// 사용자가 입력한 원하는 반복 만큼만
// 0부터 1씩 증가하는 수를 출력하기.

import java.util.Scanner;

public class LoopInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("원하는 반복횟수: ");
		int i = input.nextInt();
		
		int j = 0;
		while (j <= i) {
			System.out.println(j);
			j++;
		}
	}
}