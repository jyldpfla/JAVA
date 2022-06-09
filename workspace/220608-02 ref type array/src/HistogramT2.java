// histogram 인하 답
import java.util.Scanner;

public class HistogramT2 {
	Scanner sc=new Scanner(System.in);
	int input;
	
	private boolean isOk(int number) {
		return number > 100 || number < 1;
	}
	
	private int inputNumber() {
		int number = 0;
		do {
			number = sc.nextInt();
		} while (isOk(number));
		
		return number;
	}
	
	public void histogram() {		// 입력부
		int[] histogram = new int[10];
		
		
		
		
		for (int i=1; i<11; i++) {
			System.out.printf("%d번째 정수 입력: ", i);
			input=sc.nextInt();
			if (input>100||input<1) {	// 잘못된 입력 빠꾸하는 부분
				System.out.println("잘못된 입력. 다시 입력하세요.");
				i--;
			}
			histogram[i-1]=input;
		}
		
		for (int i=1; i<=10; i++) {		// 출력
			printHistogram(histogram, 1+(i-1)*10, i*10);
		}
		
	}
	
	public void printHistogram(int[] a, int min, int max) {
		System.out.printf("%d-%d: ", min, max);
		for (int i=0; i<10; i++) {
			if (a[i]>=min&&a[i]<=max)
				System.out.print("*");
		}
		System.out.println();
	}
		
	public static void main(String[] args) {
		HistogramT2 ex=new HistogramT2();
		ex.histogram();
	}
}
