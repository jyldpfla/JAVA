import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// String list, iterator
public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기 
		Iterator<String> iterator = list.iterator(); // 리스트의 원소를 하나하나 볼 수 있도록 도와주는 객체
		while(iterator.hasNext()) {
			String str = iterator.next(); // next로 다음 객체 불러올 수 있음
			if (str.length() == 5) {
				iterator.remove();
				// iterator 자기 자신을 지운게 아니라, list에 있는 것을 참조하고 있고, list껄 지워달라고 명령
				// iterator는 list를 가리키고 있음
			}
		}
		
		System.out.println(list);
		
		// 객체 1개 지우기
//		System.out.println(list.contains(new String("banana")));
//		list.remove("banana");
//		
//		System.out.println(list);
		
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기 안되는 경우
//		for(String s : list) {
//			if(s.length() == 5) {
//				list.remove(s);
//			}
//		}
//		System.out.println(list);
		// for-each는 나열, 확인 용도로만 사용하고 다른 작업은 안되는 아이라서 사용x
	}
}
