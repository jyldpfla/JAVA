import java.sql.SQLException;

public class aswdf {
	public static void main(String[] args) throws SQLException {
		ProductDao a = new ProductDao();
		System.out.println(a.read());
		
	}
}

