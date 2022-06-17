// 동물원 관리

// 동물  - 종, 나이, 무게

// 직원 - 역할(조련사, 경영, 엔터테이너, 청소, 매표소), 이름
// 조련사는 동물을 담당합니다.

// 동물은 육식/초식으로 나누어 관리됩니다.

// 먹이로 분류하여 동물 목록을 볼 수 있음.(완료)
// 조련사 담당에 따라 동물 목록을 볼 수 있음.(담당이 없는 동물도 볼수 있되 경고나 강조를 해주면 좋을거 같다.) (완료)

// 동물을 추가하는 로직
// 스탭을 추가하는 로직
// 매니징을 추가하는 로직

public class Main {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Animal[] animal = new Animal[4];
		animal[0] = new Elephent("코끼리", 3, 300);
		animal[1] = new Rabbit("토끼", 1, 3);
		animal[2] = new Lion("사자", 3, 150);
		animal[3] = new Wolf("늑대", 3, 40);
		Staff[] staff = new Staff[5];
		staff[0] = new Trainer("aaa", 27, "조련사");
		staff[1] = new Manager("bbb", 32, "경영");
		staff[2] = new Trainer("ccc", 29, "조련사");
		staff[3] = new Trainer("ddd", 30, "조련사");
		staff[4] = new Manager("eee", 31, "경영");
		Manage[] manage = new Manage[4];
		manage[0] = new Manage(staff[0], animal[0]);
		manage[1] = new Manage(animal[1]);
		manage[2] = new Manage(staff[2], animal[2]);
		manage[3] = new Manage(staff[3], animal[3]);
		
		zoo.zooManagement(animal, staff, manage);
	}
}
