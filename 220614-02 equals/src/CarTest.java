public class CarTest {
	public static void main(String[] args) {
		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		
//		System.out.println(firstCar == secondCar);
		
//		firstCar.equals(new Scanner(System.in)); // 형 자체가 다르다고 인식하므로 false출력
		
		if (firstCar.equals(secondCar)) {
			System.out.println("동일한 종류의 자동차입니다.");
		} else {
			System.out.println("동일한 종류의 자동차가 아닙니다.");
		}
	}		
}
