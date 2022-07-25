package �Լ��Ŷ�;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ToolTipManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;

public class ResultPage {
	// 6/30 : �Ѱܹ޴� �迭 Ÿ�Կ� ���� �޼ҵ� ������ ����
	// 6/31 : ���ʽ� ��ȣ ��÷, ��� ���, ��ư ���콺����â
	// 7/1 : ����, �ٸ� ���� �޼ҵ� ����
	// 7/2 : ��� ��� �޼ҵ� �ϼ�, ������ ����
	// 7/4 : ��÷ �ݾ� �޼ҵ� �ϼ�
	// ����
	// 1. ���ư� �� ����� ���� �ζ� �迭�� ��÷��ȣ ����
	// 2. ������ ��ȣ �� ���� �޼ҵ� �����

	// Random �ν��Ͻ� ����
	Random random = new Random();
	// �ζ� ��÷ ��ȣ
	List<Integer> lottoNum;
	// �� ���� �ζǰ� �� �迭
	List<Integer> buyLottoNum;
	// �� ���� �ζǰ� �� �迭�� �޴� ArrayList
	List<List<Integer>> buyLottoNumList = new ArrayList<>();

	// �ζ� ���ʽ� ��
	int lottoBonus = 0;

	// ����, �ٸ� ���� �ִ� �迭
	List<String> same;
	// ����, �ٸ� �迭�� �޴� String �迭
	List<List<String>> sameList;

	// ��� ��� ���� �迭
	List<String> ranking;
	// ��ü �Ǹž� ���� ���� Ÿ��
	int totalMoney;
	// �� ��÷ �ݾ� ���� ���� Ÿ��
	int winningTotal = 0;
	/////////////// ���� �� ���� set/////////////////////////
	Set<Integer> practice = new HashSet<>();
	/////////////// ���� �� ���� set end/////////////////////////

	JLabel[][] lotto = new JLabel[5][8];

	private JPanel pnl;
	private JButton nextBtn;

	public List<List<Integer>> getBuyLottoNumList() {
		return buyLottoNumList;
	}

	// setter, getter

	public void setBuyLottoNumList(List<List<Integer>> buyLottoNumList) {
		this.buyLottoNumList = buyLottoNumList;
	}

	public int getLottoBonus() {
		return lottoBonus;
	}

	public void setLottoBonus(int lottoBonus) {
		this.lottoBonus = lottoBonus;
	}
	
	public List<Integer> getLottoNums() {
		return lottoNum;
	}
	public void setLottoNum(List<Integer> lottoNum) {
		this.lottoNum = lottoNum;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}

	public JPanel getPnl() {
		return pnl;
	}

	public JButton getNextBtn() {
		return nextBtn;
	}

	// Result ȭ�� ����
	public ResultPage() {
//		getLottoNum();
	}
	// setter, getter ��

