import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "오렌지", "배", "수박", "멜론", "키위"));
		
		// 콘솔 입출력
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("원하는 항목을 선택하여 주세요.");
		System.out.println("1. 과일 목록");
		System.out.println("2. 과일 배송");
		System.out.println("3. 재고 과일 추가");
		int a = scan.nextInt();
		
		if(a == 1) {
			// 과일 목록 보여주기
			for(int i = 0; i < list.size(); i++) {
				System.out.println( (i+1) + "번 과일: " + list.get(i));
			}
		} else if(a == 2) {
			// 고객에게 과일 주기(제일 앞에거부터 줌)
			System.out.println("고객님께 " + list.get(0) + "을(를) 전달했습니다.");
			list.remove(0);
		} else if(a == 3) {
			// 재고 과일 추가하기(제일 마지막에 추가) - 진열대가 최대 10개
			System.out.println("몇 개의 과일을 추가하시겠습니까?");
			int b = scan.nextInt();
			if(b <= (10 - list.size())) {
				System.out.println(10 - list.size() + " 만큼의 진열대만 남아있습니다.");
			}
//			while(list.size() <= 10) {
//				
//			}
		}
		
		
		
	}
}