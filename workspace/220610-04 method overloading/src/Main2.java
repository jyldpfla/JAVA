import java.util.Scanner;

class Can {
	private String name;

	public Can(String name) {
		this.name = name;
	}

	public String toString() {
		return name; // 문자열로 나오게 하는 toString메소드 만듦
	}
/* 쌤답
class VendingMachine {
	public static final int COLA = 1; // static이 있어야 main에서 저렇게 접근 가능
	// 없으면 안에서 필드처럼 사용
	public static final int SPRITE = 2;
	public static final int FANTA = 3;
		
	public Can makeCan(int choice) {
		if (choice == COLA) {
			return new Can("콜라"); // return 값에 바로 새 instance 만듦
		} else if (choice == SPRITE) {
			return new Can("사이다");
		} else {
			return new Can("환타");
		}
	} // else if로 끝나면 else일 때 return값 없으므로 밖에 return null;으로 return값 줘야함
		
	public Can makeCan(String choice) {
		if (choice.equals("Cola")) {
			return new Can("콜라");
		} else if (choice.equals("Sprite")) {
			return new Can("사이다");
		} else {
			return new Can("환타");
		}
	}
}
*/ 

	public static Can drink(int a) { 
		Can drinks;
		if(a == 1) {
			drinks = new Can("콜라");
			return drinks;
		} else if(a == 2) {
			drinks = new Can("사이다");
			return drinks;
		} else {
			drinks = new Can("환타");
			return drinks;
		}
	} 
	
	public static Can drink(String a) {
		Can drinks;
		if(a.equals("Cola")) {
			drinks = new Can("콜라");
			return drinks;
		}  else if(a.equals("Sprite")) {
			drinks = new Can("사이다");
			return drinks;
		} else {
			drinks = new Can("환타");
			return drinks;
		}
	}
}



public class Main2 {
	public final int COLA = 1;
	public final int SPRITE = 2;
	public final int FANTA = 3;

	// 자판기 메소드
	// 정수형 -> 반환Type : Can
	// 1 -> field : "콜라" 
	// 2 -> field : "사이다" 
	
	// 문자열 -> 반환Type : Can
	// "Cola" -> field "콜라"
	public static void main(String[] args) {
		System.out.println(Can.drink(1));
		System.out.println(Can.drink("Fanta"));
		/* 쌤 답
		VendingMachine m = new VendingMachine();
		Can can1 = m.makeCan(VendingMachine.COLA);
		
		can can2 = m.makeCan("Cola");
		
		System.out.println(can1);
		System.out.println(can2.toString());
		*/
	}
}
