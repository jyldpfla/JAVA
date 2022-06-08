public class Main3 {
	public static void main(String[] args) {
		// 실수 1.02, 0.03, 4.0
		double d1 = 1.02;
		double d2 = 0.03;
		double d3 = 4.0;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		// 배열에 담기
//		double[] myArr = new double[3];
//		myArr[0] = 1.02;
//		myArr[1] = 0.03;
//		myArr[2] = 4.0;
//		double[] myArr = new double[] {1.02, 0.03, 4.0}; // 표현방법 1
		double[] myArr = {1.02, 0.03, 4.0}; // 표현방법 2
		
		System.out.println(myArr); // 원소값을 확인하는 것이 아닌 객체를 부른 것이므로 값 요상하게 나옴
		
		for(int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
	}
}
