import java.util.Scanner;

public class Zoo {
	// 동물원관리
	public void zooManagement(Animal[] animal, Staff[] staff, Manage[] manage) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("===========================동물원 관리===========================");
			System.out.println(" 1.동물 관리 | 2.직원 관리 | 3.동물 입력 | 4.직원 입력 | 5.담당 입력(미구현) | 0.종료");
			System.out.println("==============================================================");
			int input = scan.nextInt();
			switch (input) {
			case 1: {
				animalManage(animal);
				continue;
			}
			case 2: {
				staffManage(staff, manage);
				continue;
			}
			case 3: {
				animal = inputAnimal(animal);
				continue;
			}
			case 4: {
				staff = inputStaff(staff);
				continue;
			}
			case 5: {
				manage = inputManage(animal, staff, manage);
				continue;
			}
			case 0: {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			default: {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}
			System.out.println("프로그램 종료.");
			break;
		}
	}

///////////////////////////////////////////////////////////////동물관리	
	public void animalManage(Animal[] animal) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("==========1.동물 관리=====================");
			System.out.println(" 1.초식 동물 | 2.육식 동물 | 3.모든 동물 | 0.이전");
			System.out.println("=======================================");
			int input = scan.nextInt();
			switch (input) {
			case 1: {
				System.out.println("==========1.초식 동물===========");
				for (int i = 0; i < animal.length; i++) {
					if (animal[i] instanceof IHerbivores) {
						System.out.println(animal[i].toString());
					}
				}
				continue;
			}
			case 2: {
				System.out.println("==========2.육식 동물===========");
				for (int i = 0; i < animal.length; i++) {
					if (animal[i] instanceof ICarnivores) {
						System.out.println(animal[i].toString());
					}
				}
				continue;
			}
			case 3: {
				System.out.println("==========3.모든 동물===========");
				for (int i = 0; i < animal.length; i++) {
					System.out.println(animal[i].toString());

				}
				continue;
			}
			case 0: {
				System.out.println("이전으로 돌아갑니다.");
				break;
			}
			default: {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}
			break;
		}
	}

///////////////////////////////////////////////////////////////직원관리
	public void staffManage(Staff[] staff, Manage[] manage) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("==========2.직원 관리==========");
			System.out.println(" 1.직원 확인 | 2.담당 동물 | 0.이전  ");
			System.out.println("=============================");
			int input = scan.nextInt();
			switch (input) {
			case 1: {
				jobinfo(staff);
				continue;
			}
			case 2: {
				manageAnimal(staff, manage);
				continue;
			}
			case 0: {
				System.out.println("이전으로 돌아갑니다.");
				break;
			}
			default: {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}
			break;
		}
	}

	public void jobinfo(Staff[] staff) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("=======1.직원 확인========");
			System.out.println(" 1.조련사 | 2.경영 | 0.이전  ");
			System.out.println("========================");
			int input = scan.nextInt();
			switch (input) {
			case 1: {
				for (int i = 0; i < staff.length; i++) {
					if (staff[i].getJob().equals("조련사")) {
						System.out.println(staff[i].toString());
					}
				}
				continue;
			}
			case 2: {
				for (int i = 0; i < staff.length; i++) {
					if (staff[i].getJob().equals("경영")) {
						System.out.println(staff[i].toString());
					}
				}
				continue;
			}
			case 0: {
				System.out.println("이전으로 돌아갑니다.");
				break;
			}
			default: {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}
			break;
		}
	}

	public void manageAnimal(Staff[] staff, Manage[] manage) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("=====================2.담당 동물=====================");
			System.out.println(" 1.코끼리 | 2.토끼  | 3.사자  | 4.늑대  | 5.담당 없음 | 0.이전  ");
			System.out.println("===================================================");
			int input = scan.nextInt();
			switch (input) {
			case 1: {
				for (int i = 0; i < manage.length; i++) {
					if (manage[i].getAnimal().getSpecies().equals("코끼리")) {
						System.out.println(manage[i].toString());
						if (manage[i].getTrainer() == null)
							System.out.println("담당조련사가 없습니다. 배정해주세요!!!");
					}
				}
				continue;
			}
			case 2: {
				for (int i = 0; i < manage.length; i++) {
					if (manage[i].getAnimal().getSpecies().equals("토끼")) {
						System.out.println(manage[i].toString());
						if (manage[i].getTrainer() == null)
							System.out.println("담당조련사가 없습니다. 배정해주세요!!!");
					}
				}
				continue;
			}
			case 3: {
				for (int i = 0; i < manage.length; i++) {
					if (manage[i].getAnimal().getSpecies().equals("사자")) {
						System.out.println(manage[i].toString());
						if (manage[i].getTrainer() == null)
							System.out.println("담당조련사가 없습니다. 배정해주세요!!!");
					}
				}
				continue;
			}
			case 4: {
				for (int i = 0; i < manage.length; i++) {
					if (manage[i].getAnimal().getSpecies().equals("늑대")) {
						System.out.println(manage[i].toString());
						if (manage[i].getTrainer() == null)
							System.out.println("담당조련사가 없습니다. 배정해주세요!!!");
					}
				}
				continue;
			}
			case 5: {
				for (int i = 0; i < manage.length; i++) {
					if (manage[i].getTrainer() == null) {
						System.out.println(manage[i].getAnimal());
						System.out.println("담당조련사가 없습니다. 배정해주세요!!!");
					}
				}
				continue;
			}
			case 0: {
				System.out.println("이전으로 돌아갑니다.");
				break;
			}
			default: {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}
			break;
		}
	}

