public class Employee {
	public String name;	// 이름: 공용 멤버
	String address;	// 주소 : 패키지 멤버, default 접근제한자
	protected int salary;	// 월급 : 보호 멤버
	private int RRN;	// 주민등록번호: 전용 멤버
	
	public Employee() {}
	
	public Employee(String name, String address, int salary, int RRN) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.RRN = RRN;
	}	// Employee의 전체 파일 초기화

	public String toString() {
		return name + ", " + address + ", " + RRN + ", " + salary;
	}
}
