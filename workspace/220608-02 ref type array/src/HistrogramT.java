// 학생분 + 쌤 답
import java.util.Scanner;

public class HistrogramT {
	public static void myFunction(int[] arr, String range, int left, int right) {
		System.out.print(range);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < left && arr[i] > right) {
				System.out.print("*");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int[] arr = { enter.nextInt(), enter.nextInt(), enter.nextInt(), enter.nextInt() };

		myFunction(arr, "1 - 10 : ", 11, 0);
		myFunction(arr, "11 - 20 : ", 21, 10);
		myFunction(arr, "21 - 30 : ", 31, 20);
		myFunction(arr, "31 - 40 : ", 41, 30);
		myFunction(arr, "41 - 50 : ", 51, 40);
		
//      System.out.print("11 - 20 : ");
//      for (int i = 0; i < arr.length; i++) {
//         if (arr[i] < 21 && arr[i] > 10) {
//            System.out.print("*");
//         }
//      }
//      System.out.println();
//      System.out.print("21 - 30 : ");
//      for (int i = 0; i < arr.length; i++) {
//         if (arr[i] < 31 && arr[i] > 20) {
//            System.out.print("*");
//         }
//      }
//      System.out.println();
//      System.out.print("31 - 40 : ");
//      for (int i = 0; i < arr.length; i++) {
//         if (arr[i] < 41 && arr[i] > 30) {
//            System.out.print("*");
//         }
//      }
//      System.out.println();
//      System.out.print("41 - 50 : ");
//      for (int i = 0; i < arr.length; i++) {
//         if (arr[i] < 51 && arr[i] > 40) {
//            System.out.print("*");
//         }
//      }
//      System.out.println();
//      System.out.print("51 - 60 : ");
//      for (int i = 0; i < arr.length; i++) {
//         if (arr[i] < 61 && arr[i] > 50) {
//            System.out.print("*");
//         }
//      }
//      System.out.println();
//      System.out.print("61 - 70 : ");
//      for (int i = 0; i < arr.length; i++) {
//         if (arr[i] < 71 && arr[i] > 60) {
//            System.out.print("*");
//         }
//      }
//      System.out.println();
//      System.out.print("71 - 80 : ");
//      for (int i = 0; i < arr.length; i++) {
//         if (arr[i] < 81 && arr[i] > 70) {
//            System.out.print("*");
//         }
//      }
//      System.out.println();
//      System.out.print("81 - 90 : ");
//      for (int i = 0; i < arr.length; i++) {
//         if (arr[i] < 91 && arr[i] > 80) {
//            System.out.print("*");
//         }
//      }
//      System.out.println();
//      System.out.print("91 - 100 : ");
//      for (int i = 0; i < arr.length; i++) {
//         if (arr[i] < 101 && arr[i] > 90) {
//            System.out.print("*");
//         }
//      }
   }
}
