import java.util.ArrayList;
import java.util.List;

class Point2D {
	private int x;
	private int y;
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
public class Main {
	public static void main(String[] args) {
		List<Point2D> list = new ArrayList<>();
		// 0, 0
		list.add(new Point2D(0, 0)); // 생성자로 객체 추가
		// 5, 5
		list.add(new Point2D(5, 5));
		
		Point2D p = list.get(0);
		System.out.println(p);
		
		Point2D p2 = list.get(1);
		System.out.println(p2);
		
		// 리스트에 0,0 좌표 객체가 있는지??
		// 리스트에 0,0 좌표 객체의 인덱스는??
		System.out.println(list.contains(new Point2D(0, 0)));
		// 있는지 없는지 비교할 때, equals를 기준으로 -> false
		// 모든 class들을 object를 상속받으므로 equals메소드를 가져서 contains에서 equals를 가져옴
		// System.out.println("오버라이드 전: " + new Point2D(0, 0).equals(new Point2D(0, 0)));
		System.out.println("오버라이드 후: " + new Point2D(0, 0).equals(new Point2D(0, 0)));
		// x, y 좌표가 같으면 같은 거라고 알려주어야 함 -> equals 재정의
		System.out.println(list.indexOf(new Point2D(0, 0)));
		
		System.out.println(list.remove(new Point2D(5, 5))); 
		// equals 정의해둬서 똑같은 거 찾아서 지울 수 있음
		
		System.out.println(list);
		
		
		
	}
}
