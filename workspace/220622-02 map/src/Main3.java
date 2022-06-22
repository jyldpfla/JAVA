// 중국집 주문 가격 계산기

// 짜장면 : 2500
// 짬뽕 : 4000
// 볶음밥 : 4000
// 탕수육 : 10000

// 메뉴를 '추가'

// 계산 결과 출력 가능
import java.util.*;

public class Main3 {
	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("짜장면", 2500);
		map.put("짬뽕", 4000);
		map.put("볶음밥", 4000);
		map.put("탕수육", 10000);
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("원하시는 항목을 선택하여 주세요.");
			System.out.println("1. 메뉴 추가 \n2. 메뉴 선택 및 주문\n3. 프로그램 종료");
			int choice = scan.nextInt();
			if(choice == 1) {
				// 메뉴 추가하기
				scan.nextLine();
				System.out.println("----------------------------");
				System.out.println("추가하실 메뉴의 이름을 입력해주세요.");
				String name = scan.nextLine();
				if(map.containsKey(name)) {
					System.out.println("이미 존재하는 메뉴입니다.");
				} else {
					System.out.println("추가하실 메뉴의 가격을 입력해주세요.");
					int price = scan.nextInt();
					map.put(name, price);
					System.out.println(map.toString());
				}
			} else if(choice == 2) {
				// 메뉴 주문하기
				String menu = null;
				System.out.println("----------------------------");
				System.out.println("몇 가지 메뉴를 주문하시겠습니까?");
				int count = scan.nextInt();
				int money = 0;
				scan.nextLine();
				String[] menuList = new String[count];
				for(int i = 0; i < count; i++) {
					System.out.println("-------------------------------------------");
					System.out.println("메뉴를 선택하여 주세요");
					for (String key: map.keySet()) {
						System.out.println(key + " : " + map.get(key) +"원");
				}
					menu = scan.nextLine();
					money += map.get(menu);
					menuList[i] = menu;
				}
				// 영수증 개수 메소드
//				for(int i = 0; i < menuList.length; i++) {
//					if(menuList[i]) // 배열 같은 값의 개수 구하기 - 배열 중복 검사? 어떻게 해야하지?
//				}
				System.out.println("주문하신 메뉴의 계산 금액은 " + money + "원 입니다.");
				
				// 영수증 출력 (by 인하쌤 주문)
				System.out.println("영수증을 받으시겠습니까? \n1. 예\n2. 아니오");
				int receiptC = scan.nextInt();
				if(receiptC == 1) {
					
				}
				
			} else if(choice == 3) {
				System.out.println("----------------------------");
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("----------------------------");
				System.out.println("잘못된 선택입니다. 다시 선택하여 주세요.");
			}
		}
	} 
}
