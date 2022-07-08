import java.io.File;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		File file = new File(".\\");
		// . : 현재경로 = 프로젝트의 경로 -> 상대적인 경로(내 기준으로 찾아가므로)
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		System.out.println(file.getAbsolutePath()); // 상대적인 경로를 절대적인 경로로 보여줌
		try {
			System.out.println(file.getCanonicalPath()); 
			// 우리가 사용하는 os에 맞게 경로를 설정해줌 
			// -> 예외가 발생하므로 error가 뜸(무조건 처리해야 하는 checked exception)
		} catch (IOException e) { // 파일 입출력시 발생할 수 있는 checked exception, 파일을 외부에서 가져오는데 외부에 error가 있을 수 있으므로
			e.printStackTrace();
		}
		
		File fileParent = new File("..\\");
		// ..\\ : 상위 경로를 나타냄, 한 단계 위로 (부모경로) -> 상대적인 경로
		
		System.out.println(fileParent.getAbsolutePath());
		try {
			System.out.println(fileParent.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			File file3 = file.getCanonicalFile().getParentFile();
			// getParentFile() : 상위 객체를 가리키는 파일을 가져옴
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(fileParent.equals(file3));
			System.out.println(fileParent.compareTo(file3));
			System.out.println(fileParent.getCanonicalFile().equals(file3));
			System.out.println(fileParent.getCanonicalFile().compareTo(file3));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
