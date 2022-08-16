// 반복문 깨기
public class LoopBreak {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i ++) {
			if (i == 5) {
				break; // 반복문 내에 위치할 경우, 반복문 내에서 마주치는 순간 그 즉시 반복문 종료 + 정상 흐름으로
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
		
		for (int i = 10; i < 20; i ++) {
			if (i % 10 == 5) {
				continue; // 반복문을 종료시키진 않지만, 현재 단계를 건너뛰게 함 건너뛰구 다시 증감식으로 돌아감
			}
			System.out.println(i);
		}
		
		System.out.println("프로그램 종료");
		
		int i = 20;
		while (i < 30) {
			// if (i == 25) {
				// continue; // continue를 만나는 순간 조건식으로 다시 넘어감, loop가 끝나지 않고 계속 반복
			// }
			if (i != 25) {
				System.out.println(i);
			}
			i++;
			System.out.println(i);
			i++;
		}
		
		System.out.println("프로그램 종료");
	}
}

