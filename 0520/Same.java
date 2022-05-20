// 사용자의 나이와 이름을 입력받아서
// 자기랑 같으면 true 출력하기

import java.util.Scanner;
	
public class Same {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = "장예림";
		int age = 26;
		
		System.out.print("이름: ");
		String name1 = input.nextLine();
		
		System.out.print("나이: ");
		int age1 = input.nextInt();
		
		System.out.println(name.equals(name1) && age == age1);
	}
}

/*
System.out.println("나이를 입력? ");
int age = scan.nextInt();
System.out.println("이름을 입력? ");
scan.nextLine();
String name = scan.nextLine(); //line은 한줄을 가져오고 enter를 구분자로, 그냥 next는 space를 구분자로 

System.out.println((age == 18) && (name.equals("박민"));

*/