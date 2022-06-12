package practice;

import java.util.Arrays;

public class Main {
	public static void insertionSort(int[] arr) {
		for (int index = 1; index < arr.length; index++) {
			int temp = arr[index];
			// 처음 [1] = temp, index 2가 temp 변수로 들어감
			int aux = index - 1; 
			// 처음 [0] = aux, index 1이 aux 변수로 들어감

			while ((aux >= 0) && (arr[aux] > temp)) {

				arr[aux + 1] = arr[aux]; // index 0이 크면 값은 index 1로 옮김
				aux--; // 다시 index가 0이 되도록
			}
			arr[aux + 1] = temp; // index 1값이 temp로 들어감
		}
	}
	
	public static void main(String[] args) {
//		Book[] books = new Book[3];
//		books[0] = new Book("작별인사", "김영하", "복복서가", "장편소설", 12600);
//		books[1] = new Book("불편한 편의점", "김호연", "나무옆의자", "장편소설", 12600);
//		books[2] = new Book("지금 알고 있는 걸 그때도 알았더라면", "류시화", "열림원", "시집", 8100);
//		
//		Arrays.sort(books); // 정렬 기준을 모르므로 compile error는 안 나지만 runtime error가 남 
		
		int[] arr = { 50, 30, 20, 60, 10 };

		insertionSort(arr);
//		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, 20); //원소값에 겹치는 값이 없어야 올바른 위치를 찾을 수 있음
		System.out.println("20의 인덱스: " + index); 

		System.out.println(Arrays.toString(arr));
	}
}
