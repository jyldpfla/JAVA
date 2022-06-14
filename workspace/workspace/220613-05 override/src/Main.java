public class Main {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.sound(); // Animal 메소드 실행
		
//		Cat c = new Cat();
//		c.sound();
		
//		Dog d = new Dog();
//		d.sound(); // 자식인 Dog 메소드가 호출돼서 실행
//		d.bark();
		
//		Animal a = new Dog(); // 강아지는 동물이므로 up casting이 자동적으로 일어남
//		a.sound();
//		
//		Animal another = new Animal();
//		another.sound();
//		
//		Dog d = (Dog) a;
//		d.sound();
		
//		Animal a = new Cat();
//		Animal a2 = new Dog();
		
//		Dog d = (Dog) a; // compile은 되지만 cat은 dog가 아니므로 runtime error
//		Dog d2 = (Dog) a2; 
//		인스턴스 비교하고 결과 출력
//		if(a instanceof Dog) {
//			Dog d = (Dog) a;
//			d.sound();
//		} 
//		
//		if (a2 instanceof Dog) {
//			Dog d2 = (Dog) a2;
//			d2.sound();
//		}
		
		
		Dog d = new Dog();
		Dog p = new Poodle();
		
		Animal a = p;
		
		a.sound();
		
		Object o = new Poodle();
		System.out.println(o.toString());
	}
}
