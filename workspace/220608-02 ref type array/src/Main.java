public class Main {
	public static void main(String[] args) {
		String[] arr = new String[3];
		// 참조형 타입 값들 기본형 null로 초기화
		arr[0] = "ABC"; // 참조
		arr[1] = "DEF";
		arr[2] = "GHI";
		// 참조형 type으로 배열 만들기
		
		System.out.println(arr[0]); // index로 접근하면 참조값 사용 가능
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
