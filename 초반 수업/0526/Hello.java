// 2. 전달받은 정수만큼 "안녕"이라는 문자열을 출력하는 메소드. (return type : void)
import java.util.Scanner;

public class Hello {
	public static void hello1(int c) {
		for(int b = 1; b <= c ; b++) {
			System.out.println("안녕");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int a = scan.nextInt();
		
		hello1(a);
		
	}
}
