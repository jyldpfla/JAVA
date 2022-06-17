
public class Employee {
	private String name;
	private String work;

	public Employee(String name, String work) {
		super();
		this.name = name;
		this.work = work;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", work=" + work + "]";
	}
	
}
