
import java.sql.SQLException;
import java.util.List;

public interface RestaurantsDao {
	int create(String name, String number, String address) throws SQLException;
	
	List<Restaurant> read() throws SQLException; // List로 반환 받아서 값 읽을 때
	Restaurant read(int id) throws SQLException; // int값 받아서 pk값 반환
	
	int update(int id, String name, String number, String address) throws SQLException;
	
	int delete(int id) throws SQLException;
}