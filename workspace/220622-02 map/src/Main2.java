import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		// generic에 <key타입, value타입> 입력해주어야함
		
		map.put("둘리", 100);
		map.put("홍길동", 90);
		map.put("도우너", 150);
		
		Map<Integer, String> map2 = new HashMap<>();
		
		map2.put(1, "둘리");
		map2.put(4, "홍길동");
		map2.put(3, "도우너");
		
		System.out.println(map.toString());
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		// entrySet() : 키와 값을 한덩어리로 묶은 박스
		for(Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}	
		
//		Set<String> keySet = map.keySet();
		// key들을 반환
//		for (String key: keySet) {
//			System.out.println(key + "=" + map.get(key));
//		}
		
		// Iterator로 키, 값 반환
//		Iterator<String> iter = keySet.iterator();
//		// keySet, iterator 순환 가능
//		while (iter.hasNext()) {
//			String key = iter.next();
//			Integer value = map.get(key);
//			
//			System.out.println(key + "=" + value);
		}
}
