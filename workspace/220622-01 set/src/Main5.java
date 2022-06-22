import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main5 {
	public static void main(String[] args) {
		// 중복되지 않는 1 ~ 45 사이의 정수 6개를 가지는 집합 
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			Random random = new Random();
			int r = random.nextInt(46);
			if(r != 0) {
				set.add(r);
			}
		}
		System.out.println(set);
		
		// 쌤 답1
		Set<Integer> lotto = new HashSet<>();
		Random random = new Random();
//		
//		lotto.add(random.nextInt(45) + 1);
//		lotto.add(random.nextInt(45) + 1);
//		lotto.add(random.nextInt(45) + 1);
//		lotto.add(random.nextInt(45) + 1);
//		lotto.add(random.nextInt(45) + 1);
//		lotto.add(random.nextInt(45) + 1);
//		
//		System.out.println(lotto);
		
		// 쌤 답2
		while (lotto.size() < 6) {
			lotto.add(random.nextInt(45) + 1);
		}
		
//		Collections.sort(lotto); // index없어서 안됨 -> List에 넣어서 구현
		// 정렬하고 싶을 때
		List<Integer> list = new ArrayList<>(lotto);
		
		Collections.sort(list);
		System.out.println(list);
	
	}
}
