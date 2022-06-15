public class CupNoodle {
	private String production;
	private String name;
	private int price;
	
	public CupNoodle(String production, String name, int price) {
		this.production = production;
		this.name = name;
		this.price = price;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof CupNoodle)) {
			return false;
		}
		
		CupNoodle other = (CupNoodle) obj; // 이름, 제조사만 비교
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (production == null) {
			if (other.production != null)
				return false;
		} else if (!production.equals(other.production))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "CupNoodle [production=" + production + ", name=" + name + ", price=" + price + "]";
	}
}

