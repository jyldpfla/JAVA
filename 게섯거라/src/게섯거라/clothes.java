package 게섯거라;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Color;

public class clothes {
	private JPanel pnl;
	
	public JPanel getPnl() {
		return pnl;
	}
	
	// 패널 창 만들기
	public void setPanel() {
//		boolean isDragged;
//		
//		MouseListener dragAndDrop = new MouseAdapter() {
//			@Override
//			public void mousePressed(MouseEvent e) {
//				int mouseX = e.getX();
//				int mouseY = e.getY();
//				System.out.println(mouseX +", " + mouseY);
//				if(e.getSource().) {
//				
//				}
//				
//				
//			}
//			if (box.contains(new Point(me.getX(), me.getY()))) {
//		         offX = me.getX() - box.x;
//		         offY = me.getY() - box.y;
//		         isDragged = true;
//		      }
//
//			@Override
//			public void mouseDragged(MouseEvent e) {
//				int mouseX = e.getX();
//				int mouseY = e.getY();
//			}			
//		};
		
		
		pnl = new JPanel();
		JPanel codiSet = new JPanel();
		codiSet.setBounds(12, 26, 400, 780);
		Border border = new BevelBorder(BevelBorder.RAISED);
		codiSet.setBorder(border);
		pnl.add(codiSet);
		
		// 상의 탭 메뉴
		JPanel top = new JPanel();
		top.setBounds(245, 10, 227, 441);
	
		
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		URL url = ResultPage.class.getClassLoader().getResource("babo.jpg");
		ImageIcon image = new ImageIcon(kit.getImage(url).getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		
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
		
		// 하의 스크롤
		JScrollPane bottom_Sp = new JScrollPane();
		bottom_Sp.setBounds(0, 0, 390, 750);
		bottom.add(bottom_Sp);
		shoes.setLayout(null);
		
		// 신발 스크롤
		JScrollPane shoes_SP = new JScrollPane();
		shoes_SP.setBounds(0, 0, 390, 750);
		shoes.add(shoes_SP);
		bag.setLayout(null);
		
		// 가방 스크롤
		JScrollPane bag_Sp = new JScrollPane();
		bag_Sp.setBounds(0, 0, 390, 750);
		bag.add(bag_Sp);
		acc.setLayout(null);
		
		// 악세사리 스크롤
		JScrollPane acc_Sp = new JScrollPane();
		acc_Sp.setBounds(0, 0, 390, 750);
		acc.add(acc_Sp);
		basket.setLayout(null);
		
		// 장바구니 스크롤
		JScrollPane basket_Sp = new JScrollPane();
		basket_Sp.setBounds(0, 0, 390, 750);
		basket.add(basket_Sp);
		
		// 탭 메뉴창
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(424, 26, 400, 780);
		tabbedPane.add("상의", top);
		tabbedPane.add("하의", bottom);
		
		JCheckBox imgbox = new JCheckBox("바보얏",image);
		imgbox.setBackground(Color.RED);
		
		// 상의 스크롤
		JScrollPane top_Sp = new JScrollPane();
		tabbedPane.addTab("New tab", null, top_Sp, null);
		top_Sp.add(imgbox);
		tabbedPane.add("신발", shoes);
		tabbedPane.add("가방", bag);
		tabbedPane.add("악세사리", acc);
		tabbedPane.add("담은 옷", basket);
		pnl.add(tabbedPane);

		
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		clothes codiPage = new clothes();
		codiPage.setPanel();
		JPanel pnl = codiPage.getPnl();
		frame.getContentPane().add(pnl);
		pnl.setLayout(null);
		
		frame.setSize(850, 850);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(3); // exit_on_close
	}
}
