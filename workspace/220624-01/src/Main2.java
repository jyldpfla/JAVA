import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.FlowLayout;

public class Main2 extends JFrame {
	public Main2() {
		JPanel pnl = new JPanel();
		JPanel menuBox = new JPanel();
		menuBox.setBounds(12, 98, 176, 183);
		JCheckBox menu1 = new JCheckBox("짜장면");
		JCheckBox menu2 = new JCheckBox("짬뽕");
		JCheckBox menu3 = new JCheckBox("탕수육");
		JLabel price = new JLabel();
		price.setBounds(275, 39, 0, 0);
		String price1 = "2500원";
		String price2 = "4000원";
		String price3 = "10000원";
		int sum = 0;
		
		
		BoxLayout box = new BoxLayout(menuBox, BoxLayout.Y_AXIS);
		menuBox.setLayout(box);
		
		menu1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange();
				if(result == 1) {
					price.setText(price1);
//					sum += Integer.parseInt(price1);
				} else {
					price.setText(" ");
				}
			}
		});
		menu2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange();
				if(result == 1) {
					price.setText(price2);
//					sum += Integer.parseInt(price1);
				} else {
					price.setText(" ");
				}
			}
		});
		menu3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange();
				if(result == 1) {
					price.setText(price3);
//					sum += Integer.parseInt(price1);
				} else {
					price.setText(" ");
				}
			}
		});
		pnl.setLayout(null);
		
		menuBox.add(menu1);
		menuBox.add(menu2);
		menuBox.add(menu3);

		pnl.add(menuBox);
		pnl.add(price);
		
		getContentPane().add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
