//73p 3번 (구 부피)
import java.util.Scanner;

public class Volume {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("구의 반지름: ");
		double radius = in.nextDouble();
		
		double volume = 4.0 / 3.0 * (radius * radius * radius);
		// 정수/정수는 정수로 나오기 때문에 값이 1이 되어 1*radius가 되므로, (위방법)실수화 시키거나 (아래 방법)실수*정수로 먼저 실행시켜야함
		// (radius * radius * radius) * 4 /3;
		System.out.print("부피: " + volume);
		
	}
}