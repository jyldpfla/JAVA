public class Main {
	public static void main(String[] args) {
		int[] aBox; // 정수형 배열 변수 선언.
		// aBox = 10; // 정수를 담는 타입이 아닌, 정수를 여러 개 담을 수 있는 타입이므로 안 됨
		aBox = new int[4]; // 길이가 4인 배열 초기화
		// new로 봤을 때 값을 참조하고 있음을 알  수 있음
		// int[4] : int형 변수를 4개를 담은 배열을 참조
		
		//int[] test = null
		// 참조를 해야하는데 null을 참조하도록 초기화 시켰기  때문에 가능
		
		System.out.println("배열의 길이값: " + aBox.length);
		// 배열의 길이를 보고 싶을 때 참조 변수.length로 호출
		// aBox.length = 10; // java 배열은 초기화시 정해둔 길이값은 상수(final field)이므로 변경 불가
	
		aBox[0]  = 56;// abox의 0번째 index에 접근 + 값 넣기 
		aBox[1]  = 57;
		aBox[2]  = 58;
		aBox[3]  = 59;
		
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]);
	}
} 
