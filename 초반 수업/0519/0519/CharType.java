public class CharType {
	public static void main(String[] args) {
		char a = 'a'; //''로 이루어진 문자는 문자 하나를 표현('asdf' 안됨)
		char b = 'b';
		char ga = '가';
		char num1 = '1';
		
		char what = 65; // 65번째에 있는 문자를 가리키는 정수변수 설정
		
		System.out.println(what - a); // 숫자로 인식하므로 숫자로 값이 나옴
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(ga);
		System.out.println(num1);
		
	}
}