import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main10T {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "배", "수박"));

		Scanner scan = new Scanner(System.in);

		while (list.size() < 10) {
			try {
				System.out.println("1번 목록  2번 과일주기  3번 과일추가  4번 시스템 종료");
				int input = scan.nextInt();
				
				if (input == 1) {
					for (String s : list) {
						System.out.println(s);
					}
				}
				else if (input == 2) {
					list.remove(0);
					for (String s : list) {
						System.out.println(s);
					}
				}
				else if (input == 3) {
					System.out.println("과일을 추가해주세요");
					scan.nextLine();
					String fruit = scan.nextLine();
	
					if (list.contains(fruit)) {
						System.out.println("이미 있는 과일입니다.");
					} else {
						list.add(fruit);
					}
					System.out.println(list);
				}
				else if (input == 4) {
					System.out.println("시스템 종료");
					break;
				} else {
					System.out.println("1 ~ 4 까지 입력하세요.");
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해야 하는데 문자를 입력하셨어요");
				scan.nextLine();
				
				/*
				 * 이번 오류는 비슷하게 계속 scan의 값에 문자열이 저장 되어있어서 try catch가 계속 일어 난 것이다. 그래서 enter먹여준 것
				 * 처럼 scan.nextLine();을 해야 한다.
				 */
			}
		}

		// 콘솔 입출력
		// 과일 목록 보여주기
		// 과일 주기(제일 앞에서부터 줌)
		// 재고 과일 추가하기(제일 마지막에 추가)
	}
}
