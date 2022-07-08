import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main7 {
	public static void main(String[] args) {
		Map<Integer, Set<Integer>> lotto = new LinkedHashMap<>();

		lotto.put(1000, new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
		lotto.put(1001, new HashSet<Integer>(Arrays.asList(7, 8, 9, 10, 11, 12)));
		lotto.put(1002, new HashSet<Integer>(Arrays.asList(13, 14, 15, 16, 17, 18)));

		// lotto.txt 출력
		// Set.toString으로 출력
		// 1000 : [1, 2, 3, 4, 5, 6]
		// 1001 : [7, 8, 9, 10, 11, 12]
		// 1002 : [13, 14, 15, 16, 17, 18]

		File lottos = new File("d:\\filetest\\lotto.txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
			pw.println("새 번호: 20, 22, 24, 26, 28, 30"); // 값이 덮어씌워짐
		} catch (IOException e) {
			
		} finally {
			pw.close();
		}
		
		// 그럼 덧붙이고 싶을때는?
		PrintWriter pw2 = null;
		try {
			pw2 = new PrintWriter(file, true);
			// append : 파일 뒤에 추가한다고 true로 설정
			pw2.println("새 번호: 20, 22, 24, 26, 28, 30"); // 값이 덮어씌워짐
		} catch (IOException e) {
			
		} finally {
			pw.close();
		}

		try {
			pw = new PrintWriter(new FileWriter(lottos)); // printwriter -> 한줄씩 출력하기 편하게!

			for (Entry<Integer, Set<Integer>> entrySet : lotto.entrySet()) {
				pw.println(entrySet.getKey() + " : " + entrySet.getValue());
			}
			
			Set<Integer> keySet = lotto.keySet();
			for(Integer i : keySet) {
				System.out.println(i + " : " + lotto.get(i));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}
}
