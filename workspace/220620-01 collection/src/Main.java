import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 기본 생성자로 생성
		// 배열처럼 여러 개의 자료들을 가질 수 있는 하나의 객체
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100)); // Integer타입으로 박싱
		list.add(Double.valueOf(55.55));
		
		list.add(500); 
		// auto-boxing이 일어나면서 500이라는 값을 가진 Integer객체로 변환되어 객체가 담기므로 가능
		list.add(123.123); //기본형 타입을 넣은 것이 x, 기본형은 넣을 수 없음
		
//		int size = list.size();
//		System.out.println(size);
//		
//		System.out.println(list.get(0));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		
//		for (int i = 0; i < list.size(); i ++) {
//			System.out.println(list.get(i));
//		} // 모든 원소 출력
//		
//		for (int i = list.size() - 1 ; i >= 0 ; i--) {
//			System.out.println(list.get(i));
//		} // 역순 출력
		
		for(Object o : list) {
			System.out.println(o);
		} // for-each문 사용
	}
}
