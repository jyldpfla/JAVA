// 96p 형변환
public class TypeConversion {
	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4; //1.0 
		System.out.println(f);
		
		f = (double) 5 / 4; // 1.25 형변환이 먼저 일어남
		System.out.println(f);
		
		f = 5 / (double) 4; // 1.25 형변환이 먼저 일어남
		System.out.println(f);
		
		f = (double) 5 / (double) 4; // 1.25 형변환이 먼저
		System.out.println(f);
		
		i = (int) 1.3 + (int) 1.8; // 형변환이 먼저 일어나서 소수점 사라지고 계산됨 2 
		System.out.println(i);
		
		i = (int) (1.3 + 1.8); // 계산 먼저, int로 형변환 3
		System.out.println(i);
	}
}