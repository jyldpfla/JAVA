// 상수
public class StaticVariableAndConst {
	public static void main(String[] args) {
		int i = 10;
		
		i++;
		
		final int ASDF; // 초기화
		ASDF = 10; // 가장 첫 번째 대입연산은 오류x
		ASDF = 15; // 두 번째부터는 compile error
		
		final int MY_NUMBER = 22; // 상수를 만들고 초기화 + 선언, 변수 선언과 비슷
		// 대문자로 이름 작성(변수(주로 소문자)와의 구분을 위해서),단어간_로 띄어쓰기 대체
		// MY_NUMBER++; // 값 변화시키려고 하면 compile error
		
		final double PI = 3.14;
		System.out.println(5 * 5 * PI);
	}
}