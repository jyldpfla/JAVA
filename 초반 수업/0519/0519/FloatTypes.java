public class FloatTypes {
	public static void main(String[] args) {
		float f = 123.456F; //컴파일이 기본적으로 실수는 더블로 인식, f라고 알려줘야함
		double d = 7777.88888;
		
		//double sum = f + d; //실수형도 큰 공간을 따라가므로 double이어야 함
		
		//int i = 10000;
		//sum = i + f; //정수, 실수는 실수형 타입을 따라간다(정수 크기가 커도 실수형을 따름)
		
		float one = 0.1F;
		System.out.printf("%.15f", one * 22);  //연산을 하면 오차가 발생, 정확한 표현이 안 될 수 있음
		// 실수표현 -> %.15f : 15자리까지 표현(소수점 표시)
		// 실수는 보통 double이 더 정확하므로 대체로 double로 하면 됨
		System.out.printf("%010d", 10); // %d도 자릿수 표현 가능, 10자리 표현
	}
}