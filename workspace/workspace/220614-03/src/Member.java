import java.util.Scanner;

public class Member {
	private String name;
	private double height;
	private double weight;
	
	public Member() {}
	
	public Member (String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	public Member member(Member mem) {
		Scanner scan = new Scanner(System.in);
		System.out.println("회원 이름을 입력하세요");
		String a = scan.nextLine();
		mem.name = a;
		System.out.println("회원의 키를 입력하세요");
		double b = scan.nextDouble();
		mem.height = b;
		System.out.println("회원의 몸무게를 입력하세요");
		double c = scan.nextDouble();
		mem.weight = c;
		
		return mem;
	}
}
