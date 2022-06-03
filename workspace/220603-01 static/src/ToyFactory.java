public class ToyFactory {
	// private String location;
	// 공장이 여러 개 있을 때, 그 안에 객체별로 활용하는 메소드가 있으면 둘 다 static x
	// 전체 공장 하나를 뭉쳐서 생각하거나, 하나의 공장일 경우엔 static가능
	
	public static Toy makeToy() {
		return new Toy("처키인형", 10000);
	}
	// 객체를 사용하는 건 상태를 보여주기 위함인데, 기능(동작) 하나만 수행하겠다면 
	// 객체 없는 static도 사용하기 좋음
}
