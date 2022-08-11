import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
	public static void main(String[] args) {
		String line1 = "lowercase";
		String line2 = "UPPERCASE";
		String line3 = "1q2w3e";

//		Pattern p = Pattern.compile("[a-z]{9}");
//		Matcher m = p.matcher(line1);
//		
//		Pattern p1 = Pattern.compile("[A-Z]{9}");
//		Matcher m1 = p1.matcher(line2);
//		
//		System.out.println(m1.matches());
//		// 해당 정규표현식이랑 검사할 문장이 같으면 true

//		Pattern p = Pattern.compile("[0-9a-z]{6}");
//		// 숫자, 영소문자가 섞여있는지 확인, 범위가 숫자여도 되고, 영소문자여도 됨
//		Matcher m = p.matcher(line3);
//		System.out.println(m.matches());

		// 아이디는 영소문자와 숫자로 이루어져야하고 최소 6자, 최대 10자 (영문자로 시작해야함)
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = scan.nextLine();

		Pattern p = Pattern.compile("[a-z][a-z0-9]{5,9}");
		Matcher m = p.matcher(id);

		if (m.matches()) {
			System.out.println("입력 완료");
		} else {
			System.out.println("올바르지 않은 입력값입니다.");
		}
		
		// 올바른 전화번호 (010-####-####)
		System.out.println("전화번호를 입력하세요(형식 : 010-####-####)");
		String number = scan.nextLine();
		Pattern pn= Pattern.compile("010-[0-9]{4}-[0-9]{4}");
		
		if(number.matches("010-[0-9]{4}-[0-9]{4}")) {
//		if(pn.matcher(number).matches()) { // 위랑 같음
			System.out.println("good");
		} else {
			System.out.println("다시 써죠");
		}
		
	}
}
