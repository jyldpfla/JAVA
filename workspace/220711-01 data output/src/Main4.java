import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		DataInputStream dis = null;
		List<Student> list = new ArrayList<>();
		
		try {
			dis = new DataInputStream(new FileInputStream(new File("d:\\filetest\\student.dat")));
		
			while (true) {
				// 각각 길이를 가지므로 잘라주지 않아도 됨, but 순서는 맞춰야 가져올 수 있음
				String name = dis.readUTF();
				int age = dis.readInt();
				double score = dis.readDouble();
				
				Student s = new Student(name, age, score);
				list.add(s);
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("학생 정보를 파일 끝까지 다 읽었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace(); // 오류가 난 경로를 출력하라는 말
			}
		}
	  System.out.println(list);
	}
}
