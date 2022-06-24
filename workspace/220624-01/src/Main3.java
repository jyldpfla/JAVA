import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main3 extends JFrame {
	public Main3() {
		JPanel pnl = new JPanel();
		JRadioButton rdb1 = new JRadioButton("라디오1");
		JRadioButton rdb2 = new JRadioButton("라디오2");
		JRadioButton rdb3 = new JRadioButton("라디오3");
		ButtonGroup group = new ButtonGroup();
		// 버튼 묶는 그룹 생성 -> 하나를 선택하면 나머지가 선택 해제
		// 중복이 되지 않고 하나만 선택될  수 있도록 함
		// 다른 버튼도 넣을 수 있지만 의도와는 다르게 될 가능성이 높음
		
		JRadioButton rdb4 = new JRadioButton("라디오4");
		JRadioButton rdb5 = new JRadioButton("라디오5");
		// 그룹이 아닌 다른 버튼들과는 중복 선택 가능
		
		group.add(rdb1);
		group.add(rdb2);
		group.add(rdb3);
		
//		rdb1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("프로그램 실행");
//			}
//		});
		
		rdb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange() == ItemEvent.SELECTED);
			}
		});
		
		pnl.add(rdb1);
		pnl.add(rdb2);
		pnl.add(rdb3);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}

