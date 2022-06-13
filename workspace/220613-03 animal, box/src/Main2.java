// p. 246 중간점검2
public class Main2 {
	public static void main(String[] args) {
		ColorBox cb2 = new ColorBox();
		// Box의 특성을 그대로 물려받은 class
		System.out.println(cb2.width);
		System.out.println(cb2.length);
		System.out.println(cb2.height);
		System.out.println(cb2.color);
		// 값 설정 안해주고 출력해주면 기본생성자에 맞춰 0, 0, 0, null 나옴
		// 기본생성자는 color라는 필드의 초기화를 통해 기본값으로 설정
		// 높이, 폭등은 부모의 기본생성자 따라 기본값
		
//		Box box1 = new Box();
//		box1.width = 10;
//		box1.length = 10;
//		box1.height = 10;
//		
//		System.out.println(box1.getVolume());
//		
//		ColorBox cb1 = new ColorBox();
//		cb1.width = 20;
//		cb1.length = 20;
//		cb1.height = 20;
//		cb1.color = "Red";
//		
//		System.out.println(cb1.getVolume());
//		System.out.println(cb1.getColor());
	}
}
