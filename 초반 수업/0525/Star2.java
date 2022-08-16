// 2번
// *****
// ****
// ***
// **
// *

public class Star2 {
	public static void main(String[] args) {
		// int k = 5;
		
		// for (int j = 5 ; j > 0; j--) {
			// for (int i = k; i > 0; i--) {
				// System.out.print("*");
			// }
			// System.out.println();
			// k -= 1;
		// }
		
		for (int j = 0; j < 5; j++) {
			for (int i = 5; i > j; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
