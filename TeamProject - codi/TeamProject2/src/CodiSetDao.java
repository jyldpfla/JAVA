import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;


public interface CodiSetDao {
	int createCodi(String product1, String product2, String product3, String product4, String product5, String product6, String product7, String product8, Blob codiset_image, String user_id, String tag_theme) throws SQLException;
//	CodiSet readCodi() throws SQLException;
//	List<CodiSet> readCodiList() throws SQLException;
//	CodiSet updateCodi() throws SQLException;
//	CodiSet deleteCodi() throws SQLException;
}
