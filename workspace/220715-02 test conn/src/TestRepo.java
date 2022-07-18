import java.sql.SQLException;
import java.util.List;

public class TestRepo {
	public static void main(String[] args) {
		BookRepository repo = new BookRepository();
		
		int result;
		try {
			// 책 추가
//			result = repo.add(new Book("테스트용 책", 5000));
//			System.out.println("추가 확인 : " + (result == 1)); // sql에 잘 전달됐는지 알기 위해
			// 잘 전달 됐으면 내가 1줄 추가했으므로 1이 나오므로 true로 나옴(전달 제대로 안되면 1이 아니거나, 예외 뜸)
			// null 값을 넣거나 중복되는 값을 넣었을 때 error 뜨는 거 확인 가능
			
			// 책 리스트 보기
//			List<Book> list = repo.list();
//			// try문에서 실행했으므로 1번 보고 끝!
//			System.out.println(list);
			
			// 책 1권 검색
//			Book book = repo.selectByTitle("asdf");
//			System.out.println(book);
			
			// 책 업뎃
			result = repo.update(new Book(13, "자바에서 변경한 새이름", 5000));
			System.out.println(result == 1);
			
			Book book = repo.selectByTitle("자바에서 변경한 새이름");
			System.out.println(book);
			
		} catch (SQLException e) {
			// 실행 error나면 throws로 받은 sql exception을 통해 왜 안됐는지 확인 가능
//			System.out.println(e.getMessage());
			e.printStackTrace();
			
			
			// 에러보기
//			System.out.println(e.getErrorCode());
//			// (sql은 에러코드가 숫자로 정해져 있음) sql exception이 일어날 때 받아온 값
//			System.out.println(e.getSQLState());
//			System.out.println(e.getCause()); 
		}
		
	}
}
