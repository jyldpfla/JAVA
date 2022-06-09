import java.util.Arrays;

public class Main4 {
	public static void main(String[] args) {
		// 두 개 정수 배열을 전달받아 결합시켜 반환하는 메소드
		// 예) [1, 2, 3] [10, 11, 12, 13, 14]
		//[1, 2, 3, 10, 11, 12, 13, 14]
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {10, 11, 12, 13, 14};
		
		int length = arr1.length + arr2.length;
		int[] arr3 = new int[length];
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		} 
		for(int i = arr1.length; i < length; i++) {
			arr3[i] = arr2[i - arr1.length];
		}
		
		System.out.println(Arrays.toString(arr3));
		
		
		// 두개 정수 배열의 합을 가지는 배열을 반환하는 메소드
		// 예) [1, 2, 3] [10, 11, 12, 13, 14]
		// [11, 13, 15, 13, 14]
		for(int i = 0; i < arr1.length; i++) {
			if (arr1.length >= arr2.length) {
				System.out.println(arr1[i] + arr2[i]);
			} else {
				System.out.println(arr2[i]);
			}
		}
		
		
		
		
		
		
		
		
		int[] arr = {10, 20, 30};
		// 객체 초기화처럼 초기화하고 값 설정 안해주면 값은 기본값으로 설정됨
		
		int[] larger = new int[arr.length + 2];
		// 기존의 배열은 길이 조정 불가하므로 복사본으로 새로 만들어주기
		for (int i = 0; i < arr.length; i++) {
			larger[i] = arr[i];
		}
		

	}
}
