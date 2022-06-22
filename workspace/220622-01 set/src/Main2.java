import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana");
		
		System.out.println(set.size());
		// 중복 x -> 3
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		} // 원소 전체 순환 -> 삽입된 순서를 전혀 신경쓰지 않아서 다르게 출력됨
		// 순서 신경쓰지 x, index 없음
		
		set.contains("banana");
		set.contains("donut"); // 원소 가지고 있는지 여부 확인 가능
	}
}
