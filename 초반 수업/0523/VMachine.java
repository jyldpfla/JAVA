// 자판기 프로그램
// 돈 입력
// 반복하여 입력을 받아
// 1번 콜라 : 1500
// 2번 사이다 : 1300
// 3번 계산
// 총 몇 개의 캔을 구입하고, 거스름돈은 얼마인지 출력하세요 (외상 안 됨)

import java.util.Scanner;

public class VMachine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 금액 투입
		System.out.print("금액: ");
		int money = scan.nextInt();
		
		int coke = 0;
		int sprite = 0;
		
		// 금액이 충분하면 선택지 제공, 금액이 부족하면 잔액이 부족합니다.
		while (money >= 1300) {
			// 1300원이면 사이다만 선택할 수 있도록 + 1300 빼기
			if (money == 1300) {
				
			}
			// 1500원 이상이면 콜라 사이다 모두 택할 수 있도록 + 구입한 가격 만큼 -
			
		}
		
		
		/* 학생분1 답 - boolean 값을 이용하여 반복문이 진행되고 멈출 수 있도록 설정
		int cokeCount = 0;
		int ciderCount = 0;
		
		boolean con = true;
		
		while (con) {
			if(조건 검사) {
				con = !con // false로 바뀌었을 때 멈출 수 있도록
			}
		}
		*/
		
		/* 학생분 2 답 - 돈 입력, 선택지 제공, 잔돈 보여주면서 선택지 제공, 잔돈 쓸 수 있을 때까지 고를 수 있도록
		*/
		
	}
}
