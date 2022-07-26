import javax.swing.ImageIcon;

public class Product {
	private int id;
	private String product_Image;
	
	public Product(int id, String product_Image) {
		super();
		this.id = id;
		this.product_Image = product_Image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_Image() {
		return product_Image;
	}

	public void setProduct_Image(String product_Image) {
		this.product_Image = product_Image;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product_Image=" + product_Image + "]";
	}
	
}
