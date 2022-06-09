import java.util.Arrays;

public class Main3 {
	// 정수형 배열을 전달받아 같은 길이와 원소값을 가지는 정수 배열을 반환하는 메소드
	public static int[] copyArray(int[] origin) {
		int[] copy = new int[origin.length];
		
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		return copy; // 배열도 return 가능
	}
	
	// 정수형 배열 2개가 동일한지(길이와 각 원소값)를 알 수 있는 메소드
	public static void copyArray2(int[] origin, int[] origin2) {
		if (origin.length == origin2.length) {
			System.out.println("두 배열의 길이: " + origin.length);
		} else {
			System.out.println("두 배열의 길이는 같지 않습니다.");
		}
		
		for(int i = 0; i < origin.length; i++) {
			if(origin[i] == origin2[i]) {
				System.out.println("같은 두 배열의 원소값: " + origin[i]);
			} else {
				System.out.printf("두 배열의 %d번째 원소는 같지 않습니다.", i);
				System.out.println();
			}
		}
	}
	
	public int[] copyArray3(int[] origin, int[] origin2) {
		if (origin.length == origin2.length) {
			return origin;
		} else {
			return null;
		}
	}
	
	// 정수형 배열을 전달받아 같은 길이와 원소값을 가지는 정수 배열을 반환하는 메소드 쌤 답
//	public static int[] copyArray(int[] origin) {
//		int[] copy = new int[origin.length];
//
//		for (int i = 0; i < origin.length; i++) {
//			copy[i] = origin[i];
//		}
//
//		return copy;
//	}
	
	// 정수형 배열 2개가 동일한지(길이와 각 원소값)를 알 수 있는 메소드  쌤 답
	public static boolean isSame(int[] left, int[] right) {
		// return left == right;
		if(left.length != right.length) {
			return false;
		}
		
		for (int i = 0; i < left.length; i++) {
			if(left[i] != right[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		Main3 me = new Main3(); 
		int[] test = { 50, 70, 90, 110 };
		int[] c = copyArray(test);
		System.out.println(Arrays.toString(c));
		copyArray2(test, c);
		// System.out.println(Arrays.toString(me.copyArray3(test, c));
		
	// 쌤 답 파트
		boolean result = isSame(test, c);
		System.out.println(result);
		// return left == right로 boolean 값 나오게 할 때 : 참조형 변수끼리는 다른 대상을 가리키고 있으므로 false로 출력
	}
}
