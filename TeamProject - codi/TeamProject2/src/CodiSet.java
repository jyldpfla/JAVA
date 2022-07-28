import java.sql.Blob;

public class CodiSet {
	int id;
	String product1;
	String product2;
	String product3;
	String product4;
	String product5;
	String product6;
	String product7;
	String product8;
	Blob codiset_image;
	String user_id;
	String tag_theme;
	
	public CodiSet(String product1, Blob codiset_image, String user_id, String tag_theme) {
		super();
		this.product1 = product1;
		this.codiset_image = codiset_image;
		this.user_id = user_id;
		this.tag_theme = tag_theme;
	}
	
	public CodiSet(String product1, String product2, Blob codiset_image, String user_id, String tag_theme) {
		super();
		this.product1 = product1;
		this.product2 = product2;
		this.codiset_image = codiset_image;
		this.user_id = user_id;
		this.tag_theme = tag_theme;
	}

	public CodiSet(String product1, String product2, String product3, Blob codiset_image, String user_id,
			String tag_theme) {
		super();
		this.product1 = product1;
		this.product2 = product2;
		this.product3 = product3;
		this.codiset_image = codiset_image;
		this.user_id = user_id;
		this.tag_theme = tag_theme;
	}

	public CodiSet(String product1, String product2, String product3, String product4, Blob codiset_image,
			String user_id, String tag_theme) {
		super();
		this.product1 = product1;
		this.product2 = product2;
		this.product3 = product3;
		this.product4 = product4;
		this.codiset_image = codiset_image;
		this.user_id = user_id;
		this.tag_theme = tag_theme;
	}

	public CodiSet(String product1, String product2, String product3, String product4, String product5,
			Blob codiset_image, String user_id, String tag_theme) {
		super();
		this.product1 = product1;
		this.product2 = product2;
		this.product3 = product3;
		this.product4 = product4;
		this.product5 = product5;
		this.codiset_image = codiset_image;
		this.user_id = user_id;
		this.tag_theme = tag_theme;
	}

	public CodiSet(String product1, String product2, String product3, String product4, String product5, String product6,
			Blob codiset_image, String user_id, String tag_theme) {
		super();
		this.product1 = product1;
		this.product2 = product2;
		this.product3 = product3;
		this.product4 = product4;
		this.product5 = product5;
		this.product6 = product6;
		this.codiset_image = codiset_image;
		this.user_id = user_id;
		this.tag_theme = tag_theme;
	}

	public CodiSet(String product1, String product2, String product3, String product4, String product5, String product6,
			String product7, Blob codiset_image, String user_id, String tag_theme) {
		super();
		this.product1 = product1;
		this.product2 = product2;
		this.product3 = product3;
		this.product4 = product4;
		this.product5 = product5;
		this.product6 = product6;
		this.product7 = product7;
		this.codiset_image = codiset_image;
		this.user_id = user_id;
		this.tag_theme = tag_theme;
	}
	
	public CodiSet(String product1, String product2, String product3, String product4, String product5, String product6,
			String product7, String product8, Blob codiset_image, String user_id, String tag_theme) {
		super();
		this.product1 = product1;
		this.product2 = product2;
		this.product3 = product3;
		this.product4 = product4;
		this.product5 = product5;
		this.product6 = product6;
		this.product7 = product7;
		this.product8 = product8;
		this.codiset_image = codiset_image;
		this.user_id = user_id;
		this.tag_theme = tag_theme;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct1() {
		return product1;
	}

	public void setProduct1(String product1) {
		this.product1 = product1;
	}

	public String getProduct2() {
		return product2;
	}

	public void setProduct2(String product2) {
		this.product2 = product2;
	}

	public String getProduct3() {
		return product3;
	}

	public void setProduct3(String product3) {
		this.product3 = product3;
	}

	public String getProduct4() {
		return product4;
	}

	public void setProduct4(String product4) {
		this.product4 = product4;
	}

	public String getProduct5() {
		return product5;
	}

	public void setProduct5(String product5) {
		this.product5 = product5;
	}

	public String getProduct6() {
		return product6;
	}

	public void setProduct6(String product6) {
		this.product6 = product6;
	}

	public String getProduct7() {
		return product7;
	}

	public void setProduct7(String product7) {
		this.product7 = product7;
	}

	public String getProduct8() {
		return product8;
	}

	public void setProduct8(String product8) {
		this.product8 = product8;
	}

	@Override
	public String toString() {
		return "CodiSet [id=" + id + ", product1=" + product1 + ", product2=" + product2 + ", product3=" + product3
				+ ", product4=" + product4 + ", product5=" + product5 + ", product6=" + product6 + ", product7="
				+ product7 + ", product8=" + product8 + "]";
	}
	
}
