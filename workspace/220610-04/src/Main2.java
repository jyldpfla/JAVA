import java.util.Scanner;

class Can {
	private String name;

	public Can(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
	
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
	}
}
