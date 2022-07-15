import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.greenart.dbutil.DBUtil;

/*
 * my_db.books
 * 
 * 도서 관리 프로그램
 * 추가
 * 전체 목록
 * (아이디나 제목이나 가격 등으로 검색 가능)
 * 삭제
 * 수정
 */
public class Book_manager {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
			try {
				conn = DBUtil.getConnection();
				stmt = conn.createStatement();
				
				String query = "INSERT INTO books (title,price) VALUES ("넣어보자아", 9000)";
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBUtil.closeRS(rs);
				DBUtil.closeStmt(stmt);
				DBUtil.closeConn(conn);
			}
			
	}
}
