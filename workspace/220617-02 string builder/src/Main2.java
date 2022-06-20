import java.util.StringJoiner;

// String builder랑 비슷, 모양 낼 때 사용
public class Main2 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",", "[", "]");
		// ,를 구분자로 지정
		sj.add("1");
		sj.add("2");
		sj.add("3");
				
		System.out.println(sj); // toString()이 자동으로 불러짐
		String result = sj.toString(); // 명시적으로 호출
		
		System.out.println(result);
	}
}
