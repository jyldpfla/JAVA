import java.util.Arrays;

public class ZooKeeper extends Employee {
	private Animal[] manageAnimal;

	public ZooKeeper(String name, String work, Animal... animals) {
		super(name, work);
		manageAnimal = animals;
	}

	public Animal[] getManageAnimal() {
		return manageAnimal;
	}

	public void setManageAnimal(Animal[] manageAnimal) {
		this.manageAnimal = manageAnimal;
	}

	@Override
	public String toString() {
		return Arrays.toString(manageAnimal);
	}
	
}
