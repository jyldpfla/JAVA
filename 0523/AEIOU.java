// 사용자가 입력한 영단어(latin 문자열)에서 모음(a e i o u)이 몇 개인지 출력하세요. 혼자해보기이

import java.util.Scanner;

public class AEIOU {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		
		int length = line.length();
		int count = 0;
		for (int i = 0; i < length; i++) { // i값 0부터 하나씩 올라감
			char c = line.charAt(i); // for문이므로 반복되면서 index 0부터 한글자씩 확인
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		System.out.println("모음 개수: " + count);
	}
}