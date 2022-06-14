// 컵라면
// 제조사
// 이름
// 가격

// 생성자 , 게터세터

// 다음 Object 클래스 메소드 Override(재정의) 해보기~~
// toString
// equals - 제조사와 이름이 같으면 같은 컵라면

class Cup {
	private String company;
	private String name;
	private int price;
	
	public Cup(String company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
	}

	public String getCompamy() {
		return company;
	}

	public void setCompamy(String company) {
		this.company = company;
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
	public String toString() {
		return "Cup [company=" + company + ", name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cup) {
			if(company.equals(((Cup)obj).company) && name.equals(((Cup)obj).name)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}

public class Main2 {
//	 public static Ramen input1(){
//	      Scanner scan = new Scanner(System.in);
//	      System.out.println("제조사 이름 가격 넣으세요");
//	      String madein = scan.nextLine();
//	      String name = scan.nextLine();
//	      int price = scan.nextInt();
//	      return new Ramen(madein, name, price);
//	   }
	public static void main(String[] args) {
		Cup a = new Cup("왕뚜껑", "팔도", 1500);
		Cup b = new Cup("왕뚜껑", "팔도", 23000);
		System.out.println(a.toString());
		
//		System.out.println(a.equals(obj)); // 로 이미 정의 되어있으므로
//		System.out.println(a.equals(b)); // 해도 equals 쓰고 싶은대로 사용x
		
		if(a.equals(b)) {
			System.out.println("두 상품은 같은 상품입니다.");
		} else {
			System.out.println("두 상품은 다른 상품입니다.");
		}
	}
}
