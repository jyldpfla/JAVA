import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
//			fis = new FileInputSteam(new File("d:\\filetest\practice.txt"));			
			File file = new File("d:\\filetest\\practice.txt");
			int length = (int) file.length(); // long이 들어가면 안돼서
			// 파일 length = 파일 크기
			byte[] buf = new byte[length];
			
			fis = new FileInputStream(file);
			fis.read(buf); // 배열의 값을 하나씩 가져옴
			
			String result = new String(buf);
			
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();;
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	
	}
}
