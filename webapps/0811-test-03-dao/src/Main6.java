import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main6 {
	public static void main(String[] args) {
		String line = " (abc, 123) | (def, 456) | (qwer, 15)";
//		Pattern p = Pattern.compile("\\(\\w+, [0-9]+\\)");
		Pattern p = Pattern.compile("\\(([a-zA-Z]+), ([0-9]+)\\)");
		// () : 그룹화
		// 일반 문자 ()는 문자임을 표현하기 위해 \\이거 섞어서 사용
		// 만약 전체를 그룹으로 감싼다면 ("\\((\\w+, \\d+)\\)")
		Matcher m = p.matcher(line);
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group(1));
			// ()를 기준으로 첫 번째 그룹 출력 ->  abc, 123
			System.out.println(m.group(2));
		}
	}
}
