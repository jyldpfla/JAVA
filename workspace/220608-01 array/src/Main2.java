public class Main2 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		int[] copy = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		
//		int[] copy = arr;
//		
		arr[0] = 1000; // 참조하고 있으므로 참조하는 값 변경하면 copy값도 달라짐
//		
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}
	} 
}
