import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가", "나", "다", "다", "가", "라"));
		// 중복을 제거된 상태의 원소들만 얻고 싶을 때 -> Set 사용
		
//		Set<String> set = new HashSet<>();
//		// 알아서 중복을 걸러내주므로 원소 전체 넣어주면 됨
		
//		
//		for (int i = 0; i < list.size(); i++) {
//			set.add(list.get(i));
//		} // list의 값 전체 추가 -> 중복된 것은 추가하지 않음
		
		Set<String> set = new HashSet<>(list);
		// 생성자에 바로 List, Collection 상속하고 있는 모든 구현체들 넣어줄 수 있음 
		// -> Set 형태로 바로 다 나오게 해줄 수 있음
		
		System.out.println(set);
	}
}
