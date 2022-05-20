// if 조건문
public class TestIf {
	public static void main(String[] args) {
		/*
		if (조건식(논리값) ) {
			// 문장1
			// 문장2
		}
		// 문장3 (조건식의 논리값이 참이면 문장 123 모두 실행, 거짓이면 문장 3만 실행)
		*/
		
		boolean condition = true;
		if (condition) {
			System.out.println("조건문 블록 안입니다.");
		} //if then절 : 맞냐 맞으면 실행해라
		System.out.println("프로그램 종료"); 
	}
}
