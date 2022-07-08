import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File diaryFile = new File("d:\\filetest\\diary.txt");
//		System.out.println(diaryFile.exists());
		Scanner scanner = null; // 다른 곳에 존재하는 외부 파일 읽기 위해 빨대 꽂기!
		
		try {
			scanner = new Scanner(diaryFile); // 파일을 받아올 거라서 파일을 안에 넣어줌
			// 파일 읽을 객체 생성
			
			// 스캐너 읽기 시작
			while(scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}  finally { // 자원 해제를 위해
			 if(scanner != null) {
				 scanner.close();
			 }
		}
	}
}
