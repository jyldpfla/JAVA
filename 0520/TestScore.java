// 사용자의 점수(정수형)를 입력받아
// 60점 이상이면 "합격" 출력
// 60점 미만이면 "불합격" 문자열과 부족한 점수도 같이 출력

import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		if (score >= 60) {
			System.out.print("합격");
		} else {
			System.out.print("불합격 부족한 점수: " + (60 - score) + "점");
			//System.out.printf("%s %d", "부족한 점수: ", 60 - score);
		}
	}
}