	public void setPanel() {
		// �̹��� �޾ƿ���
		Toolkit kit = Toolkit.getDefaultToolkit();
		URL url = ResultPage.class.getClassLoader().getResource("images/critical.png");
		ImageIcon image = new ImageIcon(kit.getImage(url).getScaledInstance(20, 20, Image.SCALE_SMOOTH));

		URL backgroundUrl = ResultPage.class.getClassLoader().getResource("images/background3.png");
		Image background = new ImageIcon(backgroundUrl).getImage();

		URL plusP = ResultPage.class.getClassLoader().getResource("images/plus.png");
		ImageIcon plus = new ImageIcon(kit.getImage(plusP));

		URL ball7 = ResultPage.class.getClassLoader().getResource("images/ballB.png");
		ImageIcon ballB = new ImageIcon(kit.getImage(ball7).getScaledInstance(70, 70, Image.SCALE_SMOOTH));
		
		URL backCard = ResultPage.class.getClassLoader().getResource("images/card_back.png");
		ImageIcon cardBack = new ImageIcon(kit.getImage(backCard));
		
		URL bombUrl = ResultPage.class.getClassLoader().getResource("images/bombbomb.png");
		ImageIcon bombB = new ImageIcon(kit.getImage(bombUrl).getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		
		URL elephantUrl = ResultPage.class.getClassLoader().getResource("images/elephant.png");
		ImageIcon elephantE = new ImageIcon(kit.getImage(elephantUrl).getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		
		// �̹��� �޾ƿ��� ��

		// pnlLottoNums ����
		JPanel pnlLottoNums = new JPanel();
		JLabel lblLottoNums = new JLabel("��÷      ");
		lblLottoNums.setFont(new Font("����", Font.BOLD, 20));
		lblLottoNums.setForeground(Color.WHITE);
		pnlLottoNums.add(lblLottoNums);

		URL[] urlAll = new URL[6];
		JLabel showLottoNum[] = new JLabel[6];
		for (int i = 0; i < urlAll.length; i++) {

			urlAll[i] = ResultPage.class.getClassLoader().getResource("images/ball" + (i + 1) + ".png");
			ImageIcon imageIcon = new ImageIcon(kit.getImage(urlAll[i]).getScaledInstance(70, 70, Image.SCALE_SMOOTH));
			showLottoNum[i] = new JLabel((ImageIcon) imageIcon);
			showLottoNum[i].setText(String.valueOf(lottoNum.get(i)));
			showLottoNum[i].setHorizontalTextPosition(JLabel.CENTER);
			showLottoNum[i].setForeground(Color.white);
			showLottoNum[i].setFont(new Font("Serif", Font.BOLD, 25));
			pnlLottoNums.add(showLottoNum[i]);
		}

		JLabel lblPlus = new JLabel(plus);
		pnlLottoNums.add(lblPlus);

		JLabel lblBonusNum = new JLabel(ballB);
		lblBonusNum.setText(String.valueOf(lottoBonus));
		lblBonusNum.setHorizontalTextPosition(JLabel.CENTER);
		lblBonusNum.setForeground(Color.white);
		lblBonusNum.setFont(new Font("Serif", Font.BOLD, 25));
		pnlLottoNums.add(lblBonusNum);

		pnlLottoNums.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
		// pnlLottoNums ��
		
		//underLottoNum
		JPanel underLottoNum = new JPanel();
		
		// pnlImg
		JPanel pnlImg = new JPanel();
		SpringLayout sl_pnlImg = new SpringLayout();
		pnlImg.setLayout(sl_pnlImg);
		

	
		
		pnlImg.setPreferredSize(new Dimension(400, 400));
		
		// pnlImg ��
		
		// pnlLottoResult
		JPanel pnlLottoResult = new JPanel(); // lblLottoNums�� ������ ���� ���� �г�

		// printResultAll
		JPanel printResultAll = new JPanel();

		makefield(lotto);
		// printResult
		JPanel printResult = new JPanel();
		for (int i = 0; i < 5; i++) {
			JPanel a = new JPanel();
			printResult.add(a);
			a.setOpaque(false);
			for (int j = 0; j < 7; j++) {
				a.add(lotto[i][j]);
			}
		}
		// printResult ��

		BoxLayout result = new BoxLayout(printResult, BoxLayout.Y_AXIS);
		printResult.setLayout(result);

		// printResultSame
		JPanel printResultSame = new JPanel();
		for (int k = 0; k < buyLottoNumList.size(); k++) {
			JPanel a = new JPanel();
			a.setBorder(BorderFactory.createEmptyBorder(30, 10, 10, 10)); // �����¿� 10�� ����
			a.setOpaque(false);
			printResultSame.add(a);
			a.add(lotto[k][7]);
		}
		// printResultSame ��

		BoxLayout resultSame = new BoxLayout(printResultSame, BoxLayout.Y_AXIS);
		printResultSame.setLayout(resultSame);

		printResultAll.add(printResult);
		printResultAll.add(printResultSame);
		// printResultAll ��

		// pnlBuyNums
		for (int i = 0; i < buyLottoNumList.size(); i++) {
			for (int j = 1; j < buyLottoNumList.get(0).size() + 1; j++) {
				lotto[i][j].setText(String.valueOf(buyLottoNumList.get(i).get(j - 1)));
				lotto[i][j].setForeground(Color.white);

				lotto[i][j].setHorizontalTextPosition(JLabel.CENTER);
			}
		}
		// pnlBuyNums ��

		// others (��÷��ȣ, �� ���ù�ȣ ���� �ΰ����� �͵�)
		JPanel others = new JPanel();

		JLabel info = new JLabel(image);
		info.setToolTipText("<html><p>"
				+ "��÷�� �й� ��� <br> [1��] 6�� ��ȣ ��ġ : �� ��÷�� �� 4��, 5�� �ݾ��� ������ �ݾ��� 75% <br> [2��] 5�� ��ȣ ��ġ + ���ʽ� ��ȣ ��ġ : �� ��÷�� �� 4��, 5�� �ݾ��� ������ �ݾ��� 12.5% <br> [3��] 5�� ��ȣ ��ġ : �� ��÷�� �� 4��, 5�� �ݾ��� ������ �ݾ��� 12.5% <br> [4��] 4�� ��ȣ ��ġ : 50,000�� <br> [5��] 3�� ��ȣ ��ġ: 5,000�� "
				+ "</p></html>");
		ToolTipManager m = ToolTipManager.sharedInstance(); // ���� ���� �ð� ���� ���� ��ü ����
		m.setInitialDelay(0); // �ʱ� ���� ��� �����ð� 0�� ����
		JLabel winningPrice = new JLabel("��÷�� ���ɾ�: " + String.valueOf(winningTotal)+"   ");
		JLabel price = new JLabel("��÷ �� �ݾ�: " + String.valueOf(totalMoney / 2));
		nextBtn = new MyEmphasizeButton("���� ȸ��");

		others.add(info);
		others.add(winningPrice);
		others.add(price);
		others.add(nextBtn);
		// others ��

		pnlLottoResult.add(printResultAll);
		pnlLottoResult.add(others);
		// pnlLottoResult ��
		
		underLottoNum.add(pnlImg);
		underLottoNum.add(pnlLottoResult);
		//underLottoNum ��

		BoxLayout underLottoNumsY = new BoxLayout(pnlLottoResult, BoxLayout.Y_AXIS);
		pnlLottoResult.setLayout(underLottoNumsY);

		// pnl ��ü ���� �г�
		pnl = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(background, 0, 0, null);
				setOpaque(false);
			}
		};
		pnl.add(pnlLottoNums);
		pnl.add(underLottoNum);
		// pnl ��

		BoxLayout pnlY = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(pnlY);

		// ������
		pnl.setOpaque(false);
		pnlLottoNums.setOpaque(false); // ��� ���� ���󰡵���
		pnlImg.setOpaque(false);
		JLabel elephant = new JLabel(elephantE);
		sl_pnlImg.putConstraint(SpringLayout.WEST, elephant, -289, SpringLayout.EAST, pnlImg);
		sl_pnlImg.putConstraint(SpringLayout.EAST, elephant, -10, SpringLayout.EAST, pnlImg);
		pnlImg.add(elephant);
		underLottoNum.setOpaque(false);
		pnlLottoResult.setOpaque(false);
		printResult.setOpaque(false);
		printResultAll.setOpaque(false);
		printResultSame.setOpaque(false);
		others.setOpaque(false);
		winningPrice.setFont(new Font("����", Font.BOLD, 14));
		price.setFont(new Font("����", Font.BOLD, 14));
		lblLottoNums.setFont(new Font("����", Font.BOLD, 20));

		// ������ ��

		changeColor(lotto);
	}

