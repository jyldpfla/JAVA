package Book;

public class Main2 {
	public static void main(String[] args) {
		Novel novel = new Novel("소설책", 100, "소설작가", 10);
		Magazine m = new Magazine("잡지", 90, "잡지작가", 220601);
		
		Book book = novel;
		novel.getRating();
//		book.getRating();
		
//		Novel otherRef = (Novel) book; // downcasting
//		otherRef.getRating(); // 다운캐스팅 했으므로 에러x
		
//		Magazine otherRef = (Magazine) book; // downcasting
//		otherRef.getReleaseDate(); // 잘못된 참조를 하고 있으므로 런타임에러
		
		if (book instanceof Magazine) {
			Magazine otherRef = (Magazine) book;
			otherRef.getReleaseDate();
		} else if (book instanceof Novel) {
			Novel nnn = (Novel) book;
			nnn.getRating();
		}
	}
}
