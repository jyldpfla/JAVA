//3. 사용자가 입력한 4자리의 정수가 좌우가 같을 때 true를 출력하세요/ 나머지 경우는 false
// 예) 1221 -> true, 1557 -> false, 9009 -> true


import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("4자리 정수: ");
		int four = input.nextInt();
		
		System.out.print(four / 1000 == four % 10 && four / 100 % 10 == four / 10 % 10);
	}
}