import java.awt.image.DataBuffer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

// DAO(Data Access Object) : 데이터를 읽고 쓰기만 하도록 만들어진 것
public class BookRepository { // DB작업만 하도록 만듦 -> 로직이 함께 있으면 너무 복잡
	// 책 1권으로 담기
	// 이 클래스에서만 사용하므로 private
	private Book resultMapping(ResultSet rs) throws SQLException {
		int bookId = rs.getInt("bookId");
		String title = rs.getString("title");
		int price = rs.getInt("price");
		
		return new Book(bookId, title, price);
	}
	
	// 추가
	// 책 추가만 해줄건데 결과값을 int로만 출력 -> 모든 상황이 int로 처리되어야함
	// 왜 안됐는지 설명하려면 int값으로 모두 처리되어야 함 but 여기서 int는 행값을 의미
	// 다 알려줄 수 있도록 반환값을 변경해야하는데, db작업하면서 sql exception에서 왜 안되는지 알려줌
	// 안되면 예외를 알려줄 수 있도록 throws 해줌 - 잘되면 1, 안되면 예외를 던짐
	// 메서드 내부에서 예외가 발생했을 때 예외를 try - catch 문으로 잡아서 처리할 수 있지만 경우에 따라서 현재 메서드를 호출한 메서드로 예외를 떠넘길 수 있음
	public int add(Book book) throws SQLException {
	// return type이 int인 이유는 추가 잘 됐는지 sql줄로 확인할 때 편하므로
		String query = "INSERT INTO books (title, price) VALUES ('" + book.getTitle() + "'," + book.getPrice() + ")";
		System.out.println("추가: " + query);
		
		Connection conn = null;
		Statement stmt = null;
		int result = 0; // int 만들어서 result값 return값에 넣어서 받아와도 됨
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		// catch문 없어도 try-finally로만 가능
		// 예외처리를 빈칸으로 하면 main(){}에서는 result값만 받을 수 있음(main에서는 왜 안되는지 알 수 x)
		// 어떻게든 예외를 알려줘야하므로 호출하는 쪽으로 던져줌 -> throw
		
//		return 0; // 내가 의도한 대로 행이 추가 안됐을 때 안됐다고 0을 출력 (throw안하고 try-catch문일때)
	}
	// 목록 전체
	public List<Book> list() throws SQLException {
		String query = "SELECT * FROM books";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<>(); // 호출할 때마다 새 list가 만들어짐
		// 여러번 수행해도 결과는 똑같음
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {// boolean값으로 다음 줄 있는지 확인 가능
				list.add(resultMapping(rs)); // 책 하나씩 list에 담기
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		
		return list; // while문 끝나고 난뒤에만 실행되면 됨
		// finally 흐름은 무조건 실행돼야 하므로 finally위에 있어도 finally하고 흐름으로 돌아가므로 return이지만 위에 둬도  괜찮
		
		
	}
	// 한 개 검색 (제목) or 한 개 검색 (가격)
	public Book selectByTitle(String title) throws SQLException { // 파라미터로 받아서 사용할 수 있도록
		String query = "SELECT * FROM books WHERE title = '" + title + "'";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if (rs.next()) { // 1줄씩 출력, 있으면 true, 없으면 false
				return resultMapping(rs);
			} else {
				return null; // 안에 아무것도 없으면 null을 출력하도록
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	// 책 제목 unique라서 1개만 나오지만, 가격은 여러 개 나올 수 있음
	
//	public List<Book> selectByPrice(int price) {}
	
	// 삭제
	public int delete(int bookId) throws SQLException { // 책 하나를 집으려면 id값 받으면 되므로 형에 맞는 int 선택
	// return type이 int인 이유는 삭제 잘 됐는지 sql줄로 확인할 때 편하므로
		String query = "DELETE FROM books WHERE bookId = " + bookId;
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		
	}
	
	// 수정
	public int update(Book book) throws SQLException {
	// return type이 int인 이유는 업뎃 잘 됐는지 sql줄로 확인할 때 편하므로
		String query = "UPDATE books SET title = '" + book.getTitle() + "', price = " + book.getPrice() + " WHERE bookId = " + book.getBookId();
		//, 이후 다른 값 넣어주면 됨
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

}
