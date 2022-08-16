// 1번
// 책 클래스(class Book)
// 필드(상태): 제목(title), 저자(author)
// 메소드(기능): 제목과 저자를 콘솔에 출력 가능(printAll)


public class Book {
	String title; // 적절한 타입 선언
	String author;
	
	void printAll() {
		System.out.println("책의 제목: " + title);
		System.out.println("책의 저자: " + author);
	}
	
	// 쌤 답이랑 똑같아여
}