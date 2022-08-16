// 정수 2개와 연산자(문자열 + - * / )등을 입력받아 사칙연산을 수행하는 계산기 프로그램

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);
		
		System.out.print("정수 1: ");
		int a = calculator.nextInt();
		System.out.print("정수 2: ");
		int b = calculator.nextInt();
		System.out.print("연산자: ");
		calculator.nextLine();
		String operator = calculator.nextLine();
		
		if (operator.equals("+")) {
			System.out.print (a + b);
		} else if (operator.equals("-")) {
			System.out.print (a - b);
		} else if (operator.equals("*")) {
			System.out.print (a * b);
		} else if (operator.equals("/")) {
			System.out.print (a / b);
		} else {
			System.out.print("잘못된 입력입니다.");
		}
		
	}
}

