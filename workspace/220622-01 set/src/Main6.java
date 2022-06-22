import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("apple");
		
		for (String s : set) {
			System.out.println(s);
		}
		
//		set.get(0);
		// 추가된 순서를 기억하지만, index가 있는 것은 아님
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple", "donut", "egg", "fanta"));
//		set.addAll(set2); // LinkedHashSet에 HashSet 넣으면 순서 유지된 채로 들어감
//		System.out.println(set);
		
//		set2.addAll(set);
//		System.out.println(set2); // HashSet에 LinkedHashSet에 넣으면 순서 사라짐
	}
}
