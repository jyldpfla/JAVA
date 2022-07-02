package Group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

public class ResultPage extends JFrame {
	// 6/30 : 넘겨받는 배열 타입에 따라 메소드 전반적 변경
	// 6/31 : 보너스 번호 추첨, 등수 출력, 버튼 마우스오버창
	// 지금 할 일 : 1.금액 출력 메소드 만들기
	//			2. 같으면 번호 색 변경 메소드 만들기

	Random random = new Random();
	// 중복 없는 당첨번호 set
	Set<Integer> lotto = new HashSet<>();
	// 선택값을 1 개의 array로 받았을 경우
	int[] a = new int[6];
	// List와 비교하기 위해 타입 Integer로 통일
	Integer[] b = new Integer[6];
	// 로또개수만큼 담긴 로또값 들어간 배열 넘겨받기 위한 배열
	List<List<Integer>> buyLottoNum = new ArrayList<>();
	// 로또값 들어간 배열부터 받기
	List<Integer> buyLottoNum1;
	// set 정렬을 위해 List로 옮기기 위해 생성
	List<Integer> list;
	// 같음, 다름 넣을 배열
	String[] same;
	// 같음, 다름 배열 넣은 걸 넣을 배열
	String[][] same1 = new String[5][];
	// 보너스 값 출력 위한 변수
	int bonus = 0;
	// 등수 출력 위한 배열
	String[] ranking = new String[5];
	// 전체 판매액 담을 정수 타입
	int totalMoney = 300000000;
	// 총 당첨 금액 담을 정수 타입
	int winningTotal = 0;
	///////////////연습 값 담을  set/////////////////////////
	Set<Integer> practice = new HashSet<>();
	///////////////연습 값 담을  set end/////////////////////////

	private JPanel pnl;
	private JButton btn;

	public JPanel getPnl() {
		return pnl;
	}

	public JButton getNextBtn() {
		return btn;
	}

	// Result 화면 생성
	;

