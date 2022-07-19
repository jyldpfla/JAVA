import java.sql.SQLException;
import java.util.Arrays;

public class TestRestaurantsDao {
	public static void main(String[] args) {
		RestaurantsDao dao = new RestaurantsDaoImpl();
		
		try {
//			int result = dao.create("테스트중1", "1234-5555","부산 어쩌구");
//			System.out.println(result == 1);
			
//			System.out.println(dao.read());
//			System.out.println(dao.read(3));
			
//			int result = dao.update(6, "테스트중2", "9874-1235","부산 저쩌구");
//			System.out.println(result == 1);
//			System.out.println(dao.read(6));
			
//			int result = dao.delete(4);
//			System.out.println(result == 1);
//			System.out.println(dao.read());
			
			RestaurantsDaoImpl impl = (RestaurantsDaoImpl) dao;
			// implement하려는 거 안에 여러개 create메소드 없으므로 다운캐스팅
			int[] result = impl.create(Arrays.asList(
					new Restaurant(0, "배치1", "0101-0202", "배치주소1")
					,new Restaurant(0, "배치2", "0202-0202", "배치주소2")
					,new Restaurant(0, "배치3", "0303-0202", "배치주소3")
					,new Restaurant(0, "배치4", "0404-0202", "배치주소4")
					));
			System.out.println(Arrays.toString(result));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
