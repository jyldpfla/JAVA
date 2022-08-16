// break문 p.125
import java.util.*;

public class Averager {
	public static void main(String[] args) {
		int total = 0;
		int count = 1;
		Scanner scan = new Scanner(System.in);
		while (go) {
			System.out.print("점수를 입력하시오: ");
			int grade = scan.nextInt();
			go = (grade >= 0);
			
			if (go) {
				total += grade; // grade를 total에 축적
				count++; // 사용자의 기록이 있을 때마다 횟수 축적
			}
		}
		System.out.println("평균은 " + total / count);
	}
}