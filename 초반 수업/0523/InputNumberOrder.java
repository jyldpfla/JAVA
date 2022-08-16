//6의 배수를 순서대로 입력하세요.
// 6
// Ok
// 12
// OK
// 13
// 틀렸습니다. 종료

// 2 ~ 9까지의 무작위의 수를 정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력하게 하여
// 틀릴 경우 종료

// 예) 랜덤 수가 6일 경우

// 사용자 입력
// 6 O
// 12 O
// 18 O
// 21 X 종료

import java.util.Scanner;
/*
import java.util.Random;

public class InputNumberOrder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int number = random.nextInt(8) + 2;
		
		System.out.println(number + "배수를 순서대로 입력하세요.");
		
		int answer = 0;
		while (true) {
			answer += number;
			int userInput = scan.nextInt();
			// 정답과 비교
			if (answer != userInput) {
				break;
			}
		}
		System.out.println("종료");
	}
}
*/

public class InputNumberOrder {
	public static void main(String[] args) {
		java.util.Random random = new java.util.Random(); // 같은 이름을 가진 class가 있으면 근처의 class를 이용하여 변수를 만듦
		// util의 random으로 객체를 만든 것이 아닌, 파일이름 클래스의 객체로 만들어서 error 걸릴 수 있으므로 이런식으로 써주면 해결
		Scanner scan = new Scanner(System.in);
		
		// 0 ~ 7까지 나오게 하고 2씩 더하기, 0,1이 나오면 다시 고르게 반복문 사용
		int start = random.nextInt(7) + 2;
		System.out.println(start);
	
	
		
	}
}