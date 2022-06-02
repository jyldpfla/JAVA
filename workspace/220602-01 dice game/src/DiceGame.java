import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	int diceFace;
	int userGuess;
	// 정수형 필드값 0으로 초기화

	private void RollDice() {
		Random random = new Random();
		// diceFace = (int) (Math.random() * 6) + 1
			// Math.random() : 객체를 만들지 않고(Math) 부를 수 있는 메소드, 랜덤값을 만듦(0포함~1미만 사이 실수값)
			// * 곱하는 수에 따라 자릿수가 바뀜, 최댓값은 5.xxx가 나오고 + 1을 하면, 6.xxx인데 (int) 값으로 소수점 자리를 지움
		diceFace = random.nextInt(6) + 1;
		// random.nextInt(값) : 값의 수만큼 0부터 값의 수만큼의 개수안에서 1개를 출력 
		// + 1 : 0부터가 아닌 1부터 출력
		// 위 diceFace를 좀 더 간단하게, diceFace라는 필드에 값 들어감
	}
	
	private void printPrompt(String prompt) {
		System.out.println(prompt);
	}
	
	private int getUserInput() { //return값타입 메소드호출할때사용할이름(메소드호출할때필요한것)
		// System.out.println(Prompt);
		// prompt에 startPlaying에 getUserInput의 값이 Prompt에 들어감
		Scanner s = new Scanner(System.in);
		// 입력한 값 넣기
		return s.nextInt();
		// return 값으로 나오게 하기
	}

	private boolean checkUserGuess() {
		if (diceFace == userGuess) {
			System.out.println("맞았습니다");
			return true;
		} else {
			System.out.println("틀렸습니다");
			return false;
		}
	}

	public void startPlaying() {
		while (true) {
			printPrompt("예상값을 입력하시오: ");
			userGuess = getUserInput();
			RollDice();
			boolean result = checkUserGuess();
			if (result) {
				break;
			}
		}
	}
}
