// Fibonacci 수열
// 1 1 2 3 5 8 13 21 34 ...
// 100 이하

public class Fibonacci {
	public static void main(String[] args) {
		int a = 1;
		while (a <= 100) {
			System.out.println(a);
			int b = 1;
			a = a + b;
		}
	}
}

