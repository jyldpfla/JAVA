public class Animal implements EatMeat, EatPlant, EatMix {
	private String species;
	private int age;
	private int weight;
	private int feed;
	// 양수면 - 육식, 음수 - 초식, 0이면 잡식
	
	
	public Animal(String species, int age, int weight, int feed) {
		super();
		this.species = species;
		this.age = age;
		this.weight = weight;
		this.feed = feed;
	}

	public int getFeed() {
		return feed;
	}

	public void setFeed(int feed) {
		this.feed = feed;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return species;
	}
	
	@Override
	public String plantSpecies() {
		return species;
	}

	@Override
	public String meatSpecies() {
		return species;
	}

	@Override
	public String mixSpecies() {
		return species;
	}
	
	
	
}
