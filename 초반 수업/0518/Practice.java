// 사용자의 사각형의 밑변과 높이를 정수로 입력
// 사각형의 둘레와 넓이를 출력
// rectangle 혼자해보기

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x; // 밑변
		int y; // 높이
		int length;
		int extent;
		
		System.out.print("밑변: ");
		x = input.nextInt();
		
		System.out.print("높이: ");
		y = input.nextInt();
		
		length = (x + y) * 2;
		extent = x * y;
		
		System.out.println("둘레: " + length);
		System.out.println("넓이: " + extent);
		
	}
}