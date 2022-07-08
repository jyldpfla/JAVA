import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("d:\\Java\\test.txt");
		
		System.out.println(file.getName()); // 파일의 이름
		System.out.println(file.getPath()); // 파일의 경로
		System.out.println(file.exists()); // 파일이 존재하고 있는가
		
		File f2 = new File("d:\\Java\\asdf.txt"); 
		// 파일의 객체는 존재 -> 실제 파일이 아닌 외부 파일을 가리킬 수 있는 객체
		
		System.out.println(f2.getName());
		System.out.println(f2.getPath());
		System.out.println(f2.exists()); // 파일은 없음
		
		File dir = new File("d:\\Java"); // 폴더 디렉토리도 가지고 올 수 있음
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
		System.out.println(dir.exists());
		
		System.out.println("파일인가요? " + dir.isFile());
		// 파일인지 알아볼 수 있는 메소드
		System.out.println("디렉토리인가요? " + dir.isDirectory());
		// 디렉토리인지 알아보는 메소드
	}
}
