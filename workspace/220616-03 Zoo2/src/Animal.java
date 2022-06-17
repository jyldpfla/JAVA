// 이진호 오빠 분 과제
public class Animal {
	private String species;
	private int age;
	private int weight;
	
	public Animal(String species, int age, int weight) {
		this.species = species;
		this.age = age;
		this.weight = weight;
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

	@Override
	public String toString() {
		return "동물 [종 =" + species + ", 나이=" + age + ", 무게=" + weight + "]";
	}
	
}

class Elephent extends Animal implements IHerbivores{

	public Elephent(String species, int age, int weight) {
		super(species, age, weight);
	}
}
class Rabbit extends Animal implements IHerbivores{
	
	public Rabbit(String species, int age, int weight) {
		super(species, age, weight);
	}
}

class Lion extends Animal implements ICarnivores{

	public Lion(String species, int age, int weight) {
		super(species, age, weight);
	}

}
class Wolf extends Animal implements ICarnivores{
	
	public Wolf(String species, int age, int weight) {
		super(species, age, weight);
	}
	
}

