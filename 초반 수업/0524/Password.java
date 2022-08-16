// 사용자에게 비밀번호(정해진 문자열)를 물어보고 동일할 경우 통과
// 최대 3번의 기회를 줌

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = "password";
		
		
		int count = 1;
		
		while (count <= 3) {
			System.out.print("비밀번호를 입력하세요: ");
			String line2 = scan.nextLine();
			if(line2.equals(line)) {
				System.out.print("로그인 되었습니다.");
				break;
			} else if (count == 3) {
				System.out.print("로그인하실 수 없습니다.");
				break;
			} else {
				System.out.print("잘못된 비밀번호입니다.");
				count++;
			}
		}
		
		/* 쌤 답
		String password = "1q2w3e";
		String userInput;
		boolean isOk = false;
		int count = 3;
		
		do {
			System.out.println("비밀번호를 입력하세요");
			userInput = scan.nextLine();
			count--;
			System.out.println("현재 카운트값 확인: " + count);
			// 비밀번호가 틀렸고 아직 기회가 남아있으면
			isOk = password.equals(userInput);
		} while (!password.equals(userInput) && count > 0);
		
		if (isOk) {
			System.out.println("통과~~");
		} else {
			System.out.println("비밀번호를 확인해주세영")
		}
		*/ 
	}
}

