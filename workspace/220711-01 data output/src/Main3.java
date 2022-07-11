import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>(
				Arrays.asList(new Student("홍길동", 22, 2.5), new Student("둘리", 33, 3.3), new Student("도우너", 44, 4.4)));

		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new FileOutputStream("d:\\filetest//student.dat"));

			for (int i = 0; i < list.size(); i++) {
				Student s = list.get(i);

				// 값에 맞춰 출력 -> byte 단위로 기록됨
				dos.writeUTF(s.getName()); // 문자열로 출력
				dos.writeInt(s.getAge());
				dos.writeDouble(s.getScore());
			}
			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
