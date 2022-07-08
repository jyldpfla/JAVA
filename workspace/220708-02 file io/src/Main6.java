import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main6 {
	public static void main(String[] args) {
		// 파일 생성 (직접 손으로)
		// persons.txt
		// 파일 정보를 한 줄씩 읽어서
		// 1. 콘솔 출력
		File persons = new File("d:\\filetest\\persons.txt");
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(persons));
			
			int sum = 0;
			int count = 0;
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
				
				// 2. 사람 평균 나이 구해서 출력
				int index = line.indexOf(',');
				String strAge = line.substring(index + 1);
				Integer age = Integer.valueOf(strAge);
				
				System.out.println("숫자 변환 결과 : " + age);
				sum += age;
				count++;
			}
			System.out.println("평균 나이 : " + sum / count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
