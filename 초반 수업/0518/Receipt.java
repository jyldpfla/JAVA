//73p 2번 (잔돈계산)
import java.util.Scanner;

public class Receipt {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("받은 돈: ");
		int rm = input.nextInt(); // 받은 돈
		System.out.print("상품의 총액: ");
		int tm = input.nextInt(); // 상품의 총액
		
		int vat = tm / 10;
		System.out.println("부가세: " + vat);
		int change = rm - tm;
		System.out.println("잔돈: " + change);
		
		
	}
}