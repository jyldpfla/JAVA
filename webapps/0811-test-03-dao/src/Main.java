import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String line = "This is a book." ;	
		Pattern p = Pattern.compile("is");
		// pattern : 정규표현식 하나를 표현하는 객체
		// compile : 검사할 글자 설정
		Matcher m = p.matcher(line);
		// Pattern 객체로 가져올 수 있는 객체, p랑 같은지 
		
		System.out.println(m.lookingAt());
		// lookingAt() : p랑 m이랑 시작부분이 같은지, 같으면 true
		
		boolean find = m.find();
		System.out.println(find); // 찾고 싶은걸 찾았을 때 true
		
		if(find) {
			System.out.println(m.start()); // 시작점
			System.out.println(m.end()); // 끝점
		}
		
		find = m.find();
		if(find) {
			System.out.println(m.start()); // 다음 is의 시작점
			System.out.println(m.end()); // 다음 is의 끝점
		}
		
		find = m.find();
		if(!find) {
			System.out.println("없음");
		}
		
	}
}
