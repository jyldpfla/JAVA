public class Car {
	private String model;
	
	public Car(String model) {
		this.model = model;	
	}
	
	@Override
	public boolean equals(Object obj) { 
		// 모든 타입의 객체 하나를 전달 받음, 객체 안 타입이 같으면  값을 전달 받겠다
		if (obj instanceof Car) {
//			Car OtherCar = (Car) obj; // 이렇게 만들어서 아래 (Car)obj 줄여서 써도 됨
			return model.equals(((Car)obj).model); // 다운캐스팅하고 model 참조
		
		} else
			return false;
	}
}
