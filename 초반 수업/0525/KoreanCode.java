// 주민번호를 입력하면 
// 성별을 출력하는 프로그램
// 예) xxxxxx-1xxxxxx(-있어서 문자열로 출력)

import java.util.Scanner;

public class KoreanCode {
	public static void main(String[] args) {
		Scanner idcard = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요(xxxxxx-xxxxxxx 형식)");
		String id = idcard.nextLine();
		char a = id.charAt(7);
		String b = "";
		
		switch (a) {
			case '1':
			case '3': 
				b = "남";
				System.out.println("성별: " + b); 
			break;
			case '2':
			case '4':
				b = "여";
				System.out.println("성별: " + b); 
			break;
			default: System.out.println("잘못된 접근입니다."); 
		}
		
		/*쌤 답
		String result;
		
		if (code.length() == 14) {
			char c = code.charAt(7);
			switch (c) {
				case '1': case '3':
					result = "남성";
				break;
				case '2': case '4':
					result = "여성";
				break;
				default:
					result = "잘못 입력";
				break;
			} else {
				result = "잘못 입력";
			}
			System.out.println(result);
		}
		*/
	}
}