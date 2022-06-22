import java.util.Set;
import java.util.TreeSet;

public class Main7 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		// TreeSet : 대소비교가 가능한 원소들을 넣으면, 대소크기대로(오름차순 정렬이 된 상태처럼) 출력됨
		
		set.add(50);
		set.add(17);
		set.add(2);
		set.add(50);
		set.add(22);
		set.add(17);
		set.add(30);
		
		for(int i : set) {
			System.out.println(i);
		}
	}
}
