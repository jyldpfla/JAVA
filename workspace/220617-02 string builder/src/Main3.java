import java.util.StringTokenizer;

// 문자 자르기
public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple banana carrot donut";
		
//		1번
//		String[] array = longLine.split(" "); //()안 기준으로 잘라서 배열에 담아줌
//		
//		System.out.println(array[2]); // 2index값 출력
//		
//		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		} // 배열 전체 출력
		
//		2번
//		String[] arr = new String[4];
//		StringBuilder sb = new StringBuilder(longLine);
//		for (int i = 0; i < 3; i++) {
//			int local = sb.indexOf(" ");
//			arr[i] = sb.substring(0, spaceIndex);
//			sb.replace(0, spaceIndex + 1, "");
//		}
//		
//		System.out.println(arr[2]);
		
//		3번
//		for (int i = 13, i <= 18; i++) {
//			System.out.println(longLine.charAt(i));
//		}
		
//		쌤
		StringTokenizer st = new StringTokenizer(longLine, " ");
		// (잘라내고자 하는 문자열, 기준문자열)
//		while (st.hasMoreTokens()) { // 더 자르고 싶은게 있냐 - true, false로 출력
//			System.out.println(st.nextToken()); // 있으면 출력
//		}
		while (st.hasMoreTokens()) {
			String local = st.nextToken();
			System.out.println(local);
		}

//		나
//		int[] temp;
//		for(int i = 0; i < longLine.length(); i++) {
//			int j = longLine.indexOf(" ");
//			temp =  new int  ;
//		}
//		System.out.println(temp);
	}
}
