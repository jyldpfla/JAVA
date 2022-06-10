import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		// 2 ~ 5의 제곱수들을 각 원소로 가지는 2차원 배열 선언 초기화 후에 모든 원소 출력해보기
		// 2 4 8 16 32...
		// 3 9 27 81...
		// 4 16 ...

		int[][] arr = { { 2, 4, 8, 16, 32 }, { 3, 9, 27, 81, 243 }, { 4, 16, 64, 256, 1024 },
				{ 5, 25, 125, 625, 3125 } };

		int[][] arr2 = new int[4][5];
		for (int i = 0; i < arr2.length; i++) {
			int n = 1;
			for (int j = 0; j < arr2[i].length; j++) {
				n *= 2 + i;
				arr2[i][j] = n;
			}
		}
		
		System.out.println(Arrays.deepToString(arr)); 
		System.out.println(Arrays.deepToString(arr2)); // 차원이 여러개 있어도 값 반환 가능
		
		System.out.println(arr == arr2);
		System.out.println(Arrays.equals(arr, arr2)); // 참조가 다르므로 같지 않다고 나옴, 1차원일 때 사용
		System.out.println(Arrays.deepEquals(arr, arr2));
		// deepEquals는 참조가 달라도 배열의 원소와 길이가 같은지를 비교하므로 true -> 다차원일 때는 deep 사용
	}
}
