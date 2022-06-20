import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);	
		
//		list.add("asdf");
		// 타입 지정해주고 다른 타입 넣으면 compiler error
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i); 
//			// object 타입을 참조하는 객체이므로, object 타입으로 알려줌
		}
		System.out.println(sum);
	}
}
