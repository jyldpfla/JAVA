
import java.util.Scanner;

public class RestaurantConsoleApp {
	private RestaurantRepository repo;

	public RestaurantConsoleApp(RestaurantRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void menu() {
		System.out.println("1. �߰�, 2. ���, 3. ����, 4, ����, 5. �˻�(����)");
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
		System.out.println("����� ���������, ��ȭ��ȣ, �ּҸ� �Է����ּ���.");
		Scanner scan = new Scanner(System.in);
	}
}