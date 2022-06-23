import java.util.*;
import java.util.Map.Entry;

class POSmachine {
	Map<String, Menu> menu = new HashMap<String, Menu>();
	List<Menu> orderSheet = new ArrayList<>();
	
	void addMenu(String name, int price) { // 메뉴 넣기
		Menu inputMenu = new Menu(name, price);
		menu.put(name, inputMenu);
	}

	void removeMenu(String inputName) { // 메뉴 빼기
		if (menu.containsKey(inputName)) {
			menu.remove(inputName);
		} else {
			System.out.println("없는 메뉴입니다.");
		}
	}
	
	void printAllMenu() { // 메뉴판 출력
		System.out.println("<메뉴>\t\t<가격>");
		System.out.println("--------------------------------------------");
		for (Entry<String, Menu> me : menu.entrySet()) {	// Entry로 반복문을 만들어 출력
			System.out.println(me.getValue());
		}
	}

	void inputOrder(String inputName, int inputNum) { // 주문 1번 넣기
		if (menu.containsKey(inputName)) {
			for (int i = 0; i < inputNum; i++) {	// list에 Menu를 넣는데, 수량만큼 반복
				orderSheet.add(menu.get(inputName));
			}
		} else {
			System.out.println("잘못된 입력");
		}
	}
	
	void resetOrder() {	// 주문서 초기화
		orderSheet = new ArrayList<>();
	}

	int calcAllPrice() { // 가격 리턴
		int price = 0;
		for (Menu a : orderSheet) {
			price += a.getPrice();
		}
		return price;
	}

	void printBill() { // 계산서 출력
		Map<Menu, Integer> bill = new HashMap<>();
		// Value(Integer): 수량
		
		for (Menu me : orderSheet) {	// bill HashMap 만들기: Wordfrep 참조
			Integer count = bill.get(me);	// key값이 없으면 null을 반환
			bill.put(me, (count == null) ? 1 : count + 1);	// 3항 연산자: count가 null이면 1 넣고 값이 있으면 1 더함
		}
	
		System.out.println("--------------------------------------------");
		System.out.println("<메뉴>\t\t<가격>\t<수량>\t<합산금액>");
		System.out.println("--------------------------------------------");
		
		for (Map.Entry<Menu, Integer> s : bill.entrySet()) {
			System.out.print(s.getKey());	// 메뉴와 가격
			System.out.print("\t" + s.getValue());	// 수량
			System.out.print("\t" + s.getValue()*s.getKey().getPrice()); // 합산금액 (수량*가격)
			System.out.println();
		}
		System.out.printf("[총 금액: %d원]\n", calcAllPrice());
	}
	
	void pay(int inputmoney) { // 계산. 간단하게 입력돈과 가격의 대소에 따라 적절한 콘솔 출력 
		int price = calcAllPrice();
		if (inputmoney >= price) {
			System.out.println("계산 완료. 거스름돈: " + (inputmoney - price));
			orderSheet = new ArrayList<>();	// 주문서 초기화. 다음 주문을 받아야 하므로.
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}