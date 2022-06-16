public class Animal {
	private String species;
	private int age;
	private double weight;
	private String taste;
	
	public Animal(String species, int age, double weight, String taste) {
		super();
		this.species = species;
		this.age = age;
		this.weight = weight;
		this.taste = taste;
	}
	
	@Override
	public String toString() {
		return "Animal [species=" + species + ", age=" + age + ", weight=" + weight + ", taste=" + taste + "]";
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

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public Animal[] eating(Animal[] a) {
		Animal[] m = new Animal[a.length]; 
		Animal[] v = new Animal[a.length]; 
		Animal[] o = new Animal[a.length];
		
		for(int i = 0; i < a.length; i++) {
			if(a[i].getTaste().equals("육식")) {
				m[i] = a[i];
			} else if(a[i].getTaste().equals("초식")) {
				v[i] = a[i];
			} else  { 
				o[i] = a[i];
			}
		}
		return m;
	}
}
