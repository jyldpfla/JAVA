import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Main8 extends JFrame{
	public Main8() {
		JPanel pnlQ = new JPanel();
		JPanel pnlBox = new JPanel();
		JPanel pnlOne = new JPanel();
		
		BoxLayout box = new BoxLayout(pnlOne, BoxLayout.Y_AXIS);
		pnlOne.setLayout(box);
		
		JLabel l1 = new JLabel("장예림의 MBTI는?");
		JTextField tf1 = new JTextField(20);
		JButton btn1 = new JButton("확인");
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf1.getText();
				if(text.equals("infp") || text.equals("INFP")) {
					JOptionPane.showMessageDialog(null, "♥ㅇ♥ 정답 우린 칭구칭구");
				} else {
					JOptionPane.showMessageDialog(null, "⊙-⊙ 나랑 베프먹자 놀자놀자");
				}
			}
		});
		
		pnlQ.add(l1);
		pnlBox.add(tf1);
		pnlBox.add(btn1);
		
		pnlOne.add(pnlQ);
		pnlOne.add(pnlBox);
		
		add(pnlOne);
		
		setLocationRelativeTo(null);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main8().setVisible(true);
	}
}
