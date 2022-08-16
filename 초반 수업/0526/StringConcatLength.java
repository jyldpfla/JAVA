// 3. 전달받은(입력받은) 두 문자열의 길이 값의 합을 반환하는 메소드.
import java.util.Scanner;

public class StringConcatLength {
	public static int length1(String a, String b) {
		int c = a.length();
		int d = b.length();
		return c + d;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단어를 입력해주세요");
		String text1 = scan.nextLine();
		System.out.println("단어를 입력해주세요");
		String text2 = scan.nextLine();
		
		int sum = length1(text1, text2);
		
		System.out.println("문자 길이의 합(공백 포함): " + sum);
	}
}