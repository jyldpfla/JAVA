// 배열, for문
public class Main6 {
	// 정수 2개를 전달받아 합을 구해서 반환하는 ㄴ메소드
	public static int sum(int... numbers) {
		// 가변길이 파라미터: 값 여러개 형태를 배열의 형태로 전달 받을 수 있음
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int result = sum(10, 20, 30, 40, 50, 60, 70, 80);
		System.out.println(result);
		// ... 사용하면 일반적인 배열 기록하듯이 기록 가능
		// 아니면 int[] result = new int[] {10, 20, 30, 40, 50, 60, 70, 80};
		System.out.println(result);
	}
	
	
//	public static void someMethod(double d, int... arr) { //가변길이 파라미터: 이걸로 받은 값은 배열처럼 사용가능, 배열 받을 수 있음,
//	// 파라미터가 여러 개 있을 때 가변길이 파라미터는 가장  마지막에 위치
//		for(int number : arr) {
//			System.out.println(number);
//		}
//	}
//	
//	public static void main(String[] args) {
//		int[] arr = {10, 20, 30, 40, 50};
//		
////		someMethod(arr);
//		someMethod(new int[] {20, 30, 40, 50, 60});
//		// 가변길이 파라미터 사용시에 가능한 방식
//		// 여러 개의 값을 받으려면 형 일치를 위해 배열 만들어주어야함
////		System.out.println("---");
////		someMethod(new int [] {4, 5, 6});
////		System.out.println("종료");
		
		
		
		
		
		
//		
//		for (int number : arr) { // 변수 : 여러개를 담을 수 있는 객체(ex.배열)
//			// 배열 안에 있는 값 하나씩을 꺼내서 변수에 넣어줌
//			// 배열 왼쪽에서 오른쪽으로 일방향으로만 읽어줌, 무조건 하나씩 다 읽어야 함(!= index)
//			arr[0] = 50;
//			arr[1] = 50;
//			arr[2] = 50;
//			System.out.println(number);
//		}
		
// 	}
}