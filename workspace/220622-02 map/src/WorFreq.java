import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WorFreq {
	public static void main(String[] args) {
		String line = "Hello. I'm a java developer.";
		Map<Character, Integer> map = new HashMap<>();
		// hashmap의 기본 toString : public final String toString() { return key + "=" + value; }
		
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i); //문자 하나씩 c에 넣어주기
			if (!map.containsKey(c)) { // 하나씩 key에 넣는데, key값이 이미 존재하지 않으면,
				map.put(c, 1); // value에 1(= 1개가 있다)부여
			} else {
				map.put(c, map.get(c) + 1); // 똑같은 이름의 키가 있으면 값을 하나 더해주기
			}
		}
		System.out.println(map);
		
		
//		Map<String, Integer> m = new HashMap<String, Integer>();
//		
//		String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "problem"};
//		
//		for (String a : sample) { // 단어 하나씩 가져오기
//			Integer freq = m.get(a); // key를 집어넣어보기 -> 없으면 null 반환
//			m.put(a, (freq == null) ? 1: freq + 1);
//		}
//		
//		System.out.println(m.size() + " 단어가 있습니다");
//		System.out.println(m.containsKey("to"));
//		System.out.println(m.isEmpty());
//		System.out.println(m);
	}
}
