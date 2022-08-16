import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		System.out.println("사각형 둘레, 넓이 구하기~");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사각형 밑변?? ");
		int length = scanner.nextInt();
		System.out.println("사각형 높이?? ");
		int height = scanner.nextInt();
		
		System.out.println("둘레: " + (length + height) * 2) ;
		System.out.println("넓이: " + length * height);
	}
}
