// 도서 정보
public  class Book {
	private String name;
	private String publisher;
	private String brand;
	private String genre;
	private int price;
	
	public Book(String name, String publisher, String brand, String genre, int price) {
		this.name = name;
		this.publisher = publisher;
		this.brand = brand;
		this.genre = genre;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getWriter() {
		return publisher;
	}

	public void setWriter(String writer) {
		this.publisher = writer;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 배열에 잘 들어갔는지 확인하기 위한 메소드
	public String toString() { // 객체의 상태를 문자열로 반환하는 메소드
		// 파라미터를 받지않고, 문자열로 반환
		return "책 제목: " + name + " / 작가: " + publisher + " / 출판사: " + brand + " / 장르: " + genre + " / 가격: " + price + "원\n";
	} 
}