	// J�� 35�� ����� �޼ҵ�
	public void makefield(JLabel[][] lotto) {
		Font cardFont = new Font("Serif", Font.BOLD, 25);
		Toolkit kit = Toolkit.getDefaultToolkit();
		URL cardS = ResultPage.class.getClassLoader().getResource("images/card_spade.png");
		URL cardH = ResultPage.class.getClassLoader().getResource("images/card_heart.png");
		URL cardC = ResultPage.class.getClassLoader().getResource("images/card_clover.png");
		URL cardD = ResultPage.class.getClassLoader().getResource("images/card_diamond.png");

		ImageIcon cardSpade = new ImageIcon(kit.getImage(cardS));
		ImageIcon cardHeart = new ImageIcon(kit.getImage(cardH));
		ImageIcon cardClover = new ImageIcon(kit.getImage(cardC));
		ImageIcon cardDiamond = new ImageIcon(kit.getImage(cardD));

		for (int i = 0; i < 5; i++) {
			lotto[i][0] = new JLabel(String.valueOf(i + 1));
			for (int j = 1; j < 7; j++) {
				lotto[0][j] = new JLabel(cardSpade); // 0*6
				lotto[0][j].setFont(cardFont);
				lotto[1][j] = new JLabel(cardHeart); // 0*6
				lotto[1][j].setFont(cardFont);
				lotto[2][j] = new JLabel(cardClover); // 0*6
				lotto[2][j].setFont(cardFont);
				lotto[3][j] = new JLabel(cardDiamond); // 0*6
				lotto[3][j].setFont(cardFont);
				lotto[4][j] = new JLabel(cardSpade); // 0*6
				lotto[4][j].setFont(cardFont);
			}
		}
		for (int i = 0; i < buyLottoNumList.size(); i++) {
			lotto[i][7] = new JLabel(ranking.get(i));
		}
	}

