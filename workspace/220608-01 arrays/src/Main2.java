public class Main2 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		// int[] temp = arr; // 배열을 참조하는 것이지 새로 배열을 만든 것이 아님
		
		int[] copy = new int[arr.length]; // new를 이용해 새로 참조할 인스턴스를 만들어 배열 만들기
		
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		} // 값도 같도록 값 대입연산
		
//		int[] copy = arr;
//		
		arr[0] = 1000; // 참조하고 있으므로 참조하는 값 변경하면 copy값도 달라짐
//		
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}
	} 
}
