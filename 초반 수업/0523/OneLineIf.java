public class OneLineIf {
	public static void main(String[] args) {
		boolean con = true;
		
		// ? 삼항연산자
		// String result = (con) ? "참" : "거짓";
		
		// (con) ? System.out.println("참 출력"); : System.our.println("거짓 출력"); //문장 출력x
		
		int result = (con) ? 100 : -100;
		
		
		System.out.println(result);
		
		System.out.println("프로그램 종료");
		
		/*
		if(con) {
			System.out.println("참일 경우 실행할 문장");
		} else {
			System.out.println("거짓일 경우 실행할 문장");
		}
			
			//System.out.println("거짓일 경우 실행할 문장"); // 중괄호 바깥이라 else문에 포함x
			
		System.out.println("프로그램 종료");
		*/
	}
}