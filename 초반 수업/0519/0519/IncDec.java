// 기존의 a 값에서 5보다 큰 값을 a에 집어 넣고 싶음
public class IncDec {
	public static void main(String[] args) {
		int a = 55;
		
		a = 78;
		
		//a = a + 5;
		a += 5; // 복합대입연산자
		
		System.out.println(a);
		
		a -= 3; //복합연산자는 산술연산자가 대입연산자 앞에 위치해야함
		a *= 2;
		a /= 4;
		a %= 2;
	}
}