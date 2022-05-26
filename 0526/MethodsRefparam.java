// 참조형을 주고 받는 메소드
public class MethodsRefparam {
	public static String concat(String left, String right) { //문자열 참조를 할 수 있는 박스가 생김
		return left + right; // 경로값 복사되어 옴, +가 되어 "hello world"라는 새로운 박스가 생김
	} 
	
	public static void main(String[] args) {
		String h = "Hello"; // h가 실제 값을 가지고 있는 것이 아님, 화살표(경로)가 복사된다
		String w = "World";
		String result = concat(h, w); // concat에서 나온 새로운 박스 경로를 참조해서 결과값 도출
		
		System.out.println(result);
	}
}

