// 사용자가 입력한 5자리의 정수를 역순으로 출력하는 프로그램
// 예) 12345 -> 54321
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("5자리 정수: ");
		int integer = input.nextInt();
		
		int reverse1 = (integer / 10000 );
		int reverse2 = (integer / 1000 % 10);
		int reverse3 = (integer / 100 % 10);
		int reverse4 = (integer / 10 % 10);
		int reverse5 = (integer / 1 % 10);
		
		System.out.print("정수를 역순으로 출력하면 "+reverse5+reverse4+reverse3+reverse2+reverse1 + "입니다.");
	}
}