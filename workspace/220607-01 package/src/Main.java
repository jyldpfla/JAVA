// package : 폴더 디렉토리
import first.InPackageClass;
import first.second.AnotherClass;

public class Main {
	public static void main(String[] args) {
		// 만들어둔 class를 instance로 참조
		InPackageClass test = new InPackageClass();
		
		AnotherClass test2 = new AnotherClass();
		test2.number = 10;
		// test2.mySecret = 22;
			//private 접근제한자 설정이므로 불러올 수 없음
		// test.test = 33;
	}
}