	public ResultPage() {
		getNumber(lotto, bonus);
		getNumber3();

//		getNumberPractice();
		comparingList();
		comparingBonus();
		rank();
		getMoney();
		
		
		pnl = new JPanel();
		JPanel pnlA = new JPanel();
		pnlA.setBounds(0, 0, 784, 138);
		JLabel lbl1 = new JLabel("당첨 번호");
		JPanel pnlB = new JPanel();
		pnlB.setBounds(0, 138, 784, 138);
		JLabel lbl2 = new JLabel("일치 여부");
		JPanel pnlC = new JPanel();
		pnlC.setBounds(0, 276, 784, 138);
		JLabel lbl3 = new JLabel("추첨 번호");
		

		pnlA.add(lbl1);
		pnlB.add(lbl2);
		pnlC.add(lbl3);
		pnl.setLayout(null);
		pnl.add(pnlA);
		for (int i = 0; i < lotto.size(); i++) {
			JLabel lottoA = new JLabel(String.valueOf(list.get(i)));
			pnlA.add(lottoA);
		}
		
		JLabel lbl4 = new JLabel("보너스 번호");
		pnlA.add(lbl4);
		JLabel lbl5 = new JLabel(Integer.toString(bonus));
		pnlA.add(lbl5);
		

		pnl.add(pnlB);
		for (int j = 0; j < same1.length; j++) {
			for (int i = 0; i < same.length; i++) {
				JLabel same2 = new JLabel(same1[j][i]);
				pnlB.add(same2);
			}
		}

		pnl.add(pnlC);
//		for(int i = 0; i < a.length; i++) {
		JLabel lottoB = new JLabel(buyLottoNum.toString());
		pnlC.add(lottoB);
//		}
		JLabel lottoResultL = new JLabel("당첨 여부");
		pnlC.add(lottoResultL);
		JLabel lottoResult = new JLabel(Arrays.toString(ranking));
		pnlC.add(lottoResult);
		lbl3.setBounds(0, 0, 65, 40);

		JLabel price = new JLabel("금액 = 300,000,000원");
		price.setBounds(78, 424, 315, 24);
		price.setFont(new Font("굴림", Font.PLAIN, 20));
		btn = new JButton("다음 회차");
		btn.setBounds(550, 424, 222, 23);

		pnl.setBackground(new Color(248, 202, 204));
		pnl.add(price);
		pnl.add(btn);

		pnlA.setOpaque(false); // 배경 색을 따라가도록
		pnlB.setOpaque(false);
		pnlC.setOpaque(false);
		getContentPane().add(pnl);

		setSize(800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// 당첨번호 만드는 메소드 메소드로 만들기
	public void getNumber(Set<Integer> set, int i) {
		// set일 때(중복 값 지우기)
		while (set.size() < 6) {
			Random random = new Random();
			int r = random.nextInt(45) + 1;
			if (r != 0) {
				set.add(r);
			}
		}
		// 리스트로 변환 후 정렬
		list = new ArrayList<>(lotto);
		Collections.sort(list);
		System.out.println("당첨 번호: " + list);
		

		// 보너스 값 출력
		i = random.nextInt(45) + 1;
		while(set.contains(i)) {
			i = random.nextInt(45) + 1;
		} 
		bonus = i;
		System.out.println("보너스 값: " + i);
	}

	///////////////////////////// 내가 고른 번호 만드는 메소드 (배열 예시)/////////////////////////////////////////////
	public void getNumber2(int[] a) {
		// 배열일 때
		for (int i = 0; i <= 5; i++) {
			a[i] = random.nextInt(45) + 1;
		}

		Arrays.sort(a);
	}
	///////////////////////////// 내가 고른 번호 만드는 메소드 end /////////////////////////////////////////////
	
	
	// 다시 켜야돼!!
	// list 배열에 6개의 값 담기
	public void getNumber3() {
		for (int j = 0; j < 5; j++) {
			buyLottoNum1 = new ArrayList<>();
			for (int i = 0; i <= 5; i++) {
				buyLottoNum1.add(random.nextInt(45) + 1);
				Collections.sort(buyLottoNum1);
			}

//			System.out.println(buyLottoNum1);
			// 이중배열에 list배열 담기
			buyLottoNum.add(buyLottoNum1);
//			System.out.println(buyLottoNum);
		}
	}
	
//	///////////////////////// 연습 list 배열에 6개의 값 담기 /////////////////////////
//	public void getNumberPractice() {
//		for (int j = 0; j < 4; j++) {
//			buyLottoNum1 = new ArrayList<>();
//			for (int i = 0; i <= 5; i++) {
//				buyLottoNum1.add(random.nextInt(45) + 1);
//				Collections.sort(buyLottoNum1);
//			}
//
////			System.out.println(buyLottoNum1);
//			// 이중배열에 list배열 담기
//			buyLottoNum.add(buyLottoNum1);
////			System.out.println(buyLottoNum);
//		}
//		buyLottoNum.add(list);
//		System.out.println("연습할 이중 배열 출력" + buyLottoNum);
//	}
//	///////////////////////// 연습 list 배열에 6개의 값 담기 end/////////////////////////

	// 이중리스트배열과 리스트 비교
	public void comparingList() {
		// 내가 선택한 번호 출력
		System.out.println("내가 선택한 번호: " + buyLottoNum);

		int count = 0;

		// 변수 설정
		Integer a = 0;
		Integer b = 0;

		for (int j = 0; j < buyLottoNum.size(); j++) {
			same = new String[buyLottoNum1.size()];
			for (int i = 0; i < buyLottoNum1.size(); i++) {
				a = buyLottoNum.get(j).get(i);
				for (int k = 0; k < list.size(); k++) {
					b = list.get(k);
					if (a.equals(b)) {
						count = 0; // count 값 이해하기
//						System.out.println("같음");
						same[i] = "같음";
					} else {
						count++;
					}
					if (count == 6) {
//						System.out.println("다름");
						same[i] = "다름";
						count = 0;
					}
				}
			}
			same1[j] = same;
		}
		comparingBonus();
		System.out.println("당첨 번호 추첨: " + Arrays.deepToString(same1));
	}
	
	// 보너스 번호 비교 메소드
	public void comparingBonus() {
		for(int a = 0; a < buyLottoNum.size(); a++) {
			if(buyLottoNum.get(a).contains(bonus)) {
				int b = buyLottoNum.get(a).indexOf(bonus);
				same1[a][b] = "보너스 번호 당첨!";
			} 
		}
	} 
	
	// 등수 추첨 메소드
	public void rank() {
		int countD = 0; // 다름 개수 체크
		int countB = 0; // 보너스 번호 당첨 여부
		for(int j = 0; j < same1.length; j++) {
			for(int i = 0; i < same.length; i++) {
				if(same1[j][i].equals("다름")) {
					countD++;
				}  else if(same1[j][i].equals("보너스 번호 당첨!")) {
					countB++;
				}
			}
			System.out.println((j + 1) + "번째 추첨 다름 갯수: " + countD);
			System.out.println((j + 1) + "번째 추첨 보너스번호 당첨 여부(1-당첨, 0-당첨 x): " + countB);
			for(int i = 0; i < ranking.length; i++) {
				switch(countD) {
				case 0 : 
					if(countB == 0) { // 같음이 6개라면
						  ranking[i] = "1등";
						  System.out.println(ranking);
					} else {
						 ranking[i] = "2등";
					}
					break;
				case 1 :
					 ranking[i] = "3등";
					break;
				case 2 :
					 ranking[i] = "4등";
					break;
				case 3 :
					 ranking[i] = "5등";
					break;
				default :
					 ranking[i] = "낙첨";
					break;
				}
			}
			countD = 0;
			countB = 0;
		}
		System.out.println("당첨 여부: " + Arrays.toString(ranking));
	}

	// 금액 출력 메소드
	public void getMoney() {
		int winningMoney;
		for(int i = 0; i < buyLottoNum.size(); i++) {
			switch(ranking[i]) {
			case "4등" :
				winningMoney = totalMoney - 50000;
				System.out.println("당첨 금액: " + winningMoney);
				totalMoney -= winningMoney;
				winningTotal += winningMoney;
				break;
			case "5등" :
				winningMoney = totalMoney - 5000;
				System.out.println("당첨 금액: " + winningMoney);
				totalMoney -= winningMoney;
				winningTotal += winningMoney;
				break;
			case "1등" :
				winningMoney = (totalMoney - winningTotal) / 75; 
				System.out.println("당첨 금액: " + winningMoney);
			default :
				winningMoney = 0;
				System.out.println("당첨 금액: " + winningMoney);
			}
			System.out.println("총 금액 : " + totalMoney);
		}
		System.out.println("총 금액 : " + totalMoney);
		System.out.println("현재 당첨  금액: " + winningTotal);
	}
	

	/////////////////////////////// 배열과 set 비교 (배열 예시)/////////////////////////////////////////
	public void comparing(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i <= 5; i++) {
			for (Object o : lotto) {
				if (b[i] == o) {
					System.out.println(b[i]);
					// 같음이 나오면 배열 "같음"
					same[i] = "같음";
					System.out.println(same[i]);
				} else {
					count++;
				}
				if (count == 6) {
					// 다름이 나오면 배열 "다름"
					same[i] = "다름";
					System.out.println(same[i]);
					count = 0;
				}
			}

		}
	}
	/////////////////////////////// 배열과 set 비교 (배열 예시) end/////////////////////////////////////////

	public static void main(String[] args) {
//		ResultPage re = new ResultPage().setVisible(true);
		new ResultPage().setVisible(true);
//		re.getNumber(re.lotto);
//		re.getNumber2(re.a);

		// a 배열 String으로 출력
//		System.out.println(Arrays.toString(re.a));
		// a와 lotto 배열 비교
//		re.comparing(re.a);
	}
}