	// ī���г� �� ���� �޼ҵ�
	public void changeColor(JLabel[][] lotto) {
		Font cardFontnone = new Font("Serif", Font.BOLD, 15);
		for (int i = 0; i < sameList.size(); i++) {
			for (int j = 0; j < sameList.get(i).size(); j++) {
				if (sameList.get(i).get(j).equals("�ٸ�")) {
					lotto[i][j + 1].setForeground(Color.gray);
					lotto[i][j + 1].setFont(cardFontnone);
				} else if (sameList.get(i).get(j).equals("���ʽ� ��ȣ ��÷!")) {
					lotto[i][j + 1].setForeground(new Color(221, 168, 81));
				}
			}
		}
	}

	// ��÷��ȣ ����� �޼ҵ�
	public void getLottoNum() {
		// �ζ� ��÷ ��ȣ(�ߺ�x) ��� Set
		Set<Integer> lotto = new HashSet<>();
		while (lotto.size() < 6) {
			Random random = new Random();
			// �ζ� ��ȣ 1�� �޴� ���� ��ȣ ����
			int lottoRandom = random.nextInt(45) + 1;
			if (lottoRandom != 0) {
				lotto.add(lottoRandom);
			}
		}

		// ����Ʈ�� ��ȯ �� ����
		lottoNum = new ArrayList<>(lotto);
		Collections.sort(lottoNum);
		System.out.println("��÷ ��ȣ: " + lottoNum);

		// ���ʽ� �� ���
		lottoBonus = random.nextInt(45) + 1;
		while (lotto.contains(lottoBonus)) {
			lottoBonus = random.nextInt(45) + 1;
		}
		System.out.println("���ʽ� ��: " + lottoBonus);
		System.out.println("LottoNum�� ����?" + lottoNum);
//		getBuyLottoNum();
//		getNumberPractice();
		compareLottoNum();
	}
///////////////////////////// ���� list �迭�� 6���� �� ��� /////////////////////////
	// ���� ������ �ζ� 5ȸ(5000��) ���ϴ� �޼ҵ�
	public void getBuyLottoNum() {
		for (int j = 0; j < 4; j++) {
			buyLottoNum = new ArrayList<>();
			// ���� ������ �ζ� 1ȸ(1000��) 6�ڸ� �� ���ϴ� �޼ҵ�
			for (int i = 0; i <= 5; i++) { // 6�� ������ ���� ����
				buyLottoNum.add(random.nextInt(45) + 1);
				Collections.sort(buyLottoNum);
			}

			// ���߹迭�� list�迭 ���
			buyLottoNumList.add(buyLottoNum);
		}
	}

	// 1�� ��÷ ������ �޼ҵ�
	public void getNumberPractice() {
		for (int j = 0; j < 4; j++) {
			buyLottoNum = new ArrayList<>();
			for (int i = 0; i <= 5; i++) {
				buyLottoNum.add(random.nextInt(45) + 1);
				Collections.sort(buyLottoNum);
			}

//			System.out.println(buyLottoNum1);
			// ���߹迭�� list�迭 ���
			buyLottoNumList.add(buyLottoNum);
//			System.out.println(buyLottoNum);
		}
//		buyLottoNumList.add(lottoNum);
		System.out.println("������ ���� �迭 ���" + buyLottoNum);
	}
////////////////////////////////// ���� list �迭�� 6���� �� ��� end/////////////////////////

	// �ζǹ�ȣ�� ���� ������ ��ȣ �� �޼ҵ�
	public void compareLottoNum() {
		// ���� ������ ��ȣ ���
		System.out.println("���� ������ ��ȣ: " + buyLottoNumList);

		// ���� ����
		Integer buyLottoRandom = 0; // ���� ������ ���� 6�� �迭 �� 1���� ���� ���� ����
		Integer lottoRandom = 0; // �ζ� ��÷ ��ȣ 1���� ���� ���� ����
		sameList = new ArrayList<>();

		for (int buyListIndex = 0; buyListIndex < buyLottoNumList.size(); buyListIndex++) {
			same = new ArrayList<>();
//			for (int buyNumIndex = 0; buyNumIndex < buyLottoNum.size(); buyNumIndex++) {
			for (int buyNumIndex = 0; buyNumIndex < buyLottoNumList.get(buyListIndex).size(); buyNumIndex++) {
				buyLottoRandom = buyLottoNumList.get(buyListIndex).get(buyNumIndex);
				int count = 0;
				for (int lottoIndex = 0; lottoIndex < lottoNum.size(); lottoIndex++) {
					lottoRandom = lottoNum.get(lottoIndex);
					if (buyLottoRandom.equals(lottoRandom)) {
//							System.out.println("����");
						same.add(buyNumIndex, "����");
						break;
					} else {
						count++;
					}
					if (count == 6) {
//							System.out.println("�ٸ�");
						same.add(buyNumIndex, "�ٸ�");
						break;
					}
				}
			}
			sameList.add(buyListIndex, same);
		}
		comparingBonus();
		System.out.println("��÷ ��ȣ ��÷: " + sameList.toString());
		rank();
	}

