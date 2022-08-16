// int를 string으로 형변환 안되므로 그 때 방법
public class IntegerToString {
	public static void main(String[] main) {
		String strNum = String.valueOf(12345);
		System.out.println(strNum);
		
		//String strNum2 = "" + 12345; //이렇게도 가능
		//String strNum2 = "12345" // 처음부터 문자열 형태
		
		int i = 5055;
		String strNum2 = "" + i;
		
		System.out.println(i + 100); //숫자간 결합
		System.out.println(strNum2 + 100); //문자간 결합
		
		// System.out.println(strNum2.charAt(0));
	}
}

