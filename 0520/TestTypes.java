// 자료형의 확장, 형변환
public class TestTypes {
	public static void main(String[] args) {
		char a = (char)65; // char a = 65
		System.out.println(a);
		
		int num = (int) a;
		System.out.println(num);
		
		//double d = 123.456;
		//int i = (int) d; // int로 형변환 안해주면 error 걸리고 형변환으로 인해 소수점 자리 사라짐
		//System.out.println(i);
		
		
		
		
		//byte b = 10;
		
		//short s = 100; // 명시적인 표현이 없다면 short를 int처럼 인식
		//int i = (int) 3214748647L;
		//long l = 10000;
		
		//System.out.println(i);
		//int sum = b + s;
		//System.out.print(sum);
	}
}
