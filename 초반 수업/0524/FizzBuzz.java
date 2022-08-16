// Fizz Buzz
// 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16...
// 35까지, 3의 배수 Fizz 5의 배수 Buzz 3과 5의 배수 Fizz Buzz

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i <= 35; i++){
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz Buzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}