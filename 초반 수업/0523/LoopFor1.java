// for 반복문
public class LoopFor1 {
	public static void main(String[] args) {
		// "반복"이라는 문자열 5번 출력하기
		for (int i = 0; i < 5; i ++) {
		// for (변수 선언 + 초기화;조건식;증감식) {명령문}
			System.out.println("출력");
		}
		
		// System.out.println(i); // for문에서 선언된 변수 바깥에서 사용x (지역변수이므로)
		
		// 1부터 10까지 출력하기 (for)
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		// 21부터 30까지의 3의 배수 출력하기
		for (int i = 21; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		/* 답
		for (int i = 21; i <= 30; i += 3) {
			System.out.println(i);
		}
		*/
		
		// 30 29 28 ... 20 까지 역순 출력
		for (int i = 30; i >= 20; i--) {
			System.out.println(i);
		}
			
		// 기존 while 반복문
		/*
		int i = 0;
		while (i < 5) {
			System.out.println("출력");
			i++;
		}
		*/
	}
}
