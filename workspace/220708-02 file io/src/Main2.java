import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		FileOutputStream fos = null; // 초기화를 위해 null일단 넣어줌
		String line = "Hello";
		try {
			fos = new FileOutputStream(new File("d:\\fileTest\\practice.txt"));
			// ()에 파일경로, 파일객체 넣기
			
			fos.write(line.getBytes()); // getBytes() : 배열형태로 값 알려줌
			// 문자열을 받진 못하고 쓰고자하는 byte값으로 받아야함
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // FileNot의 부모이므로 아래에
			e.printStackTrace();
		} finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
