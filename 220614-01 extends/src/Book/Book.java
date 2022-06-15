package Book;

public class Book {
	String title;
	int page;
	String author;
	
	public Book(String title, int page, String author) {
		this.title = title;
		this.page = page;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "제목 : " + getTitle() + ", 총 페이지 : " + getPage() + "p, 작가 : " + getAuthor();  
	}
}
