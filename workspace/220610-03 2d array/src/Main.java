import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// 다루고자 하는 데이터양이 하나의 배열로 표현하기 힘들 때,
		int[] arr1 = {2, 4, 6, 8, 10};
		int[] arr2 = {3, 6, 9, 12, 15};
		int[] arr3 = {4, 8, 12, 16, 20};
		// 2차원 배열
		
		int[][] arr2d = new int[3][5]; // int 배열을 원소로 가지는 배열(참조할 배열이 int므로 new int[][])
		// int[배열의 길이][하나의 배열원소의 길이값] = int[행의 개수][열의 개수] like 표
		// int 배열의 원소로 참조를 하므로 배열만 참조할 수 있으면 열의 개수 안 써도 됨
		arr2d[0] = arr1; // 하나의 원소가 배열임을 알 수 있음
		arr2d[1] = arr2;
		arr2d[2] = arr3;
		
		for (int j = 0; j < arr2d.length; j++) {
			for(int i = 0; i < arr2d[j].length; i++) { // arr2d.length = 3이 나옴
				System.out.println(arr2d[j][i]);
			}
		}
//		System.out.println(arr2d[0][0]);
//		// int[배열원소index][배열원소의 원소 index]
//		System.out.println(arr2d[0][0]);
//		System.out.println(arr2d[0][1]);
//		System.out.println(arr2d[0][2]);
//		System.out.println(arr2d[0][3]);
//		System.out.println(arr2d[0][4]);
		
		int[][] arrHello = new int[3][5];
		arrHello[0] = new int[] {1, 2, 3};
		System.out.println(Arrays.toString(arrHello[0]));
		
//		int[][] arrAnother = { {2, 4, 6}, {3, 6, 9}, {4, 8, 12} };
//		for (int i = 0; i < arrAnother[0].length; i++) {
//			System.out.println(arrAnother[0][i]);
//		}
		
	}
}