///////////////////////////////////////////////////////////////동물 입력

	public Animal[] inputAnimal(Animal[] arr) {
		Scanner scan = new Scanner(System.in);
		Animal[] animalInput = new Animal[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			animalInput[i] = arr[i];
		}
		System.out.println("================1.동물 입력===============");
		System.out.println(" 1.코끼리 | 2.토끼  | 3.사자  | 4.늑대 | 0.이전  ");
		System.out.println("========================================");
		int input = scan.nextInt();
		switch (input) {
		case 1: {
			animalInput[animalInput.length - 1] = new Elephent("코끼리", 0, 0);
			System.out.println("코끼리의 나이를 입력하세요");
			animalInput[animalInput.length - 1].setAge(scan.nextInt());
			System.out.println("코끼리의 무게를 입력하세요");
			animalInput[animalInput.length - 1].setWeight(scan.nextInt());

			System.out.println(animalInput[animalInput.length - 1].toString() + "등록완료");
			arr = animalInput;
			return arr;
		}
		case 2: {
			animalInput[animalInput.length - 1] = new Rabbit("토끼", 0, 0);
			System.out.println("토끼의 나이를 입력하세요");
			animalInput[animalInput.length - 1].setAge(scan.nextInt());
			System.out.println("토끼의 무게를 입력하세요");
			animalInput[animalInput.length - 1].setWeight(scan.nextInt());

			System.out.println(animalInput[animalInput.length - 1].toString() + "등록완료");
			arr = animalInput;
			return arr;
		}
		case 3: {
			animalInput[animalInput.length - 1] = new Lion("사자", 0, 0);
			System.out.println("사자의 나이를 입력하세요");
			animalInput[animalInput.length - 1].setAge(scan.nextInt());
			System.out.println("사자의 무게를 입력하세요");
			animalInput[animalInput.length - 1].setWeight(scan.nextInt());

			System.out.println(animalInput[animalInput.length - 1].toString() + "등록완료");
			arr = animalInput;
			return arr;
		}
		case 4: {
			animalInput[animalInput.length - 1] = new Wolf("늑대", 0, 0);
			System.out.println("늑대의 나이를 입력하세요");
			animalInput[animalInput.length - 1].setAge(scan.nextInt());
			System.out.println("늑대의 무게를 입력하세요");
			animalInput[animalInput.length - 1].setWeight(scan.nextInt());

			System.out.println(animalInput[animalInput.length - 1].toString() + "등록완료");
			arr = animalInput;
			return arr;
		}
		case 5: { // 새로 들어온 동물이 초식인지 육식인지는 확인할수 없지만 새로운 동물을 등록할 수는 있어짐.
			scan.nextLine();
			animalInput[animalInput.length - 1] = new Animal(null, 0, 0);
			System.out.println("새로 들어온 동물의 종을 입력하세요");
			animalInput[animalInput.length - 1].setSpecies(scan.nextLine());
			System.out.println("동물의 나이를 입력하세요");
			animalInput[animalInput.length - 1].setAge(scan.nextInt());
			System.out.println("동물의 무게를 입력하세요");
			animalInput[animalInput.length - 1].setWeight(scan.nextInt());

			System.out.println(animalInput[animalInput.length - 1].toString() + "등록완료");
			arr = animalInput;
			return arr;
		}
		case 0: {
			return arr;
		}
		default: {
			return arr;
		}
		}
	}

