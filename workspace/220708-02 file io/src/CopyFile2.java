// p. 621
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {
	public static void main(String[] args) {
		FileReader inputStream = null; // 파일을 읽어오기 위한 객체 생성(문자단위로 읽음, 한 글자씩)
		FileWriter outputStream = null; // 문자단위 한글자씩 출력
		
		try {
			inputStream = new FileReader("input.txt");
			 outputStream = new FileWriter ("output.txt");
			 
			 int c;
			 while ((c = inputStream.read()) != -1) {
				 // 파일의 끝인 -1을 표현해야하는데 -1은 char로 표현 x
				 // 문자 1개를 끌어오는데 int형으로 출력
				 System.out.println("읽은 문자 확인: " + (char) c);
				 
				 outputStream.write(c);
			 }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close(); // 사용한 거 닫아주기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		 
	}
}
