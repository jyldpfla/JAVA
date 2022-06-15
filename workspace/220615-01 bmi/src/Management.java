import java.util.Arrays;
import java.util.Scanner;


public class Management extends Member {
	private int count = 1;
	private Member[] arr = new Member[count];
	
	public Member[] getInfo() {
		Scanner scan = new Scanner(System.in);
		
		String a;
		double b, c;
		Member d = new Member();
		
		for(int i = 0; i < count; i++) {
			System.out.println("회원 이름을 입력하세요");
			a = scan.nextLine();
			System.out.println("회원의 키(m)를 입력하세요");
			b = scan.nextDouble();
			System.out.println("회원의 몸무게를 입력하세요");
			c = scan.nextDouble();
			scan.nextLine();
			d = {a, b, c);
			arr[i] = d;
		}
		return arr;
	} 
	
	
}
	
	