///////////////////////////////////////////////////////////////// 직원 입력
	public Staff[] inputStaff(Staff[] arr) {
		Scanner scan = new Scanner(System.in);
		Staff[] staffInput = new Staff[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			staffInput[i] = arr[i];
		}
		System.out.println("=======2.직원 입력========");
		System.out.println(" 1.조련사 | 2.경영  | 0.이전  ");
		System.out.println("========================");
		int input = scan.nextInt();
		scan.nextLine();
		switch (input) {
		case 1: {
			staffInput[staffInput.length - 1] = new Trainer(null, 0, "조련사");
			System.out.println("조련사의 이름을 입력하세요");
			staffInput[staffInput.length - 1].setName(scan.nextLine());
			System.out.println("조련사의 나이을 입력하세요");
			staffInput[staffInput.length - 1].setAge(scan.nextInt());

			System.out.println(staffInput[staffInput.length - 1].toString() + "등록완료");
			arr = staffInput;
			return arr;
		}
		case 2: {
			staffInput[staffInput.length - 1] = new Manager(null, 0, "경영");
			System.out.println("경영직원의 이름을 입력하세요");
			staffInput[staffInput.length - 1].setName(scan.nextLine());
			System.out.println("경영직원의 나이을 입력하세요");
			staffInput[staffInput.length - 1].setAge(scan.nextInt());

			System.out.println(staffInput[staffInput.length - 1].toString() + "등록완료");
			arr = staffInput;
			return arr;
		}
		case 0: {
			return arr;
		}
		default: {
			return arr;
		}
		}
	}

/////////////////////////////////////////////////////////////////////////////// 담당 입력
	public Manage[] inputManage(Animal[] animal, Staff[] staff, Manage[] manage) {
		Scanner scan = new Scanner(System.in);
		Manage[] manageInput = new Manage[manage.length + 1];
		for (int i = 0; i < manage.length; i++) {
			manageInput[i] = manage[i];
		}
		manageInput[manageInput.length - 1] = new Manage();

		System.out.println("================5.담당 입력================");
		for (int i = 0; i < manage.length; i++) {
			if (manage[i].getTrainer() == null) {
				System.out.println(manage[i].getAnimal());
				System.out.println("담당조련사가 없습니다. 배정해주세요.");
			}
		}
		for (int i = 0; i < staff.length; i++) {
			System.out.println(i + 1 + "번" + staff[i].toString());
		}
		System.out.println("동물을 담당해줄 직원의 번호를 입력하세요.");
		int numStaff = scan.nextInt();
		if (!staff[numStaff - 1].getJob().equals("조련사")) {
			System.out.println("해당 직원은 조련사가 아닙니다.");
		} else {
			for(int i = 0; i < animal.length; i++) {
				System.out.println(i + 1 + "번" + animal[i].toString());
			}
			System.out.println("동물의 번호를 입력하세요.");
			int numAnimal = scan.nextInt();
			if (manage[numAnimal - 1].getTrainer() != null) {
				System.out.println("담당직원이 있는 동물입니다.");
			} else {
				manageInput[manageInput.length - 1].setTrainer(staff[numStaff - 1]);
				manageInput[manageInput.length - 1].setAnimal(animal[numAnimal - 1]);
			}
		}
		manage = manageInput;
		return manage;
	}
}
