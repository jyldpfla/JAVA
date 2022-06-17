public class Animal {
	private String species;
	private int age;
	private int weight;
	private String mainMeal;
	
	public String getMainMeal() {
		return mainMeal;
	}

	public void setMainMeal(String mainMeal) {
		this.mainMeal = mainMeal;
	}

	public Animal(String species, int age , int weight, String mainMeal) {
		this.species = species;
		this.age = age;
		this.weight = weight;
		this.mainMeal = mainMeal;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String PrintAll() {
		return this.species + "\t" + this.age + "\t" + this.weight + "\t\t" + this.mainMeal  ;
	}
}