import java.sql.Connection;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class BookService {
	private BookDaoParamConn dao;

	public BookService(BookDaoParamConn dao) {
		super();
		this.dao = dao;
	}

	public void setDao(BookDaoParamConn dao) {
		this.dao = dao;
	}
	
	// 신간이 추가되면 비슷한 이름을 가진 책 할인
	public void insertAndUpdate(String title, int price) {
		// connection 객체 파라미터로 전달받아야하므로 따로 써주기
		Connection conn = null;
		
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);
			// 자동 커밋 끄기
			dao.update(conn, "%" + title + "%", price);
			
//			int div = 10 / 0; // if 연산과정이 사이에 필요한 경우가 있을 수 있는데 
			// 중간에 error가 날 수 있음
			// 이 때도 catch로 잡아주면 됨 -> runtimeError에 rollback명령 주기
			
			dao.insert(conn, title, price);
			conn.commit();
			// %붙여서 like 적용돼서 비슷한 이름 찾을 수 있도록
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			DBUtil.closeConn(conn);
		}
		
	}
}
