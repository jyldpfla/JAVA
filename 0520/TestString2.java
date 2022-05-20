// 문자열에서 원하는 문자 찾기 (index)
public class TestString2 {
	public static void main(String[] args) {
		String hello = "Hello";
		
		char h = hello.charAt(0);
		System.out.println(h);
		System.out.println(hello.charAt(1));
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));
		
		int length = hello.length(); //()입력파라미터 : 메소드가 동작할 때 동작할 곳을 알려주는 곳
		System.out.println(length);
	}
}