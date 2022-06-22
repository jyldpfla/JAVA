import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		boolean b1 = set.add("qwer");
		// 원소 추가되었는지 true, false로 출력
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer"); // add를 할 때 원소가 중복된다면, 중복을 걸러내고 추가하지 않음
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		System.out.println(set.size());
		
		System.out.println(set.toString());
		// toString이 override 되어있어서 확인 가능
		
//		set.get(0); // list와 다르게 원소들의 index를 가지지 않음 -> get이라는 행동 존재x
//		for(int i = 0; i < set.size(); i++) {
//			set.get(i);
//		} // for문으로 가져올 수 없음
		
		for(Object o : set) {
			System.out.println(o);
		} // 원소들 하나하나 꺼내와서 출력하는 for-each문으로 원소 전체 순환 가능
	
		Iterator<Object> iter = set.iterator();
		// iterator implements하고 있어서 호출 가능
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		} // 원소 전체 순환2
	}
}
