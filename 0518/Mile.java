// 73p 1번 (마일 → 킬로미터)
import java.util.Scanner;

public class Mile {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오: ");
		double mile = input.nextDouble();
		double km = mile * 1.609;
		System.out.print(mile + "마일은" + km + "킬로미터입니다.");
	}
}