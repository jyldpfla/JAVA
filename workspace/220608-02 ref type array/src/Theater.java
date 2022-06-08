// p237 1번
import java.util.Scanner;
import java.util.Arrays;

public class Theater {
	public static void seat(int[] arr) {
		System.out.println("현재는 예약 상태는 다음과 같습니다. \n -----------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10 \n -----------------------");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = new int[10];
		while (true) {
			System.out.println("좌석을 예약하시겠습니까?(1 또는 0)");
			Scanner scan = new Scanner(System.in);
			int r = scan.nextInt();
			if(r == 1) {
				seat(arr);
				System.out.println("몇번째 좌석을 예약하시겠습니까?");
				int r2 = scan.nextInt();
				arr[r2 - 1] = 1;
				System.out.println("예약되었습니다.");
			} else if(r == 0) {
				System.out.println(Arrays.toString(arr));
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
