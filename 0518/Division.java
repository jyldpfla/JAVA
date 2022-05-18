//101p 2번 (나눈 몫과 나머지), 그냥 큰 수를 위에 쓰기로 문제 풀이

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int integer1 = input.nextInt();
		System.out.print("정수를 입력하시오: ");
		int integer2 = input.nextInt();
		
		int division = integer1 / integer2;
		int remainder = integer1 % integer2;
		System.out.print(integer1 + "을" + integer2 + "으로 나눈 몫은 " + division + "이고 나머지는 " + remainder + "입니다."  );
	}
}