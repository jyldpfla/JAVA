// 기본생성자
// 의자 클래스
// 제조사
// 생산일자
// 가격
// 모델명

// 초기화 할 수 있는 생성자

// main -> 작성한 생성자를 통해 원하는 필드값으로 초기화 해보세요.

public class Chair {
	String madeBy;
	int prouctDate;
	int price;
	String modelName;
	
	public Chair(String a, int b, int c, String d) {
	// 생성자
		madeBy = a;
		prouctDate = b;
		price = c;
		modelName = d;
	}
	
	void printAll() {
		System.out.println(madeBy);
		System.out.println(prouctDate);
		System.out.println(price);
		System.out.println(modelName);
	}
	
	public static void main(String[] args) {
		Chair chair1 = new Chair("예림", 20220530, 30, "예림");
		// 원하는 필드값으로 초기화
		/*
		chair1.madeBy = "예림"; 도 가능
		*/
		Chair c = new Chair("시디즈", 20160905, 374000, "T50");
		
		chair1.printAll();
		c.printAll();
	} 
}