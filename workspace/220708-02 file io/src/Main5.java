import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			// FileReader를 감쌀 수 있음
			
			String line;
			while ( (line = br.readLine()) != null) { // 한 줄의 문자열을 읽을 수 있는 메소드, 파일 끝을 만나면 null을 반환
				System.out.println(line);
			}; 
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
