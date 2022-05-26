public class MethodHead2 {
	// 정수 두 개를 전달받아 왼쪽이 큰지 오른쪽이 큰지 혹은 같은지를 알고 싶음.
	// int compare(int,int) -1       1        0
	// char compare(int, int) 'L', 'R', 'S'
	// short compare(int, int)
	
	// public static int compare(int left, int right) {
		// return left - right; //left가 크면 양수
	// }
	
	public static char compare(int left, int  right) {
		if (left > right) {
			return 'L';
		} else if (left < right) {
			return 'R';
		} else {
			return 'S';
		}
	}
	public static void main(String[] args) {
		String.valueOf(123); // 정적 메소드
		
		char result = compare(150, 170);
		System.out.println(result);
	}
}
