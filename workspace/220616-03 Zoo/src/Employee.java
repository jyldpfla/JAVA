import java.util.Arrays;

public class Employee {
	private String job;
	private String name;
	
	public Employee(String job, String name) {
		super();
		this.job = job;
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Zookeeper extends Employee {
	private Animal[] animal;

	public Zookeeper(String job, String name, Animal[] animal) {
		super(job, name);
		this.animal = animal;
	}

	public Animal[] getAnimal() {
		return animal;
	}

	public void setAnimal(Animal[] a) {
		this.animal = a;
	}

	@Override
	public String toString() {
		return "Zookeeper [a=" + Arrays.toString(animal) + "]";
	}
	
//	public Animal[] eating(Animal[] a) {
//		for(int i = 0; i < a.length; i++) {
//			if(a[i].getTaste().equals("육식")) {
//				b[i] = a[i];
//			} else if(a[i].getTaste().equals("초식")) {
//				b[i] = a[i];
//			} else  {
//				b[i] = a[i];
//			}
//		}
//		return null;
//	}
	
	
	
}
