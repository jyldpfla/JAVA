import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println("한줄을 입력하세요");  
		scan.nextLine(); 
		// 논리적 오류가 생김, scanner는 구분자로 space,enter를 쓰는데, enter는 다음명령을 실행하도록 지시하는 역할도 해서
		// int값을 주고 print로 출력을 하면 enter 앞의 값이 출력되고 enter는 남는다
		// nextLine은 구분자를 enter로 가지기 때문에 남아있는 enter 앞의 문자를 읽는다(scan한다)
		// scan.nextLine을 쓰면 enter를 이미 썼기 때문에 다음에 nextLine을 써도 enter 치기전의 내용을 출력해낼 수 있다.
		String line = scan.nextLine();
		
		// System.out.println(line);
	}
}

