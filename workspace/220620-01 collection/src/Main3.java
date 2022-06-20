import java.util.List;
import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		// 위의 리스트에 10, 20, 30, 40
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
		for(int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}
		
		// 모든 원소들을 출력해보세요
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		System.out.println(list.toString());
		list.set(1, 15);
		System.out.println(list);
		
		System.out.println(list.contains(20));
		// contain(찾는값) -> true, false로 알려줌
		System.out.println(list.indexOf(30));
		// indexOf(찾는값) -> index 번호 출력
		
		list.remove(2);
		// 번호에 맞는 원소값 삭제 -> 사이즈가 줄어들면서, 삭제된 index를 뒤 index가 채워줌(index가 줄어듦)
		System.out.println(list);
		
		list.add(0, 0);
		// add(index번호, 넣고자하는값) : 번호 위치에 값 추가, size 변경, index가 밀려남
		
//		list.clear();
		// list에 값을 전부 지우기
		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
		}
		System.out.println("지운 결과: " + list);
		// index가 지워지면서 땡겨지고 하므로 다 지울 때는 반복문보다 clear 사용
		
		// 리스트가 다 지워졌는지 확인
		System.out.println(list.size() == 0);
		System.out.println(list.isEmpty());
		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		
//		list.get(0);
//		list.get(1);
//		list.get(2);
//		list.get(3);		
	}
}
