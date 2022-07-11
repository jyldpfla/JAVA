import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main5 {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("d:\\filetest\\s1.ser")));
		
			oos.writeObject(new Student("학생1", 33, 3.09));
			// NotSerializableException(직렬화 불가) 예외
			// 정보들이 참조 여기저기에 흩어져 있음 
			// => 그 객체에 implements Serializable 해주면 됨 (직렬화 가능 - 입출력으로 정보를 온전하게 사용 가능)
			oos.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
