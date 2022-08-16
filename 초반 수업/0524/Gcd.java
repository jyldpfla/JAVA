import java.util.*;

public class Gcd { //유클리드 호제법 참조
	public static void main(String[] args) {
		int x, y, r; // 같은 타입의 변수가 여러개 필요할 때 ,로 구분지어 나열 가능, 선언+초기화 모두 가능
		System.out.print("두 개의 정수를 입력하시오(큰 수, 작은 수): ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.printf("최대 공약수는 %d입니다.\n", x);
	}
}