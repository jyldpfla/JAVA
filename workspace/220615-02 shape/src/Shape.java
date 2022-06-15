// 추상 메소드

// 도형
// x좌표
// y좌표

// 넓이 구할 수 있음.
public abstract class Shape { // 추상 클래스
	private int x;
	private int y;
	// 추상 메소드 - 동작에 대한 구체적인 것이 x
	public abstract int getArea(); // 메소드 Head만 존재
	// 넓이를 구하는 메소드 쓸 수 없음, 도형이 정해져야 구할 수 있으므로
	// 도형은 추상적이므로 (구체적인 원, 삼각형x) 넓이를 실제적으로 구할 수 없음
	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}

}
