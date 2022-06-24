import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Main4 extends JFrame {
	public Main4() {
		JPanel pnl = new JPanel();	
		
		JPanel pnl1 = new JPanel();
		JRadioButton rdb1 = new JRadioButton("cm → inch");
		JRadioButton rdb2 = new JRadioButton("inch → cm");
		ButtonGroup group = new ButtonGroup();
		JButton b1 = new JButton("변환");
		
		JPanel pnl2 = new JPanel();
		JTextField tf1 = new JTextField(10);
		JLabel lbl1 = new JLabel(" = ?");
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tf1.getText().equals("")){
					lbl1.setText("숫자를 입력해주세요.");
				} else {
					Double num1 = Double.parseDouble(tf1.getText());
					if (rdb1.isSelected() == true) {
						lbl1.setText("= " + String.valueOf(Math.round(num1 / 2.54 * 100) / 100.0 ) + "inch");
					} else if (rdb2.isSelected() == true) {
						lbl1.setText("= " + String.valueOf(num1 * 2.54) + "cm");
					} else {
						lbl1.setText("= " + tf1.getText());
					}
				}
				
				
				
			}
		});
		
		group.add(rdb1);
		group.add(rdb2);
		
		pnl1.add(rdb1);
		pnl1.add(rdb2);
		pnl1.add(b1);
		
		pnl2.add(tf1);
		pnl2.add(lbl1);
		SpringLayout sl_pnl = new SpringLayout();
		sl_pnl.putConstraint(SpringLayout.NORTH, pnl2, 43, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, pnl2, 0, SpringLayout.WEST, pnl1);
		sl_pnl.putConstraint(SpringLayout.EAST, pnl2, 0, SpringLayout.EAST, pnl1);
		sl_pnl.putConstraint(SpringLayout.NORTH, pnl1, 5, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, pnl1, 16, SpringLayout.WEST, pnl);
		pnl.setLayout(sl_pnl);
		
		pnl.add(pnl1);
		pnl.add(pnl2);
		
		getContentPane().add(pnl);
		
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
