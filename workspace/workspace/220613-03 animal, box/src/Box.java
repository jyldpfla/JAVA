public class Box {
	int width;
	int length;
	int height;
	
//	public Box() {
//		width = 5;
//		length = 5;
//		height = 5;
//	}
//	public Box() {} // 기본생성자 만듦
	
	public Box(int width, int length, int height) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public int getVolume() {
		return width * length * height;
	}

	
	
}
