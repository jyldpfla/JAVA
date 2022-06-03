public class TestToy {

	public static void main(String[] args) {
		Toy toy1 = new Toy("새 장난감", 5000);

		// ToyFactory fac = new ToyFactory();
		// static하므로 객체 만들 필요x
		Toy chucky = ToyFactory.makeToy();
	}

}
