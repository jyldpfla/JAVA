import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main7 {
	public static void main(String[] args) {
		// 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 5; i++) {
			list.add(2 * i);
		}
		System.out.println(list);
		
		// 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
		List<Integer> list2 = new ArrayList<>();
		for(int i = 1; i <= 5; i++) {
			list2.add(7 * i);
		}
		System.out.println(list2);
		
		// 3번. 위의 리스트의 원소들을 모두 다 가지는 리스트
		List<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(list);
		list3.addAll(list2);
		System.out.println(list3);
		
		// 3번의 리스트를 오름차순으로 정렬된 원소를 가지는 리스트
		List<Integer> list4 = new ArrayList<>(list3);
		Collections.sort(list4);
		System.out.println(list4);
		
		// --
		// (Random 객체를 사용하여) 0 ~ 10 사이의 난수를 6개 가지는 리스트 (각 숫자값은 중복되지 않아야 함)
		List<Integer> list5 = new ArrayList<>();
		Random random = new Random();
			while(list5.size() < 6) {
				int result = random.nextInt(11);
				// nextInt(숫자) : 0부터 숫자-1까지의 값 안에서 하나 가져옴 
				if(!list5.contains(result)) {
					list5.add(result);
				}
			}
		System.out.println(list5);
//		// 만들고 싶은거
//		if(list5.get(i) == list5.get(i-1)) {
//			i--;
//		}
	}
}
