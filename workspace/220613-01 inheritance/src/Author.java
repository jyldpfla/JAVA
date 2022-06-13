// 자식 클래스가 될 작가 클래스

// 작가
// 이름
// 나이
// 작품 목록

// 이름 알려주기
// 작품 목록 알려주기

public class Author extends Person {
//	private String name; // 중복해서 쓸 필요가 없음
//	private int age;
	private String bookList;
	
	public Author(String name, int age, String bookList) {
		super(name, age);
		this.bookList = bookList;
	}
//	public String getName() {
//		return name;
//	}
	public String getBookList() {
		return bookList;
	}
	
}
