import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main4 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter(file)); // FileWriter: 해당 파일을 문자단위로, outputString
			// printwriter가 filewriter(문자단위로 글자를 쓰게 해줌)를 필드로 가짐
			pw.println("문자열 한 줄을 출력합니다."); // = 파일에서의 System.out
			pw.println(10);
			pw.println(15.15);
			pw.flush(); // 추가했던 내용이 들어간 임시공간 안 지우기
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
