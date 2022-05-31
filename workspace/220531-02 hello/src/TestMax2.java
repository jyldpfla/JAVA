public class TestMax2 {
	public static int max(int left,int right) {
		return left > right ? left: right;
	}
	public static void main(String[] args) {
		// 3개 정수 중 가장 큰 값 구하기
		// int a = 3;
		// int b = 4;
		// int c = 5;
		// // 4개
		// int d = 6;
		// // 5개
		// int e = 7;
		
		// System.out.println(max(e, max(d, max(c, max(a, b)))));
		int x = 100;
		int y = 50;
		int z = 75;
		
		int result1 = max(x, y);
		int finalResult = max(result1, z);
		
		System.out.println(finalResult);
		
		int m = max(3, max(7, max(5, 1)));
		
		// if (x > y) {
			// System.out.println(x);
		// } else {
			// System.out.println(y);
		// }
	}
}