// 순서에 따른 예외처리
public class Main3 {
	public static void main(String[] args) {
		try {
			System.out.println("try 블록 안");
			
			System.out.println("문장 1");
			
			Object o = new Object(); 
			// String으로 만들어진 instance가 아님
			String s = (String) o; // 다운캐스팅 -> 같은 형인지 확인 필요 instance of 
			
			System.out.println("문장 2");
			System.out.println("문장 3");
			
		} catch (Exception e) {
			System.out.println("catch 블록 안");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally { // 예외 여부와 관계없이 무조건 실행
			System.out.println("finally 블록 안");
		}
		
		System.out.println("정상 종료");
	}
}
