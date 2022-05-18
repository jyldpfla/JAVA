// 사용자가 입력한 두 개의 숫자를 더해서 출력한다. p.65
import java.util.Scanner; //Scanner 클래스 포함, Scanner의 위치를 알려줌(사용하려면 꼭 필요)

public class Add2 {
	// 메인 메소드에서부터 실행이 시작된다.
	public static void main(String args[]) {
		// 사용자로부터 입력을 받기 위해 Scanner의 Instance를 생성한다.
		// 인스턴스: java 코드로 된 것을 컴퓨터 세상에서 실제 객체로 만든 것(new Scanner(System.in)이 만드는 부분)
		Scanner input = new Scanner(System.in);
		//Scanner input : 변수선언, 타입 변수이름, scanner은 class(사용자의 입력을 받을 수 있도록 만들어진 객체)
		
		int x; // 첫 번째 숫자 저장
		int y; // 두 번째 숫자 저장
		int sum; // 합을 저장
		
		System.out.print("첫 번째 숫자를 입력하시오: "); // 입력 안내 출력
		x = input.nextInt(); // 사용자로부터 첫 번째 숫자를 읽는다., x의 값 초기화
		//input.nextInt() : 메소드 호출, input 안의 nextInt를 사용
		
		System.out.print("두 번째 숫자를 입력하시오: "); // 입력 안내 출력
		y = input.nextInt(); // 사용자로부터 두 번째 숫자를 읽는다.
		
		sum = x + y; // 두 개의 숫자를 더한다.
		
		System.out.println(sum); //합을 출력한다.
		
	} // 메소드의 끝
	
} // 클래스의 끝