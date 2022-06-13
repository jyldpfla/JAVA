public class Manager extends Employee {
	private int bonus;
	
	public Manager() {
//		super(); // 생략 가능, 자동으로 호출됨
	} // 기본생성자, 부모의 기본생성자 없으면 compile error남
	
	public Manager(String name, String address, int salary, int RRN, int bonus) {
		super(name, address, salary, RRN);
		this.bonus = bonus;
	} // Generate Constructors from SuperClass 눌러도 super 초기화 나옴
	
	public void printSalary() {
		System.out.println(name + "(" + address + "):" + (salary + bonus));
	}
	
	public void printRRN() {
//		System.out.println(RRN); // 부모클래스에서 private로 선언 - compile error
	}
}
