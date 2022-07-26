
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import javax.swing.JScrollPane;

public class Clothes {
	private JPanel pnl;
	
	public JPanel getPnl() {
		return pnl;
	}
	
	// 패널 창 만들기
	public void setPanel() throws SQLException {
		
		
		
		pnl = new JPanel();
		JPanel codiSet = new JPanel();
		codiSet.setBounds(12, 26, 400, 700);
		Border border = new BevelBorder(BevelBorder.RAISED);
		codiSet.setBorder(border);
		pnl.add(codiSet);
		codiSet.setLayout(null);
		
		JLabel lblTop = new JLabel("\uC0C1\uC758");
		lblTop.setBounds(12, 81, 160, 160);
		codiSet.add(lblTop);
		
		JLabel lblBottom = new JLabel("\uD558\uC758");
		lblBottom.setBounds(12, 260, 160, 160);
		codiSet.add(lblBottom);
		
		JLabel lblShoes = new JLabel("\uC2E0\uBC1C");
		lblShoes.setBounds(12, 439, 160, 160);
		codiSet.add(lblShoes);
		
		JLabel lblBag = new JLabel("\uAC00\uBC29");
		lblBag.setBounds(216, 521, 150, 150);
		codiSet.add(lblBag);
		
		JLabel lblAcc1 = new JLabel("\uC545\uC138\uC0AC\uB9AC2");
		lblAcc1.setBounds(246, 204, 120, 120);
		codiSet.add(lblAcc1);
		
		JLabel lblAcc2 = new JLabel("\uC545\uC138\uC0AC\uB9AC");
		lblAcc2.setBounds(246, 65, 100, 100);
		codiSet.add(lblAcc2);
		
		JLabel lblAcc3 = new JLabel("\uC545\uC138\uC0AC\uB9AC3");
		lblAcc3.setBounds(236, 367, 130, 130);
		codiSet.add(lblAcc3);
		
		
		
		// 상의 탭 메뉴
		JPanel top = new JPanel();
		top.setBounds(245, 10, 227, 441);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		URL url = Clothes.class.getClassLoader().getResource("상의//babo.jpg");
		ImageIcon image = new ImageIcon(kit.getImage(url).getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		
//		for(int i = 0; i < topList.size(); i++) {
//			Toolkit kit = Toolkit.getDefaultToolkit();
//			URL url = Clothes.class.getClassLoader().getResource(topList.get(i).getProduct_Image());
//			ImageIcon image = new ImageIcon(kit.getImage(url).getScaledInstance(200, 200, Image.SCALE_SMOOTH));
//			JLabel
//		}
		
		
		ProductDao a = new ProductDao();
		System.out.println(a.read().get(0).getProduct_Image());
		URL url1 = Clothes.class.getClassLoader().getResource(a.read().get(0).getProduct_Image());
		ImageIcon image1 = new ImageIcon(kit.getImage(url1).getScaledInstance(200, 200, Image.SCALE_SMOOTH));
	
		JCheckBox clothes2 = new JCheckBox("바보다", image1);
		clothes2.setBounds(8, 6, 180, 180);
		top.add(clothes2);
		
		
		// 하의 탭 메뉴
		JPanel bottom = new JPanel();
		bottom.setBounds(245, 10, 227, 441);
		
		// 신발 탭 메뉴
		JPanel shoes = new JPanel();
		shoes.setBounds(245, 10, 227, 441);
		
		// 가방 탭 메뉴
		JPanel bag = new JPanel();
		bag.setBounds(245, 10, 227, 441);
		
		// 악세사리 탭 메뉴
		JPanel acc = new JPanel();
		acc.setBounds(245, 10, 227, 441);
		
		// 장바구니 탭 메뉴
		JPanel basket = new JPanel();
		basket.setBounds(245, 10, 227, 441);
		top.setLayout(null);
		bottom.setLayout(null);
		
		
		// 탭 메뉴창
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(424, 26, 400, 700);
		tabbedPane.add("상의", new JScrollPane(top));
		// 탭메뉴챵이름.add("탭메뉴명",추가할패널);
		tabbedPane.add("하의", new JScrollPane(bottom));
		tabbedPane.add("신발", new JScrollPane(shoes));
		tabbedPane.add("가방", new JScrollPane(bag));
		tabbedPane.add("악세사리", new JScrollPane(acc));
		tabbedPane.add("장바구니", new JScrollPane(basket));
		
		
		
		pnl.add(tabbedPane);
		
		JButton btnApply = new JButton("\uB4F1\uB85D");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnApply.setBounds(315, 763, 97, 23);
		pnl.add(btnApply);
		
		btnApply.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// 등록 누르면 값이 DB로 넘어가야함
			}
		});
		
		JButton btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setBounds(424, 763, 97, 23);
		pnl.add(btnCancel);

		

		// 탭메뉴 선택의상 코디셋에 추가 및 삭제 메소드
		ItemListener checked = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("눌러졌자나!!!" + e.getStateChange());
					lblTop.setIcon(image);
				} else if(e.getStateChange() == ItemEvent.DESELECTED) {
					System.out.println("취소했다구!!" + e.getStateChange());
					lblTop.setIcon(null);
				}
			}
		};
		
		
		JCheckBox clothes1 = new JCheckBox("으앙", image);
		clothes1.addItemListener(checked);
		clothes1.setBounds(205, 6, 180, 180);
		top.add(clothes1);
		
		
		
	}
	
	
	// db랑 연결
//	public 
	
	public static void main(String[] args) throws SQLException {
		JFrame frame = new JFrame();
		Clothes codiPage = new Clothes();
		codiPage.setPanel();
		JPanel pnl = codiPage.getPnl();
		frame.getContentPane().add(pnl);
		pnl.setLayout(null);
		
				
		frame.setSize(850, 850);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(3); // exit_on_close
	}
}
