public interface Flyable {
//	public abstract void fly(); // 추상메소드만 가질 수 있음
	void fly(); // 추상메소드만 가질 수 있으므로 abstract 생략 가능, 무조건 public이므로 생략 가능
	
//	public void print()  { // 일반메소드 가질 수 없음
//		System.out.println("Hello");
//	}
}

class Animal {}
class Bird extends Animal {}
class Eagle extends Bird implements Flyable { // 상속받을 때의 implement
	@Override
	public void fly() {
		System.out.println("독수리가 푸드득 푸드득 납니다");
	}
}
class Penguin extends Bird{}

class FlyingFish extends Animal implements Flyable { // 상속있을 때의 implement
	@Override
	public void fly() {
		System.out.println("날치가 물 위로 남");
	}
}

class Plane implements Flyable { // 상속x, implement o
	@Override
	public void fly() {
		System.out.println("비행기가 남");
	}
}