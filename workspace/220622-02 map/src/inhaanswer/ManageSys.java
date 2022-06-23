import java.util.*;

class ManageSys {
	
	private Scanner sc = new Scanner(System.in);
	private POSmachine machine = new POSmachine();

	public ManageSys() { // 생성자로 실행
		run();
	}

	private void resetMenuData() {	// 데이터 값 넣어두는 메소드. 편의에 의함.
		machine.addMenu("파스타", 10000);
		machine.addMenu("스테이크", 34000);
		machine.addMenu("치킨샐러드", 10000);
		machine.addMenu("와인에이드", 6000);
		machine.addMenu("피자", 12000);
	}
	
	private void inputOrders() { // 주문 넣기 반복
		while (true) {
			System.out.println("메뉴와 수량 입력 (메뉴 수량): ");
			String inputName = sc.next();
			int inputNum = sc.nextInt();
			machine.inputOrder(inputName, inputNum);	// 주문 넣기
			
			System.out.println("주문을 마치려면 0, 주문을 계속하려면 아무 키나 입력: ");
			String input = sc.next();
			if (input.equals("0"))
				break;
		}
	}
	
	private void showSysMenu() {
		System.out.println("1. 메뉴 보기");
		System.out.println("2. 주문 입력");
		System.out.println("3. 계산서 출력");
		System.out.println("4. 계산하기");
		System.out.println("5. 주문 초기화");
		System.out.println();
		System.out.println("9. 메뉴 관리");
		System.out.println("0. 프로그램 종료");
		System.out.println("--------------------------------------------");
		System.out.print("입력: ");
	}

	private void run() { // 작동부
		resetMenuData();
		int num;
		System.out.println("=================포스기 프로그램================");

		while (true) {
			try {
				System.out.println("============================================");
				showSysMenu();
				num = sc.nextInt();
				System.out.println("============================================");

				if (num == 1) {
					machine.printAllMenu();

				} else if (num == 2) {
					System.out.println("<주문 입력>");
					inputOrders();

				} else if (num == 3) {
					System.out.println("<계산서 출력>");
					machine.printBill();

				} else if (num == 4) {
					System.out.println("<계산하기>");
					System.out.print("건넨 금액: ");
					int inputmoney = sc.nextInt();
					machine.pay(inputmoney);
					
				} else if (num == 5) {
					System.out.println("<주문 초기화>");
					machine.resetOrder();
					System.out.println("초기화 되었습니다. 주문을 다시 입력하세요.");

				} else if (num == 9) {
					System.out.println("<메뉴 관리>");
					machine.printAllMenu();
					System.out.println("\n메뉴 추가&가격변경: 1\n메뉴 삭제: 2");
					System.out.print("입력:  ");
					int selectManage = sc.nextInt();

					if (selectManage == 1) {
						System.out.println("새 메뉴 이름과 가격 입력: ");
						String inputName = sc.next();
						int inputPrice = sc.nextInt();
						machine.addMenu(inputName, inputPrice);

					} else if (selectManage == 2) {
						System.out.println("지울 메뉴 입력: ");
						String inputName = sc.next();
						machine.removeMenu(inputName);
						
					} else {
						System.out.println("잘못된 입력");
					}

				} else if (num == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;

				} else if (num == 99) {

				} else {
					System.out.println("잘못된 입력");
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력. 처음으로 돌아갑니다.");
				num = 99;
				sc.nextLine();
			}
		}
	}

}