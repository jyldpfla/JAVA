import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
		final int STUDENTS = 5;
		// 길이가 5인 정수형 배열
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS];
		// 길이값을 변수로 넣어주면 길이값 조정 가능
		
		for (int i = 0; i < STUDENTS; i++) {
			System.out.print("성적을 입력하시오:");
			scores[i] = scan.nextInt();
		}
		
		int total = 0;
		for (int i = 0; i < STUDENTS; i++) {
			total += scores[i];
		}
		
		System.out.println("평균 성적은" + total / STUDENTS + "입니다" );
	}
}
