// 반복을 이용한 게임 프로그램

import java.util.Random;
import java.util.*; // *이면 random도 필요없음

public class LetterGame {
	public static void main(String[] args) {
		// Random random = new Random();
		// int number = random.nextInt();
		// System.out.println(number);
		
		Random random = new Random(); // 랜덤 객체를 이용하면
		Scanner scan = new Scanner(System.in);
		
		int answer = random.nextInt(100); // 랜덤한 인수를 만들 수 있음
		int guess;
		int tries = 0;
		
		// 반복 구조
		do {
			System.out.print("정답을 추측하여 보시오: ");
			guess = scan.nextInt();
			tries++;
			
			if (guess > answer)
				System.out.println("제시한 정수가 높습니다.");
			if (guess < answer)
				System.out.println("제시한 정수가 낮습니다.");
		}	while (guess != answer);
		
		System.out.printf("축하합니다. 시도 횟수=%d \n", tries);
	}
}