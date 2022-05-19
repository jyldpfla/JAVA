public class TestRange {
	public static void main(String[] args) {
		//0에서 100 사이??
		
		// 숫자가 0이상 이고(and) 100이하 인가? (이거나(or))
		int number = 33;
		
		// System.out.println(0 <= number <= 100); // 한 번에 하나씩만 물어볼 수 있어서 error, 왼쪽 먼저 해결되고 오른쪽 해결
		System.out.println(0 <= number);
		System.out.println(number <= 100);
		
		// 두 번 물어본 것을 한 번에 확인할 수 있도록 -> 논리연산 사용
		System.out.println(0 <= number && number <= 100);
	}
}