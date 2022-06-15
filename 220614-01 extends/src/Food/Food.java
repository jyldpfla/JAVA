package Food;

public class Food {
  private int cal;
  private int price;
  private double weight;
  
	public Food(int cal, int price, double weight) {
		this.cal = cal;
		this.price = price;
		this.weight = weight;
	}
	
	public int getCal() {
		return cal;
	}
	
	public void setCal(int cal) {
		this.cal = cal;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Food [cal=" + cal + ", price=" + price + ", weight=" + weight + "]";
	}
	
//	@Override
//	public String toString() {
//		return "칼로리 : " + cal + "kcal, 가격: " + price + "원, 중량: " + weight + "kg";
//	}
	
	
}
