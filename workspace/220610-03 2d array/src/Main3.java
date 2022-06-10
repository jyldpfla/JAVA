import java.util.Arrays;
import java.util.Random;

public class Main3 {
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
	
	public static int randomRow(int[][] a) {
		int b= 0;
		for(int i = 0; i < a.length; i++) {
			b += a[i][0];
		}
		return b;
	}
	
	public static int randomColumn(int[][] a) {
		int b = 0;
		for(int i = 0; i < a.length; i++) {
			b += a[0][i];
		}
		return b;
	}
	
	public static void main(String[] args) {
		int[][] randomArray = randomArray();
		System.out.println(Arrays.deepToString(randomArray));
		// 각 행의 합
		System.out.println(randomRow(randomArray));
		// 각 열의 합
		System.out.println(randomColumn(randomArray));
		// 숫자 7의 개수
	}
}
