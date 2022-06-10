// Wrapper
public class Main2 {
	public static void main(String[] args) {
		int number = 22;
		//Wrapper Class
//		기본형  타입에 대응되는 Wrapper Class;
//		Byte
//		Short;
//		Integer;
//		Long
//		Float
//		Double
//		Character
//		Boolean
		Integer i = new Integer(10); // i라는 객체로 Integer(10) 참조, 1.8버전 이후 Integer는 deprecated(사라짐), 다른걸로 변경
		// Integer가 값이 10인 Integer 객체를 참조
		Integer i2 = Integer.valueOf(500); // boxing : 박스에 담아서 포장 = 원시형 자료를 객체로 포장
		int primitiveInt = i2.intValue(); // unboxing : 포장 푸는 것
		// intValue : boxing된 값 원시형 자료값으로 돌려달라는 메소드
		
//		System.out.println(primitiveInt);
		Integer auto = 100; // auto-boxing: 대입연산을 하게 되면 reference type 객체를 만들어서 참조가 일어나도록 자동으로 해줌
		int un = auto; // auto-unboxing: 객체로 포장한 reference type 객체에 int로 대입연산하게 되면, 자동으로 포장이 풀림
	
		Integer value = Integer.valueOf("5959"); // 문자열을 숫자로 변환
		int result = Integer.valueOf("1234"); // 자동적으로 포장 풀림
		// valueOf는 Integer의 참조로 되돌려줌 -> int로 대입연산했으므로 int형으로로 포장 풀기 
		
//		Integer.parseInt(s);
		// 원시형 타입 int로 출력됨
	}
}
