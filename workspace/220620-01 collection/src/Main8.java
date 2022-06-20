import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79 ));
		// 합, 평균
		int a = 0;
		for(int i = 0; i < list.size(); i++) {
			a += list.get(i);
		}
		
		System.out.println("list의 합: " + a);
		int b = a / list.size();
		System.out.println("list의 평균: " + b);
		
		/* for-each문 사용 -> 보는 용도, for문도
		for(int i : list) {
			i;
		}
		*/
		/* Iterator 사용 -> 보기, 값 추가, 삭제
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			iter.next();
		}
		*/
		 
		// 정수 57이 리스트에 있는지? 있으면 몇 번째 index에 위치하는지?
		if(list.contains(57)) {
			System.out.println("정수 57의 index 번호: " + list.indexOf(57));
		}
		
		// 정수 23의 개수
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == 23) {
				count++;
			}	
		}
		System.out.println("정수 23의 개수: " + count);
		
		// 중복되는 원소 23을 '하나' 삭제하기
		list.remove(list.indexOf(23));
		System.out.println(list);
//		list.remove(list.lastIndexOf(23)); // 뒤에꺼 지우기
//		list.remove(Integer.valueOf(23)) // Object형을 받을 수 있을 때 Integer형으로 던져주면 지우기 가능
		
		// 전체 지우기
//		Iterator<Integer> iter = list.iterator();
//		while(iter.hasNext()) {
//			int value = iter.next();
//			if(value == 23) {
//				iter.remove();
//				break;
//			}
//		}
//		System.out.println(list);
	}
}
