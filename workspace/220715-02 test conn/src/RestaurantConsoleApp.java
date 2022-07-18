import java.util.Scanner;

public class RestaurantConsoleApp {
	private RestaurantRepository repo;

	public RestaurantConsoleApp(RestaurantRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void menu() {
		System.out.println("1. 추가, 2. 목록, 3. 삭제, 4, 수정, 5. 검색(제목)");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		switch (num) {
		case 1 :
			break;
		case 2 :
			break;
		case 3 :
			break;
		case 4 :
			break;
		case 5 :
			break;
		default :
			break;
		}
	}
	
	private void add() {
		System.out.println("등록할 레스토랑명, 전화번호, 주소를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
	}
}
