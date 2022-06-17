import java.util.Scanner;
import java.util.Set;
import java.security.KeyStore.Entry;
import java.util.HashMap;

public class Zoomanager {
	Scanner sc = new Scanner(System.in); // 값을 입력 받기 위하여 Scanner 사용
	Animal[] animals = new Animal[10];
	Worker[] workers = new Worker[10];
	HashMap<String, String> animal_worker = new HashMap<String, String>(); //key와 value의 타입이 string인 해시맵 선언
	
	int selectNumber = 0; // 여러개의 선택지에서 사용됨.
	int count_animal = 0; // 신규 동물 한 마리씩 등록 될 때마다 ++; 할 예정
	int count_worker = 0; // 신규 직원 한 명씩 등록 될 때마다 ++;할 예정

	public Zoomanager() {
		run();
	}

	public void run() {
		while (true) {

			
			System.out.println("                                                  ");
			System.out.println("=====================목록=========================");
			System.out.println("1. 신규 동물 등록");
			System.out.println("2. 신규 직원 등록");
			System.out.println("3. 현재 등록된 동물 목록 보기");
			System.out.println("4. 초식 / 육식 분류해서 보기");
			System.out.println("5. 동물 사망 신고");
			System.out.println("6. 직원 해고");
			System.out.println("7. 종료");
			System.out.println("=================================================");
			System.out.println("                                                  ");
			
			selectNumber = Integer.parseInt(getData("번호 입력 : "));

			System.out.println();

			if (selectNumber == 1) {
				registerAnimal(); // 동물 등록하는 함수로 이동
			} else if (selectNumber == 2) {
				registerWorker(); // 직원 등록 할 수 있는 함수로 이동
			} else if (selectNumber == 3) {
				animalList(); //  등록된 동물 보기
			} else if (selectNumber == 4) {
				herb_meat(); //  초식/ 육식에 따른 분류
			}
			else if (selectNumber == 5) {
				dieAnimal(); // 동물 사망 신고
			}
			else if (selectNumber == 6) {
					fireWorker();  //직원 해고
			}
			 else if (selectNumber == 7) {
				System.out.println("\n <동물 관리 프로그램을 종료합니다.>");
				break;
			} else {
				System.out.println("<범위에 없는 목록 번호를 입력하셨습니다.>");
				System.out.println("<다시 입력해주세요.>");
			}
		}
	}

	private void fireWorker() {
		int temp = 0; // 해고할 직원의 정보가 위치해있는 인덱스를 잠시 저장할 변수 temp 선언
		String firePerson = getData("누구를 해고하시겠습니까?");
		
		  Set<java.util.Map.Entry<String,String>> entrySet = animal_worker.entrySet();  // 입력한 조련사의 담당 동물을 찾기 위한 과정 
		  
		  for (java.util.Map.Entry<String, String> entry : entrySet) {           
			  if (entry.getValue().equals(firePerson)) {             
				animal_worker.replace("entry.getKey()", "배정된 조련사가 없음.");  
			  }
		  }
		  
		  for(int i = 0 ; i < 10; i++) {  // for문을 통해서 
			  if(workers[i] != null) {
				  if(workers[i].getName().equals(firePerson)) { //만약 어떠한 직원의 이름이 해고할 직원의 이름과 같다면
					  temp = i; // 해고할 직원의 인덱스를 temp변수에 임시저장
					  workers[i] = null; // 그 직원의 정보에 null값을 넣어 삭제
				  }
			  }
		  }
		  
		  for(int j = temp ; j < 8; j++) { // 해고할 직원 뒤에 있는 직원들을 한 칸 씩 땡김
				animals[j] = animals[j + 1];
				animals[j + 1] = null;
			}
		
		
	}

	private void dieAnimal() {
		int temp = 0;
		String deadAnimal = getData("어떤 동물이 죽어버렸습니까?");
		
		for(int i = 0 ; i < 10; i++) {
			if( animals[i].getSpecies().equals(deadAnimal)) {
				temp = i;
				animal_worker.remove(animals[i].getSpecies());
				animals[i] = null;
				break;
			}
		}
		
		for(int j = temp ; j < 8; j++) { //원래 {호랑이, 사자, 사슴, 치타, null ' ' '}  -> 호랑이가 죽었으므로 {null, 사자 , 사슴, 치타, ' ' '}
			animals[j] = animals[j + 1]; // 새로운 동물 등록시 0번째 인덱스부터 null값인 부분에다
										 // 저장을 하므로 0번 인덱스가 null이므로 0번에 새로운 신규 동물이 등록된다.
			
			animals[j + 1] = null;       // 이것을 방지하고자 한 칸 씩 앞으로 당김 {사자 , 사슴, 치타, null ' ' '}
		}
		
		
		for(int i = 0; i < 10; i++) {
			if(animals[i] != null && animal_worker.get(animals[i].getSpecies()).equals("배정된 조련사가 없음.")) {
				for(int j = 0; j < 10 ; j++) {
					if (workers[j] != null && !animal_worker.containsValue(workers[j].getName())) {
						animal_worker.put(animals[i].getSpecies(), workers[j].getName());
					}
				}
			}
		}
		
	
		
	}

