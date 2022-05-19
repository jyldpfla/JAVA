public class IntegerTypes {
	public static void main(String[] args) {
		byte b = 100;
		short s = 30000;
		int i = 10_000_000; //,통해 자릿수 표현하면 copile error 대신해서 _사용
		long l = 123456789L; // L(l) : 컴파일러에게 long type의 큰 숫자임을 알려줌
		
		long sum = 100 + 100L; // 큰 범위따라 박스 설정, int쓰면 안됨
		
		int bs = b + s;
		System.out.println(bs);
		
		// byte b2 = 100;
		
		//byte sum = b + b2; //너무 작은공간에 큰 숫자를 넣으려고 하면 손실발생 o , 적절한 사이즈의 공간 지정 필요
		// int가 부족할 경우 long 사용
		//System.out.println(sum); 
	}
}