	// ���ʽ� ��ȣ �� �޼ҵ�
	public void comparingBonus() {
		for (int buyListIndex = 0; buyListIndex < buyLottoNumList.size(); buyListIndex++) {
			if (buyLottoNumList.get(buyListIndex).contains(lottoBonus)) {
				int sameIndex = buyLottoNumList.get(buyListIndex).indexOf(lottoBonus);
				sameList.get(buyListIndex).set(sameIndex, "���ʽ� ��ȣ ��÷!");
			}
		}
	}

	// ��� ��÷ �޼ҵ�
	public void rank() {
		int countD = 0; // �ٸ� ���� üũ
		int countB = 0; // ���ʽ� ��ȣ ��÷ ����
		// ranking �迭 ���� ����(�ʵ忡�� ������ buyLottoNumList�� �� x�� 0���� ����)
		ranking = new ArrayList<>();
		
		for (int rankingIndex = 0; rankingIndex < sameList.size(); rankingIndex++) {
			countD = Collections.frequency(sameList.get(rankingIndex), "�ٸ�");
			countB = Collections.frequency(sameList.get(rankingIndex), "���ʽ� ��ȣ ��÷!");

			switch (countD) {
			case 0:
				if (countB == 0) { // ������ 6�����
					ranking.add("1��");
				} else {
					ranking.add("2��");
				}
				break;
			case 1:
				if (countB == 0) {
					ranking.add("3��");
				} else {
					ranking.add("4��");
				}
				break;
			case 2:
				if (countB == 0) {
					ranking.add("4��");
				} else {
					ranking.add("5��");
				}
				break;
			case 3:
				if (countB == 0) {
					ranking.add("5��");
				} else {
					ranking.add("��÷");
				}
				break;
			default:
				ranking.add("��÷");
				break;
			}
		}
		countD = 0;
		countB = 0;
		System.out.println("��÷ ����: " + ranking.toString());
		getMoney();
	}

	// �ݾ� ��� �޼ҵ�

	// 2. 4, 5�� ���� ��÷ �ݾ� ���� - 1�� ���� �ݾ׿��� ���̳ʽ� - 2�� ���ɱݾ׿��� 1�� �ݾ� ���̳ʽ� - 3�� ���ɱݾ׿��� 2��
	// �ݾ� ���̳ʽ�
	// 3. �� ���� �ݾ�(���� ����)
	public void getMoney() {
		int winningMoney;
		// 1. totalMoney ��÷�� �ݾ����� �����ϱ�
		totalMoney = (totalMoney + (1000 * buyLottoNumList.size()));
		System.out.println("��÷�� �� �ݾ�: " + totalMoney);

		// 5�� ��÷ Ƚ�� -> 1, 2, 3�� ��꿡�� ���
		int fifthCount = Collections.frequency(ranking, "5��");
		// 4�� ��÷ Ƚ��
		int fourthCount = Collections.frequency(ranking, "4��");

		// 4�� , 5�� ��÷ �� ��÷ �ݾ� �޼ҵ�
		winningMoney = fifthCount * 5000 + fourthCount * 50000;
		totalMoney -= winningMoney;
		winningTotal += winningMoney;
		// 1�� ��÷ �� ��÷ �ݾ� �޼ҵ�
		winningMoney = totalMoney / 75 * Collections.frequency(ranking, "1��");
		totalMoney -= winningMoney;
		winningTotal += winningMoney;
		// 2�� ��÷ �� ��÷ �ݾ� �޼ҵ�
		winningMoney = (int) (Double.valueOf(totalMoney) / 12.5 * Collections.frequency(ranking, "2��"));
		totalMoney -= winningMoney;
		winningTotal += winningMoney;
		// 3�� ��÷ �� ��÷ �ݾ� �޼ҵ�
		winningMoney = (int) (Double.valueOf(totalMoney) / 12.5 * Collections.frequency(ranking, "3��"));
		totalMoney -= winningMoney;
		winningTotal += winningMoney;
		System.out.println("�� ��÷ �ݾ�: " + winningTotal);
		setPanel();
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ResultPage page = new ResultPage();
		page.setPanel();
		JPanel pnl = page.getPnl();
		frame.getContentPane().add(pnl);
		frame.setSize(900, 600);
		frame.setVisible(true);
	}
}