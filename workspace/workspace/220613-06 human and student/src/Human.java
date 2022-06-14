public class Human {
    private String name;
    // default면 다른 패키지의 자식 접근 불가
    // protected면 상속하고 있으므로 name 가능
    // public이면 누구든지 접근 가능
    private int age;
    private String profession;
	
	public Human(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}  
	
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String toString() {
		return "이름: " + name + ", 나이: " + age;
    }
}
