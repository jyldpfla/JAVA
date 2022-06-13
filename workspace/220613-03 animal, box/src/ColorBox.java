public class ColorBox extends Box {
	String color;
	
	public ColorBox() { // ColorBox의 기본 생성자 모습
//		super(); // 부모의 기본 생성자 호출, 부모 생성자의 기본값에 따라 기본값 설정됨
		// 부모 class에 생성자를 호출
		super(10, 20, 50);
		this.color = null;
	} 
	
	public ColorBox(int width, int length, int height, String color) {
		super(width,length, height);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
