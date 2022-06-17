
public class Manage {
	Staff trainer;
	Animal animal;
	
	public Manage(Staff trainer, Animal animal) {
		super();
		this.trainer = trainer;
		this.animal = animal;
	}

	public Manage(Animal animal) {
		this.animal = animal;
	}
	
	public Manage() {}
	
	public Staff getTrainer() {
		return trainer;
	}


	public void setTrainer(Staff trainer) {
		this.trainer = trainer;
	}


	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}


	@Override
	public String toString() {
		return "담당 [트레이너=" + trainer + ", 동물=" + animal + "]";
	}
	
}
