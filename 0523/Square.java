// 2의 제곱 수를 32개 나열하고 결과값을 확인해보세요
// 2 3 8 16 32 64 128 256 512 ...

public class Square {
	public static void main(String[] args) {
		int num = 2;
		for (int i = 1 ; i <= 32 ; i++) {
			int num2 = num * 2;
			System.out.println(num);
			num = num2;
		}
	}
}