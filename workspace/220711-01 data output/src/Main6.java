import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main6 {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("d:\\filetest\\s1.ser"));
		
			Student s = (Student) ois.readObject();
			//객체 에서 static은 객체가 아니므로 읽고 쓰지 않음, 직렬화할 때 빼고 싶은 부분은 transient(직렬화대상에서 제외) 사용하면 됨
			// 기본적으로 object형으로 읽기 때문에 downcasting 필요
			
			System.out.println(s);
		}  catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
