public class Main {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound(); // Animal 메소드 실행
		
		Dog d = new Dog();
		d.sound(); // 자식인 Dog 메소드가 호출돼서 실행
//		d.bark();
		
		Cat c = new Cat();
		c.sound();
	}
}
