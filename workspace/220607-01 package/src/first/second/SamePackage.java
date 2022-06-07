package first.second;

public class SamePackage {
	public static void main(String[] args) {
		AnotherClass a = new AnotherClass();
		a.number = 11;
//		a.mySecret = 22;
		// private 접근자이므로
		a.test = 33;
	}
}
