import java.util.Arrays;
import java.util.Scanner;

/*
 * 도서 관리 프로그램
 * 
 * 목록 보기(가격순으로(같을 때는 어똫게?), 장르를 선택해서 해당 장르만)
 * 1. 가격순으로(오름차순, 내림차순 선택 가능)
 * 2. 분야를 선택해서 해당 분야만 보기
 * 
 * 
 * 3. 상세보기
 * 4. 도서 정보 수정
 * 5. 도서 정보 추가
 */

// 1. 작별인사						/ 김영하 / 복복서가 / 장편소설 / 12,600원
// 2. 불편한 편의점 					/ 김호연 / 나무옆의자  / 장편소설 / 12,600원
// 3. 지금 알고 있는 걸 그때도 알았더라면	/ 류시화 / 열림원 / 시집 / 8,100원
// 4. 코스모스						/ 칼 세이건 / 사이언스북스 / 과학 공학  / 16,650원
// 5. 여행의 이유					/ 김영하 / 문학동네 / 에세이 / 12,150원

public class Main {
	// 도서 배열
	static int bcount = 5;
	static Book[] book = new Book[bcount];
	
	// 책 도서 배열에 넣기
	public static void books(Book[] k, Book j, int i) {
			k[i] = j;
	}
	
	// 가격 비교 메소드(오름차순)
	public static void comparePrice(Book[] a) { // 배열형 파라미터 1개 받아오기
		int[] su = new int[a.length];  // a의 길이와 같은 배열, 가격 간 비교 시 최고 금액으로 나옷 횟수를 값으로 저장
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i].getPrice() >= a[j].getPrice()) { //=는 같은 값이 있을 때 횟수까지 체크하기 위해
					//System.out.println(j+"번째 for: "+a[i].getPrice());
					su[i] += 1; // 최고가격 달성 횟수 체크를 위해
				}
			}
		}
		int num = a.length; // su의 최대 횟수 = 5(a배열의 최대길이), su와의 비교를 위해 설정 
		
		for (int j = 0; j < a.length;j++) { // 'a배열 길이'번 반복을 위한 for문, j가  5 미만일때까지 반복(num이 1이 될 때까지 반복)
			for(int i = 0; i < a.length; i++) { // 순서에 맞는 배열 값  출력을 위한 for문
				if(su[i] == num) {  // su안에 각 index의 값들과 num값을 비교 후
					System.out.println(a[i]); // 출력
				} 
			}
			num--; //su index 전체를 비교한 후 num은 -1이 됨
		}
	}
	
	// 가격 비교 메소드(내림차순)
	
	// 분야별 목록 출력 메소드
	public static void listGenre(String a) {
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < book.length; i++) {
			if (book[i].getGenre().equals(a)) {
				System.out.println(a + "장르의 소설: " + book[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// Book에 정보 담기
		Book a = new Book("작별인사", "김영하", "복복서가", "장편소설", 12600);
		Book b = new Book("불편한 편의점", "김호연", "나무옆의자", "장편소설", 12600);		
		Book c = new Book("지금 알고 있는 걸 그때도 알았더라면", "류시화", "열림원", "시집", 8100);		
		Book d = new Book("코스모스", "칼 세이건", "사이언스북스", "과학 공학", 16650);		
		Book e = new Book("여행의 이유", "김영하", "문학동네", "에세이", 12150);
		
		// 배열 안에 책 넣기
		books(book, a, 0);
		books(book, b, 1);
		books(book, c, 2);
		books(book, d, 3);
		books(book, e, 4);
		
//		System.out.println(book[3].getPrice());
		comparePrice(book);
		listGenre("시집");
	}
}
