import java.util.Arrays;

public class Main4 {
	static void printArray(char[] array) { // 출력만 하므로 void
		// array : 전달 받아 찾을 때 사용하는 매개변수 이름
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	// 캐릭터 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
	static String arraytoString(char[] target ) {
		String str = "";
		for (int i = 0; i < target.length; i++) {
			str += target[i];
		}
		return str;
	}
	
	// 캐릭터 배열에서 하나의 특정 문자의 인덱스를 찾아 반환하는 메소드
	static int whereIs(char[] target, char c) {
		for (int i = 0; i < target.length; i++) {
			if (target[i] == c) {
				return i;
				// 조건 안에 있으므로 캐릭터 찾았을 때만 반환하므로 compile error, 못 찾았을 때도 return
			}
		}
		return -1; // index엔 -가 없으므로 return 값 -
	}
	
	public static void main(String[] args) {
		char[] hello = {'H', 'e', 'l', 'l', 'o'}; // 문자의 배열
		// char 배열 문자열로 반환해주는 메소드
		String result = Arrays.toString(hello);
		System.out.println(result);
//		printArray(hello);
//		String result = arraytoString(hello);
		
		
//		for(int i = 0; i < hello.length; i++) {
//			System.out.print(hello[i]);
//		}
//		
//		// 위의 문자 배열에 o 문자에 해당하는 인덱스를 찾아보세요~
//		for(int i = 0; i < hello.length; i++) {
//			if (hello[i] == 'o') {
//				System.out.println("찾았다: " + i);
//			}
//		}
	}
}
