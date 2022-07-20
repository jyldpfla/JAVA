public class TestBookService {
	public static void main(String[] args) {
		BookService service = new BookService(new BookDaoParamConn());
//		service.insertAndUpdate("책", 9999);
		service.insertAndUpdate("중복이름", 654);
		// 중복이름 이라는 책 추가 + 가격 인하 10000원으로 -> error
		// update 먼저하도록 명령주면, insert는 error나지만 가격인하는 됨
		// 자동 commit 안되도록 transaction 만들어두면 insert에서 error나서 아래 commit이 실행 안되고
		// 예외인 rollback이 실행됨(복구됨)
	}
}
