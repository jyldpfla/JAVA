public class Main4 {
	public static void main(String[] args) {
		try {
			int left = 10;
			int right = 0;
			
			if(right ==0) {
				// 0으로 나누려고 함(예외적인 상황)
				// 보고서 적어서 던질거임.
				throw new MyZeroDivideException("0으로 나누는 예외적인 상황이 발생했습니다~~~"); // 클래스, 인스턴스화 가능
				// 예외  던지기
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
