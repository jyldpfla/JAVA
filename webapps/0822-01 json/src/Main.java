import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Main {
	public static void main(String[] args) throws JsonProcessingException {
		// 사람
		// 이름 = 홍길동
		// 나이 = 22
		
		// Json 객체 생성
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode node = mapper.createObjectNode();
		
		// key, value 쌍으로 값 넣기
		node.put("name", "홍길동"); // javascript가 다루던 타입 그대로 되어있음
		node.put("age", 22); // 실수포함 숫자
		node.put("boolean", true);
		
		ObjectNode node2 = mapper.createObjectNode();
		node2.put("이름", "둘리");
		node2.put("나이", 23);
		
		node.set("bf", node2);
		// deprecated : 더 이상 사용되지 않는(다른 ver에서 사용되지 않을 수 있음)
		
		String json = mapper.writeValueAsString(node);
		// writeValueAsString : 문자열 객체로 변환
		System.out.println(json);
	}
}
