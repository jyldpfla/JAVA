import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("input.txt");
			// 파일 찾지못하면 error
			// 하나의 바이트씩 읽음
			out = new FileOutputStream("output.txt");
			// 파일을 생성
			int c;
			
			while ( (c = in.read()) != -1) { // read() : byte값 하나씩 읽는데, int형이라 대입연산함
				// 파일의 끝에 다다랐을 때 -1이라는 값을 가져옴
				// c = in.read()) != -1 : 파일의 처음부터 끝까지 가져오도록 함
				out.write(c);
				// 파라미터로 전달받은 값을 그대로 써줌 -> 똑같은 파일 생성
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
