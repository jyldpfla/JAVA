public class Restaurant {
	private int Id;
	private String name;
	private String number;
	private String address;
	
	
	public Restaurant(String name, String number, String address) {
		super();
		this.name = name;
		this.number = number;
		this.address = address;
	}
	public Restaurant(int id, String name, String number, String address) {
		super();
		Id = id;
		this.name = name;
		this.number = number;
		this.address = address;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "restaurant [Id=" + Id + ", name=" + name + ", number=" + number + ", address=" + address + "]";
	}
	
	
}
