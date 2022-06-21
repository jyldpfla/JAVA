import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		// LinkedList와 Queue의 특징을 모두 지님
		// LinkedList는 List, Queue를 implements하고 있음
		
//		List<String> list = new LinkedList<>();
//		
//		list.add("asdf");
//		list.remove(0);
		
		queue.add("원소1");
		queue.offer("원소2");
		
		System.out.println(queue);
		
		String elem1 = queue.poll();
		// 제일 앞에 있는 원소의 참조 반환, 원소가 없으면 null 반환
		String elem2 = queue.remove();
		// 제일 앞에 있는 원소의 참조 반환, 원소가 없으면 예외 반환
		
		System.out.println(elem1);
		System.out.println(elem2);
	}
}
