public class Phone {
	private String company;
	private int price;
	private int type;
	
	public Phone(String company, int price, int type) {
		this.company = company;
		this.price = price;
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public String toString() {
		return "제조사: " + company + ", 가격: " + price + "원, 통신타입: " + type + "g";
	}
	
	
}
