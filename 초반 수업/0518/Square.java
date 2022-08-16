//pow 혼자 해보기
import java.util.Scanner;

public class Square {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int x = input.nextInt();
		
		int square = x*x;
		
		System.out.println("제곱한 수: " + square);
		
	}
}