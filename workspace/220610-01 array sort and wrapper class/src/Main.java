// 삽입정렬
import java.util.Arrays;

public class Main {
	public static void insertionSort(int[] arr) {
		//https://ko.wikipedia.org/wiki/%EC%82%BD%EC%9E%85_%EC%A0%95%EB%A0%AC?tableofcontents=1 참고
		for (int index = 1; index < arr.length; index++) {
			int temp = arr[index];
			int aux = index - 1;

			while ((aux >= 0) && (arr[aux] > temp)) {

				arr[aux + 1] = arr[aux]; // index 0이 크면 값은 index 1로 옮김
				aux--; // 다시 index가 0이 되도록
			}
			arr[aux + 1] = temp;
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

//		insertionSort(arr);
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, 20); //원소값에 겹치는 값이 없어야 올바른 위치를 찾을 수 있음
		System.out.println("20의 인덱스: " + index); 

		System.out.println(Arrays.toString(arr));
	}
}
