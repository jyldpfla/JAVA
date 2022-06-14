package Food;


public class Melon extends Food {
	private String plantation;

	public Melon(int cal, int price, double weight, String plantation) {
		super(cal, price, weight);
		this.plantation = plantation;
	}

	public String getPlantation() {
		return plantation;
	}

	public void setPlantation(String plantation) {
		this.plantation = plantation;
	}

	public String toString() {
		return super.toString() + ", 경작 농원: " + plantation;
	}

	
	
}
