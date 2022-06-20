import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9 , 1));
		
		Collections.sort(list); // 리스트 오름차순 정렬(list 작업을 수월하게 도와주는 인터페이스)
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 8); // 이진검색, 찾고자 하는 값의 index 번호 알려줌
		System.out.println("8의 인덱스: " + index);
		
		Collections.reverse(list); // 순서 역순 출력
		System.out.println(list);
		
		Collections.shuffle(list); // 순서 섞어서 출력
		System.out.println(list);
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		Collections.fill(list, 33); // 길이값은 그대로 유지, 원소값은 전부 변경
		System.out.println(list);
	
		Collections.replaceAll(list, 33, 77);
		// 기존 값 중 원하는 기존 값을 변경하고자 하는 값으로 변경
		System.out.println(list);
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));
		Collections.copy(list, target);
		// 리스트1의 값이 리스트에 복사되어 각 인덱스에 자리 잡음(복사될 만큼의 칸이 없으면 안됨)
		System.out.println(list);
	}
}
