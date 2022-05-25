// (1) (2) (3) (4) (5)
// (5) (4) (3) (2) (1)
// (1) (2) (3) (4) (5)
// (5) (4) (3) (2) (1)
// (1) (2) (3) (4) (5)

public class Number {
	public static void main(String[] args) {
		for (int count = 1; count <= 10; ) {
			for(int i = 1; i <= 5; i++) {
				System.out.printf("(%d)", i);
				count++;
			}
			System.out.println();
			for(int i = 5; i >= 1; i--) {
				System.out.printf("(%d)", i);
				count++;
			}
		}
		
		/* 답
		for (int i = 0; i <3; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 5; j++) {
					System.out.print("(" + j  +")");
				}
			} else {
				for (int j = 5; j >= 1; j--) {
					System.out.print("(" + j  +")");
				}
			System.out.println();
			}
		}
		*/
	}
}
