import java.io.File;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
//		File file = new File("d:\\filetest"); // 확장자가 없으므로 dir 가리킴
//		System.out.println("있냐? " + file.exists());
//		System.out.println("폴더임? " + file.isDirectory()); // 없어서 false
//		System.out.println("파일임? " + file.isFile());
//		
//		boolean result = file.mkdir(); // 폴더를 만들어라, 이후에 true로 변경됨
//		System.out.println("디렉토리 생성여부: " + result);
//		
//		// d드라이브에 filetest 폴더(디렉토리)안에 abc 폴더를 생성해보세요
//		File abc = new File("d:\\filetest\\abc");
//		abc.mkdir();
//		
//		File file2 = new File("d:\\filetest\\abc\\..def");
//		file2.mkdir();
		File file3 = new File("d:\\filetest\\def"); 
//		file3.mkdir();
		
		File textFile = new File("d:\\filetest\\mytext.txt");
		try {
			boolean result = textFile.createNewFile(); // IOException(checked)
			System.out.println("생성됨? " + result);
			// 파일 생성 됐는지
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
