public class Main3 {
	public static void main(String[] args) {
		int number1 = 10; // 원시형 타입 -> 안에 메소드가 없음, 값만 가지고 있음
		int number2 = 20;
		
		Integer refNumber = Integer.valueOf(10); // Wrapper
		refNumber.compareTo(20); // 객체이므로 안에 메소드 가짐
		// 행동을 가지는 메소드를 사용하고 싶을 때 boxing
		// compareTo를 통해 20과 값이 같은지 비교하는 메소드를 사용할 수 있음
		
// int와 Integer는 값은 같지만 다르다는 것을 알 수 있음
		System.out.println(Integer.max(100, 500));
		
	}
}
