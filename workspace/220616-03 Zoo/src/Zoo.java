import java.util.Arrays;

// 동물원 관리

// 동물 - 종, 나이, 무게 

// 직원 - 역할(조련사, 경영 등등), 이름
// 조련사는 동물들을 담당합니다.

// 동물은 육식 / 초식으로 나누어서 관리됩니다.
// 주식으로 분류하여 동물 목록을 볼 수 있음
// 조련사 담당에 따라 동물 목록을 볼 수 있음 (담당자가 없는 동물도 볼 수 있어야 함)

public class Zoo {
	public static void main(String[] args) {
		Animal r = new Animal("리트리버", 26, 28.5, "잡식");
		Animal a = new Animal("쿼카", 24, 3.0, "초식");
		Animal b = new Animal("뱁새", 26, 0.007, "잡식");
		Animal c = new Animal("펭귄", 25, 20.0, "육식");
		Animal d = new Animal("여우", 24, 14.0, "육식");	
		
		Animal[] aa = {r, a, b};
		
		Animal[] zk = new Z("조련사","장예림",aa);
		
		System.out.println(zk.toString());
		
		System.out.println(Arrays.toString(zk.eating(aa)));
		

	}
}
