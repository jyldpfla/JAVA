import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		
		Arrays.fill(arr, 100);
		// Arrays안에 static한 배열에 편리한 메소드들이 들어있음
		// fill : 값 일괄 변경
		
		System.out.println(Arrays.toString(arr));
		// toString: 문자열 형태로 반환 받아서 배열 확인이 쉽도록
		
		
//		int[] temp = {40, 50, 60};
		
//		int[] copy = Arrays.copyOf(arr, arr.length);
		// copy본 만들어줌
//		int[] arr2 = arr;
		
//		System.out.println(Arrays.toString(copy));
//		System.out.println(Arrays.equals(arr, copy));
		//equals : null 확인 같이 해줌
//		System.out.println(Arrays.equals(arr, arr2));
		
//		int[] another = Arrays.copyOfRange(temp, 2, temp.length);
//		// copyOfRange : 무엇을, 몇 번째 인덱스에서, 몇개의 원소를 배열 복사하는 메소드
//		System.out.println(Arrays.toString(another));
		
		
		
		
		
		
//		int[] copy = Arrays.copyOf(arr, arr.length);
//		int[] arr2 = arr;
//		
//		System.out.println(Arrays.toString(copy));
//		System.out.println(Arrays.equals(arr, copy)); // 길이와 원소가 같아야 함
//		System.out.println(Arrays.equals(arr, arr2));
	}
}
