import java.util.regex.Pattern;

public class Main5 {
	public static void main(String[] args) {
//		Pattern p = Pattern.compile("[a-zA-z]");
		Pattern p = Pattern.compile("\\w+");
		// \w : 영문 1자 (=[a-zA-z])
		// java는 \ 두 개가 \ 하나이므로 \\ 2개필요 -> 즉, 정규식표현은 \w
		// {3,} : 3자 이상
		// "\\w+" : 1자 이상의 영문자, 1이거나 이상
		// ? : 0 이거나 1
		// * : 0이상
		// \d : 숫자 1자
		// \s : 공백
	}
}
