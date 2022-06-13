public class Magazine extends Book {
	int releaseDate;

	public Magazine(String title, int page, String author, int releaseDate) {
		super(title, page, author);
		this.releaseDate = releaseDate;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String toString() {
		return super.toString() + ", 발매일 : " + releaseDate;  
	}
	
}
