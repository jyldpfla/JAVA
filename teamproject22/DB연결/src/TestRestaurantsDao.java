
import java.sql.SQLException;
import java.util.Arrays;

public class TestRestaurantsDao {
	public static void main(String[] args) {
		RestaurantsDao dao = new RestaurantsDaoImpl();
		
		try {
//			int result = dao.create("�׽�Ʈ��1", "1234-5555","�λ� ��¼��");
//			System.out.println(result == 1);
			
//			System.out.println(dao.read());
//			System.out.println(dao.read(3));
			
//			int result = dao.update(6, "�׽�Ʈ��2", "9874-1235","�λ� ��¼��");
//			System.out.println(result == 1);
//			System.out.println(dao.read(6));
			
//			int result = dao.delete(4);
//			System.out.println(result == 1);
//			System.out.println(dao.read());
			
			RestaurantsDaoImpl impl = (RestaurantsDaoImpl) dao;
			// implement�Ϸ��� �� �ȿ� ������ create�޼ҵ� �����Ƿ� �ٿ�ĳ����
			int[] result = impl.create(Arrays.asList(
					new Restaurant(0, "��ġ1", "0101-0202", "��ġ�ּ�1")
					,new Restaurant(0, "��ġ2", "0202-0202", "��ġ�ּ�2")
					,new Restaurant(0, "��ġ3", "0303-0202", "��ġ�ּ�3")
					,new Restaurant(0, "��ġ4", "0404-0202", "��ġ�ּ�4")
					));
			System.out.println(Arrays.toString(result));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
