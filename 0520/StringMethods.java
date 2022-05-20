// 글자의 index 번호 알아내기
public class StringMethods {
	public static void main(String[] args) {
		String hello = "hello";
		
		int index = hello.indexOf("o");
		System.out.println(index);
		
		int notFound = hello.indexOf("a");
		System.out.println(notFound); // 없는 문자를 찾으면 -1로 출력
		
		int index2 = hello.indexOf("ll");
		System.out.println(index2); // 붙어있는 문자 여러개도 찾을 수 있음(떨어져 있으면 찾을 수 없음)
		
		int index3 = hello.lastIndexOf("l"); // 문자열의 오른쪽부터 찾는 메소드
		System.out.println(index3);
		
		int index4 = hello.indexOf("l", 4); // 시작점 지정해서 문자 찾기
		System.out.println(index4); 
	}
}