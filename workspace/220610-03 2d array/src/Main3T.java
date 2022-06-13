import java.util.Arrays;
import java.util.Random;

public class Main3T {
	public static int[][] randomArray() {
		Random random = new Random();
		int[][] array = new int[5][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}

		return array;
	}

	public static void print2D(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(Arrays.toString(array[i])); // 각 행 출력
			System.out.println(sum(array[i])); // 합 반환 출력
		}
		for (int i = 0; i < array[0].length; i++) {
			System.out.print(sum(col(array, i)) + " ");
		}
		System.out.println("7의 개수: " + count(array, 7));
	}

	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum; // 합을 구하는 메소드
	}

	public static int[] col(int[][] array, int col) {
		int[] columnArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			columnArray[i] = array[i][col];
		}
		return columnArray;
	}
	
	public static int count(int[][] array, int target) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == target) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[][] randomArray = randomArray();
//		System.out.println(Arrays.deepToString(randomArray));
		print2D(randomArray);
//		System.out.println(sum(randomArray[0]));
//		System.out.println(sum(col(randomArray, 0)));
	}
}
