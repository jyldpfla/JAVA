import Book.Book;
import Book.Magazine;
import Food.Melon;
import Phone.SmartPhone;
import student.Graduate;
import student.UnderGraduate;

// page 264
// 4번
// 5번
// 6번
// 7번

public class Main {
	public static void main(String[] args) {
		Magazine magazine = new Magazine("장예림", 300, "장예림", 20220613);
		Book book = new Magazine("장예림2", 100, "장예림", 220614);
		// 객체는 다양한 형태를 가질 수 있는데, 자식은 부모의 형태를 띨 수 있음 - 상향 형변환
		Magazine magazine2 = (Magazine) book;
		System.out.println(book.getTitle());
		System.out.println(magazine.toString());
		
		Book b = new Book("그냥 책", 50, "그냥 작가");
		if ( b instanceof Magazine) {
			Magazine m = (Magazine) b; 
		}
		// 문법적으론 맞지만 책은 잡지가 아니므로 runtime eror
		
		Melon melon = new Melon(50, 15000, 1.5, "부산");
		System.out.println(melon.toString());
		
		SmartPhone smartPhone = new SmartPhone("한국", 1000000, 2, "Windows", 64, 8, true, true);
		System.out.println(smartPhone.toString());
		
		UnderGraduate underGraduate = new UnderGraduate("둘리", 95123, "마술학", 2, 14, "마술동아리");
		Graduate graduate = new Graduate("둘리", 95123, "마술학", 2, 14, "교육조교", 0.9);
	}
}
