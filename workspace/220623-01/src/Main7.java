import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main7 extends JFrame{
	public Main7() {
		JPanel pnlTop = new JPanel();
		// 컴포넌트들을 보여줄 수 있음
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();
		// 박스가 z축으로 쌓이지 않기 위해 각각을 담아줄 박스 생성
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		// 박스는 기본적으로 가로 정렬
		pnlBox.setLayout(box);
		
		JTextField tf1 = new JTextField(20);
		// 사용자의 입력을 받을 수 있는 공간
		JTextField tf2 = new JTextField(20);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf1.getText();
				tf2.setText(text);
				JOptionPane.showMessageDialog(null, text);
				// null일 때는 dialog가 중앙에 뜸
				// JOptionPane.showMessageDialog(Main7.this, text);
				// 해당 컴포넌트 위치를 말해주면, 해당 컴포넌트에 가깝게 띄워줌
			}
		});
		
		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);
		
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		add(pnlBox);
		
		pack();
		// 창을 내부의 컴포넌트 크기에 맞춰서 조절해주는 메소드
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main7().setVisible(true);
	}
}
