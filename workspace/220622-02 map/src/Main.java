import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("일", 1);
		// put(key, value) : 2개의 객체를 받아서 추가
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);
		
		System.out.println(map.size());
		
		System.out.println(map.get("이"));
		// 키 객체 1개를 전달 받으면 해당 value 나옴
		
		System.out.println(map.get("삼"));
		System.out.println(map.get("오"));
		// 없는 값 출력하려고 하면 null 반환
		if (!map.containsKey("이")) {
			map.put("이", 2222);
			// 중복을 피하려고 값을 덮어씌움
		}
		System.out.println(map.get("이"));
	}
}
