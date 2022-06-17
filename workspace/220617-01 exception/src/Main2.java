// 여러 예외가 있을 때
public class Main2 {
	public static void main(String[] args) {
		String s = null;
		try {
			String local = "지역변수"; 
			// 지역변수로 선언됐으면 다른 곳에서 사용x, catch문에서도 사용x 
			
			int [] arr = new int[0];
			// 예외가 난 타입에 맞는 예외타입 catch없으면 오류남
			int div = 10 / 0; // 오류발생
			s.equals("asdf");
			
			System.out.println("실행되나??");
			// 위에서 오류나서 catch문으로 넘어감
		} catch (NullPointerException e) {
			// 여기서 e 변수는 catch문 안에서의 지역변수
			//System.out.println(local);
			System.out.println("널 포인트 익셉션 처리");
		} catch (ArithmeticException e) {
			System.out.println("수 익셉션 처리");
			// 같은 타입을 띠고 있는 곳에서 오류 처리
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외 처리");
		} catch (Exception e) {
			System.out.println("모든 예외가 여기서 잡혀버림.");
		}
		 //System.out.println(local);
		
		
		System.out.println("정상 종료");
	}
}
