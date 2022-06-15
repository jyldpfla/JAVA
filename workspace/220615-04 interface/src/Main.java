public class Main {
	public static void main(String[] args) {
//		Flyable f = new Flyable(); // 안에 비어있고, 인스턴스화 불가
		
		Penguin penguin = new Penguin();
//		Flyable test = penguin; // 연관관계가 없으므로 해당 타입으로 업캐스팅 불가
		
		Eagle e = new Eagle();
		Bird b = e; // upcasting
		Animal a = e;  // upcasting
		Flyable f = e; // 타입으로 참조 가능
		
		Eagle downCasting = (Eagle) f; // f는 Eagle타입과 일치하므로
		downCasting.fly();
		
		f.fly(); // 메소드 호출
		
		Flyable p = new Plane();
//		Eagle test = (Eagle) p; // 비행기와 독수리는 관련이 없는 형이므로 다운캐스팅 runtime error
		Flyable fish = new FlyingFish();
		
		p.fly();
		fish.fly();
	}
}
