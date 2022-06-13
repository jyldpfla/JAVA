import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
//		System.out.println(Long.MAX_VALUE);
		// Long 타입이 가질 수 있는 최대값
		
		// BigInteger타입 : 큰 수 표현하기 위한 클래스, 숫자처럼 표현 가능
//		BigInteger value1 = BigInteger.valueOf(Long.MAX_VALUE + Long.MAX_VALUE); 
		// Long타입의 최대값의  범위 벗어나서 이상한 값 나옴
//		BigInteger value1 = new BigInteger("9223372036854775808"); 
//		// 문자형으로 벗어나는 타입의 숫자 표현, 간단하게 배열이라는 박스 안에 수가 하나씩 들어가 있다고 생각하면 편함
//		System.out.println(value1.add(new BigInteger("10"))); // 산술연산자 사용 불가, 메소드 사용
//		// 새로운 인스턴스를 만들어서 값을 출력한 것
//		System.out.println(value1); // 자신의 상태값을 변화하지 않음, 상수와 비슷하다고 생각
//		
//		// 오타를 낼 수 있는 근사값 double, float
//		// BigDeciaml : 정확한 소수점을 나타낼 수 있다는 점에서 차이
//		BigDecimal dec = new BigDecimal("0.123456789");
//		System.out.println(dec);
		
		BigDecimal d = new BigDecimal(0.1);
		// 부정확한 값을 넣었으므로 부정확한 값으로 출력
		System.out.println(d);
	}
}
