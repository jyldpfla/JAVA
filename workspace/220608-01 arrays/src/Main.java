public class Main {
	public static void main(String[] args) {
		// 다음과 같은 정수형 배열이 있을 때
		int[] arr = { 15, 32, 222, 119, 534, 36, 9, 1234};
		
		// 2자리 수의 개수와 목록을 콘솔창에 출력해보세요~
		
		// 개수 : 3
		// --목록--
		// 15
		// 32
		// 36
		
		int j = 0; 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 10 && arr[i] <= 99) {
				j += 1; // j++;
			}
		}
		
		/* 쌤 답
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int number = arr[i];
			if (number >= 10 && number < 100) {
				count++;
			}
		}
		System.out.println("개수 : " + count);
		System.out.println("-- 목록 --");
		
		for (int i = 0; i < arr.length; i++) {
			int number = arr[i];
			if (number >= 10 && number < 100) {
				System.out.println(arr[i]);
			}
		}
		*/
		
		
		System.out.println("개수 : " + j);
		System.out.println("--목록--");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 10 && arr[i] <= 99) {
				System.out.println(arr[i]);
			}
		}
	}
}