import java.util.Arrays;
import java.util.Scanner;

// 동물원 관리

// 동물 - 종, 나이, 무게

// 직원 - 역할(조련사, 경영 등등), 이름
// 조련사는 동물들을 담당합니다.

// 동물은 육식/초식을 나누어서 관리됩니다.
// 주식으로 분류하여 동물목록을 볼 수 있음.
// 조련사 담당에 따라 동물 목록을 볼 수 있음. (담당이 없는 동물도 볼 수 있어야 함)

public class Zoo {
	Animal[] existAnimal;
	EatMeat[] eatMeat;
	EatPlant[] eatPlant;
	EatMix[] eatMix;
	
	ZooKeeper[] keeper;

	// 동물 목록
	public Animal[] registerAnimal() {
		existAnimal = new Animal[5];
		existAnimal[0] = new Animal("호랑이", 5, 70, 1);
		existAnimal[1] = new Animal("사자", 7, 80, 1);
		existAnimal[2] = new Animal("사슴", 3, 35, -1);
		existAnimal[3] = new Animal("코끼리", 8, 200, -1);
		existAnimal[4] = new Animal("강아지", 4, 14, 0);

		return existAnimal;
	}
	
	// 1.육식동물 분류.
	public EatMeat[] sortMeat() {
		int n = 0;
		eatMeat = new EatMeat[1];
		for (int i = 0; i < existAnimal.length; i++) {
			if (existAnimal[i].getFeed() > 0) {
				// 크기가 2이상일때부터 확장.
				if (eatMeat.length + n > 1) {
					eatMeat = Arrays.copyOf(eatMeat, eatMeat.length + 1);
				}
				eatMeat[eatMeat.length - 1] = existAnimal[i];
				n++;
			}
		}
		return eatMeat;
	}

	// 육식동물 출력
	public void printEatMeat() {
		sortMeat();
		for (EatMeat a : eatMeat) {
			System.out.println(a.meatSpecies());
		}
	}

	// 2.초식동물 분류.
	public EatPlant[] sortPlant() {
		eatPlant = new EatPlant[1];
		int n = 0;
		for (int i = 0; i < existAnimal.length; i++) {
			if (existAnimal[i].getFeed() < 0) {
				// 크기가 2이상일때부터 확장.
				if (eatPlant.length + n > 1) {
					eatPlant = Arrays.copyOf(eatPlant, eatPlant.length + 1);
				}
				eatPlant[eatPlant.length - 1] = existAnimal[i];
				n++;
			}
		}
		return eatPlant;
	}

	// 초식동물 출력
	public void printEatPlant() {

		sortPlant();
		for (EatPlant a : eatPlant) {
			System.out.println(a.plantSpecies());
		}
	}

	// 3. 잡식동물 분류
	public EatMix[] sortMix() {
		eatMix = new EatMix[1];
		int n = 0;
		for (int i = 0; i < existAnimal.length; i++) {
			if (existAnimal[i].getFeed() == 0) {
				// 크기가 2이상일때부터 확장.
				if (eatMix.length + n > 1) {
					eatMix = Arrays.copyOf(eatMix, eatMix.length + 1);
				}
				eatMix[eatMix.length - 1] = existAnimal[i];
				n++;
			}
		}
		return eatMix;
	}

	// 잡식동물 출력
	public void printEatMix() {
		sortMix();
		for (EatMix a : eatMix) {
			System.out.println(a.mixSpecies());
		}
	}

	
	// 4. 조련사 목록
	public ZooKeeper[] registerKeeper() {
		keeper = new ZooKeeper[3];
		keeper[0] = new ZooKeeper("제임스", "조련사", existAnimal[0], existAnimal[3]);
		keeper[1] = new ZooKeeper("한스", "조련사", existAnimal[2]);
		keeper[2] = new ZooKeeper("강형욱", "조련사", existAnimal[4]);
		
		return keeper;
	}
	
	// 메소드 : 동물원 동물 하나 vs 조련사 동물 배열 비교
	public boolean keepContain(Animal a, int n) {
		for (int i = 0; i < keeper[n].getManageAnimal().length; i++) {
			if (a.getSpecies().equals(keeper[n].getManageAnimal()[i].getSpecies())) {
				return true;
			} 
		}
		return false;
	}
	
	// 조련사 1인이 담당하지 않는 동물
	public Animal[] notManage(ZooKeeper keep, int x) {
		Animal[] temp = new Animal[existAnimal.length - keep.getManageAnimal().length];
		int n = 0;
		for (int i = 0; i < existAnimal.length; i++) {
			if (keepContain(existAnimal[i], x)) {
				continue;
			} else {
				temp[n] = existAnimal[i];
				n++;
			}
		}
		return temp;
	}
	
	// 조련사 담당 동물 출력
	public void printKeeper() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.제임스, 2.한스, 3.강형욱, 4.돌아가기");
		int sel = scan.nextInt();
		switch (sel) {
		case 1:
//			notManage(keeper[sel - 1]);
			System.out.println("1. 제임스");
			System.out.println("담당동물: " + keeper[sel - 1].toString());
			System.out.println("담당하지 않는 동물: " + Arrays.toString(notManage(keeper[sel - 1], sel - 1)));
			break;
		case 2:
			System.out.println("2. 한스");
			System.out.println("담당동물: " + keeper[sel - 1].toString());
			System.out.println("담당하지 않는 동물: " + Arrays.toString(notManage(keeper[sel - 1], sel - 1)));
			break;
		case 3:
			System.out.println("3. 강형욱");
			System.out.println("담당동물: " + keeper[sel - 1].toString());
			System.out.println("담당하지 않는 동물: " + Arrays.toString(notManage(keeper[sel - 1], sel - 1)));
			break;
		case 4:
			break;
		}
	}


	// 메인 시스템
	public void start() {
		Scanner scan = new Scanner(System.in);
		registerAnimal();
		registerKeeper();

		System.out.println("동물원관리 프로그램입니다.");
		while (true) {
			System.out.println("\n==============목록=============");
			System.out.println("1.육식동물 보기, 2.초식동물 보기, 3.잡식동물 보기, 4.조련사별 담당 동물, 5.프로그램종료");
			int sel = scan.nextInt();
			switch (sel) {
			case 1:
				printEatMeat();
				break;
			case 2:
				printEatPlant();
				break;
			case 3:
				printEatMix();
				break;
			case 4:
				printKeeper();
				break;
			case 5:
				return;
			}
		}
	}
}
