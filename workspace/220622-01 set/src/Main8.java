import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable <Book> {
	private String title;
	private int price;
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
//		return 987;
		// hashCode 987로 통일
		return Objects.hash(title, price);
		//1.7 ver부터 사용 가능, hash 메소드로 알아서 hashcode 숫자 만들어줌
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
}

public class Main8 {
	public static void main(String[] args) {
//		System.out.println(new Book("asd", 3));
//		// toString 없을 때 출력되는 Book@숫자값 - 숫자값: hash코드
//		// hash 명령 없으면 인스턴스 다르므로 다른 hash값 출력
//		// hash 메소드 통해서 같은 값을 가질 때 같은 hash값 출력하도록 함
//		
//		int hash1 = Objects.hash(5000, "책1");
//		// Object.hash() : 숫자값을 만들어내는 메소드, 안에 값이 같으면 같은 숫자값을 출력해냄, Object를 가변인자로 가짐, hash 정의가 있어야 정확한 값을 출력할 수 있음
//		int hash2 = Objects.hash(5000, "책1");
//		// hash 1, 2는 똑같은 hash값 가짐
//		int hash3 = Objects.hash(5000, "책2");
//		int hash4 = Objects.hash(6000, "책1");
//		
//		System.out.println(hash1);
//		System.out.println(hash2);
//		System.out.println(hash3);
//		System.out.println(hash4);
		
//		Book b1 = new Book("책1", 5000);
//		Book b2 = new Book("책1", 5000);
//		Book b3 = new Book("책2", 5000);
		
//		System.out.println(b1.equals(b2));
//		// 값이 같은지만(참조 중) 바로 비교하면 true가 나옴 -> set에서는 hash 먼저 비교
//		System.out.println(b1.equals(b3));
//		
//		Set<Book> set = new HashSet<>();
//		// hash : 각 객체마다 가지고 있는 고유한 숫자값
//		// set은 hash를 먼저 살펴보고, hash가 다르면 다르다고 판별(판별 첫기준)
//		// b1, b2는 다른 hash값을 가짐
//		// -> 동등한 객체끼리는 같은 hash값을 가지도록 해주어야 함
//		// Object 클래스에 hash값 지정 메소드 존재
//		set.add(b1);
//		set.add(b2);
//		set.add(b3);
//		
//		System.out.println(set.size());
//		System.out.println(set);
		
		//TreeSet에 넣어보기
		Book b1 = new Book("책1", 5000);
		Book b2 = new Book("책3", 4000);
		Book b3 = new Book("책1", 7000);
		Book b4 = new Book("책2", 7000);
		// (비교 기준 없으면)comparable을 구현하지 않으면 대소비교 기준 없음
		
//		Set<Book> tree = new TreeSet<>();
//		tree.add(b1);
//		tree.add(b2);
//		tree.add(b3);
//		tree.add(b4);
//		
//		System.out.println(tree);
		
		// 비교 기준2 (나 자신과 다른 것 비교)
		
		Comparator<Book> com = new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
			
		};
	
		Set<Book> treeByPrice = new TreeSet<>(com);
		treeByPrice.add(b1);
		treeByPrice.add(b2);
		treeByPrice.add(b3);
		treeByPrice.add(b4);
		
		System.out.println(treeByPrice);
	}
}
