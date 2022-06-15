public class Rectangle extends Shape {
	private int length;
	private int height;
	
	public Rectangle(int x, int y, int length, int height) {
		super(x, y);
		this.length = length;
		this.height = height;
	}
	
	@Override
	public int getArea() { 
		// public - 부모클래스랑 헤드 똑같이(넓힐 순 있음), 다른 파일에서 사용 가능하도록
		return length * height;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
