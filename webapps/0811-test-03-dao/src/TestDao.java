import java.sql.SQLException;
import java.util.List;

import hello.Person;
import hello.PersonDAO;

public class TestDao {
	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		
		try {
			int result = dao.createPerson(new Person("이름", 3, "female"));
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		List<Person> list = null;
		try {
			list = dao.readPerson();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}
	
}
