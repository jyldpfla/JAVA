import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;


public interface CodiSetDao {
	int createCodi(CodiSet set) throws SQLException;
}