	private void herb_meat() {
		System.out.println("---------------");
		System.out.println("1.초식 | 2.육식 ");
		System.out.println("---------------");
		
		selectNumber = Integer.parseInt(getData("< 보고싶은 번호 입력 >"));
		
		if(selectNumber == 1) {
			for(int i = 0; i < 10; i++) {
				if (animals[i] != null && animals[i].getMainMeal().equals("초식")) {
					System.out.println(animals[i].getSpecies());
				}
			}
		}else if( selectNumber == 2) {
			for(int i = 0; i < 10; i++) {
				if (animals[i] != null && animals[i].getMainMeal().equals("육식")) {
					System.out.println(animals[i].getSpecies());
				}
			}
		}
	}

	private void animalList() {
		System.out.println("                                                  ");
		System.out.println("=================================================");
		System.out.println("                  동물목록");
		System.out.println("품종\t나이\t몸무게(kg)\t주식\t조련사");
		System.out.println("=================================================");
		
		for(int i = 0; i < 10; i++) {
			if (animals[i] != null) {
				for(int j = 0; j < 10; j++) {
					if(workers[j] != null && workers[j].getRole().equals("조련사") && !animal_worker.containsValue(workers[j].getName())) {
						animal_worker.put(animals[i].getSpecies(), workers[j].getName());
						break;
					}
				else animal_worker.put(animals[i].getSpecies(), "배정된 조련사가 없음.");
				
			}	
			
		}
			
			
			
		}
		for (int i = 0; i < 10; i++) {
			if (animals[i] != null) {
				System.out.print(animals[i].PrintAll() + "  \t   " + animal_worker.get(animals[i].getSpecies())); // 그 회원의 이름, 키, 몸무게, bmi지수, bmi결과 를 출력
				System.out.println();
			}
		} 

		System.out.println("=================================================");
		System.out.println("1.목록   2.프로그램 종료"); 

		selectNumber = Integer.parseInt(getData("번호입력 : "));

		if (selectNumber == 2) {
			System.out.println("프로그램을 종료합니다.");
		}

	}

	private void registerWorker() {
		boolean a = true;
		while (a) {
			// 위에 count가 0부터 시작했으므로
			String role = getData((count_worker + 1) + "번째 신규 직원의 역할을 입력해주세요");
			String name = getData((count_worker + 1) + "번째 신규 직원의 이름을 입력해주세요");

			for (int i = 0; i < 10; i++) {
				if (workers[i] == null) {
					workers[i] = new Worker(role, name); 
					count_worker++; 
					break;
				}
			}

			System.out.println("< " + count_worker + "명 등록완료" + "                        " + (10 - count_worker)
					+ " 명 남았습니다.(최대 10명) >");
			int b = Integer.parseInt(getData("1. 추가 등록      2. 등록 종료"));
			if (b == 2) {
				break;
			}

		}
	}

	private void registerAnimal() {

		boolean a = true;
		while (a) {
		
			String species = getData((count_animal + 1) + "번째 신규 동물의 품종을 입력해주세요");
			int age = Integer.parseInt(getData((count_animal + 1) + "번째 신규 동물의 나이를 입력해주세요"));
			int weight = Integer.parseInt(getData((count_animal + 1) + "번째 신규 동물의 몸무게를 입력해주세요"));
			String mainMeal = getData((count_animal + 1) + "번째 신규 동물의 주식을 입력해주세요");

			for (int i = 0; i < 10; i++) {
				if (animals[i] == null) { 
					animals[i] = new Animal(species, age, weight, mainMeal);
					count_animal++; 
					break;
					
				}
			}
			System.out.println("< " + count_animal + "마리 등록완료" + "                        " + (10 - count_animal)
					+ " 마리 남았습니다.(최대 10마리) >");

			int b = Integer.parseInt(getData("1. 추가 등록      2. 등록 종료"));
			if (b == 2) {
				break;
			}

		}

	}

	private String getData(String Message) {
		System.out.println(Message);
		return sc.next();
	}

	public static void main(String[] args) {
		new Zoomanager();
	}

}