public class Car {
	private String model;
	
	public Car(String model) {
		this.model = model;	
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
//			Car OtherCar = (Car) obj; // 이렇게 만들어서 아래 (Car)obj 줄여서 써도 됨
			return model.equals(((Car)obj).model); // 다운캐스팅하고 model 참조
		
		} else
			return false;
	}
}
