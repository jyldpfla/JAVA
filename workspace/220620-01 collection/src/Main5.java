import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
		// 생성자 안에 List를 넣어주면 그에 해당하는 원소를 그대로 가져올 수 있음
		// 생성자로 리스트 만들면 원소 추가, 삭제 가능
		System.out.println(list);
		
//		List<Integer> test = Array.asList(10, 20, 30, 40, 50);
//		// 원소 추가, 삭제 불가
//		test.add(60);
		
		list.addAll(Arrays.asList(60, 70, 80));
		// 생성자에 추가하지 않고, 이후에 여러 개 추가하고 싶을 때, 생성자에 추가하는 거랑 똑같음
		System.out.println(list);
		
		list.removeAll(Arrays.asList(30, 40, 50));
		// () 안 원소 전부 지움
		System.out.println(list);
		
		System.out.println(list.containsAll(Arrays.asList(10, 20)));
		// () 안 원소 다 있는지
		
		List<Integer> sub = list.subList(0, 3);
		// sub(index시작, index 끝) : 원하는 index 구간의 값을 가지는 새 리스트를 만들어줌
		System.out.println(sub);
		System.out.println(list);
		
		
	}
}
