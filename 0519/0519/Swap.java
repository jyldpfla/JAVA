// 두 정수의 값을 교환하고 싶을 때
public class Swap {
	public static void main(String[] args) {
		int a = 10;
		int b = 55;
		int c = a; // c라는 공간을 만들어서 저장, 과거의 값을 가지고 있음 -> 변수 공간이 하나 더 필요
		
		/* 값의 교환이 이루어지지 않음
		a = b;
		b = a;
		*/
		
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
	}
}