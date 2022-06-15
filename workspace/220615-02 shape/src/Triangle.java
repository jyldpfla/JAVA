public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y); // 부모의 생성자 불러서 호출
		this.base = base;
		this.height = height;
	}
	
	@Override
	public int getArea() { // 부모 클래스 추상 메소드 구체화 => implement
		return base * height / 2;
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	
}
