package first;

import first.second.AnotherClass;

public class UpperPackage {
	public static void main(String[] args) {
		AnotherClass a = new AnotherClass();
		a.number = 11;
//		a.mySecret = 22;
		// private 접근 제한자
//		a.test = 33;
		// default 접근제한자라서 상위 package에서 호출 불가
	}
} 