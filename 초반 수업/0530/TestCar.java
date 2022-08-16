public class TestCar {
	public static void main(String[] args) {
		Car c = new Car("green", 10, 1); // () 없으면 생성자가 없다고 error
		Car c2 = new Car("yellow"); // 두 번째 생성자를 호출
		Car c3 = new Car("red");
		
		// c.color = "빨강"; // private 제한자를 사용했으므로 호출이 불가해서 error
		// System.out.println(c.color);
		
		c.setColor("빨강");
		System.out.println(c.getColor());
		
		// c2.setColor(null);
		// c3.setColor("새 색상");
		
		// Car s = new Car();
		c2.setSpeed(45);
		System.out.println(c2.getSpeed());
		
		c2.setGear(5);
		System.out.println(c2.getGear());
	}
}