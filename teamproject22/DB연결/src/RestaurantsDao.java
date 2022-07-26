
import java.sql.SQLException;
import java.util.List;

public interface RestaurantsDao {
	int create(String name, String number, String address) throws SQLException;
	
	List<Restaurant> read() throws SQLException; // List�� ��ȯ �޾Ƽ� �� ���� ��
	Restaurant read(int id) throws SQLException; // int�� �޾Ƽ� pk�� ��ȯ
	
	int update(int id, String name, String number, String address) throws SQLException;
	
	int delete(int id) throws SQLException;
}