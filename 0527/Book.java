// 1번
// 책 클래스(class Book)
// 필드(상태): 제목(title), 저자(author)
// 메소드(기능): 제목과 저자를 콘솔에 출력 가능(printAll)
// 위의 클래스를 테스트할 수 있는 main메소드를 포함하는 클래스를 작성하고
// 인스턴스화 하여, 필드값을 대입연산 후 출력메소드를 호출하여 콘솔에서 값 확인.

public class Book {
	String title;
	String author;
	
	void printAll() {
		System.out.println("책의 제목: " + title);
		System.out.println("책의 저자: " + author);
	}
}