package member.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;
import member.dao.MemberDao;
import member.model.Member;

public class JoinService {
	
	private MemberDao memberDao = new MemberDao(); 
	
	public void join(JoinRequest joinReq) { // join 요청 값 받아오기
		// db작업 위한 정보 촤륵~ -> db작업을 어떤 순서로 했는지 파악하면 됨
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			Member member = memberDao.selectById(conn, joinReq.getId());
			if (member != null) { // 같은 id가 있으면
				JdbcUtil.rollback(conn); // rollback
				throw new DuplicateldException(); // 같은 아이디 있다고 알려주기
			}
			
			memberDao.insert(conn, new Member(joinReq.getId(), joinReq.getName(), joinReq.getPassword(), new Date()));
			conn.commit();
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			// 잘못되면 rollback
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.close(conn);
		}
	}
}
