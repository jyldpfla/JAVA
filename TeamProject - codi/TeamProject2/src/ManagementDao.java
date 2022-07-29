import java.sql.SQLException;
import java.util.List;

public interface ManagementDao {
	List<Item> readByKind(String product_Category) throws SQLException;
	List<Item> readFromCart(String user_id) throws SQLException;
}
