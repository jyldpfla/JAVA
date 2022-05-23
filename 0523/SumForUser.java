import java.util. Scanner;

public class SumForUser {
	public static void main(String[] args) {
		//사용자가 정수 범위를 지정 (시작-끝 입력)
		// 합
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 범위 시작: ");
		int a = scan.nextInt();
		System.out.print("정수 범위 끝: ");
		int b = scan.nextInt();
		
		int sum = 0;
		for (;a <= b; a++) {
			sum += a ;
		}
		System.out.println(sum);
	}
} 