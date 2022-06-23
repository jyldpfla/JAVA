import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// ActionListener를 하나로!

public class MyCounter2 extends JFrame implements ActionListener {
	// implements ActionListener 추가 -> J프레임에 ActionListener 추가
	private int number = 0; // JFrame외의 나만의 특징을 가짐
	private JButton btn;
	private JButton btn2;
	private JLabel lbl;
	
	public MyCounter2() {
		super("카운터");
		
		JPanel pnl = new JPanel();
		lbl = new JLabel("0");
		btn = new JButton("증가");
		// 생성자 안에만 존재하는 지역변수(생성자 밖 인터페이스에서 접근 불가) -> 필드로 만들어주기
		
//		ActionListener aListener = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
////				JButton btn = (JButton) e.getSource();
////				if(btn.getText().equals("증가")) {
////					
////				}
//				
//				if (e.getSource() == btn) {
//					// getSource :  이벤트가 발생된 객체의 참조를 알려줌
//					number++;
//				} else {
//					number--;
//				}
//				lbl.setText(String.valueOf(number));
//			}
//		};
		
		btn.addActionListener(this);
		// 원래는 aListener의 참조를 넣어준 것이었음 -> aListener
		// implements 되어있으므로 자기 자신에 대한 참조를 알려주면 됨 -> this
		btn2 = new JButton("감소");
		btn2.addActionListener(this);
		
		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			number++;
			lbl.setText(String.valueOf(number));
		} else {
			number--;
		}
		lbl.setText(String.valueOf(number));
	}



	public static void main(String[] args) {
		new MyCounter2().setVisible(true);
	}
}

