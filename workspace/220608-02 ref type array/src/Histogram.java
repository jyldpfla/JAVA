import java.util.Scanner;

public class Histogram {
	public static void number(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= 1 && a[i] <= 10) {
				System.out.println("1 - 10: " + "*");
			}
		}
//	 	for (int j = 0; j < a.length; j++) {
//			for(int i = 0; i <= 90 ;) {
//				System.out.printf("%d - %d: \n", i + 1, i + 10);
//				i += 10;
//			}
//	 	}
		
	}
		
	public static void main(String[] args) {
		int[] integer = new int[10];
		Scanner scan = new Scanner(System.in);
			for(int i = 0; i < integer.length; i++) {
				System.out.println("정수를 입력하세요: ");
				integer[i] = scan.nextInt();
			}
	}
}
