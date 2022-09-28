
public class Main {
	public static void main(String[] args) {
//		List<String> list;
		MyHolder<String> h1 = new MyHolder<>("스트링값 가지는 객체"); // 스트링으로 generic 지정
		MyHolder<Integer> h2 = new MyHolder<>(199);
		
		MyPair<String, Integer> p1 = new MyPair<>("키값", 456);
		MyPair<String, String> p2 = new MyPair<>("스트링키", "스트링밸류");
		MyPair<String, MyPair<String,String>> p3;
		
		// 동적인 타입 사용을 위해서 만들었기 때문에 굳이 이렇게 쓸 필요는 없음
//		MyHolder h3 = new MyHolder(); // MyHolder 기본 생성자로 generic없이 쓸 수 있음
//		h3.setO(o); // 안에 있는 메소드들이 Object로 동작하게끔 설정됨
	}
}
