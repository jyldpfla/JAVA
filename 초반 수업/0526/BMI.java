// 4. 키(실수, m)와 몸무게(실수)를 전달받아
// 한국기준 BMI 지수(실수) 구해 반환하는 메소드.
// BMI = (몸무게) / (키)^2
import java.util.Scanner;

public class BMI {
	public static double hweight(double a, double b) {
		return b / (a * a);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키: ");
		double h = scan.nextDouble();
		System.out.print("몸무게: ");
		double w = scan.nextDouble();
		
		double bmi = hweight(h, w);
		
		System.out.printf("BMI는 %f입니다.", bmi);
	}
}