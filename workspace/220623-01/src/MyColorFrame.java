import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyActionListener implements ActionListener {
	// 클릭했을 때 동작이 구현되도록 하는 인터페이스
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("사용자가 버튼을 클릭 했네요~");
	}
}

public class MyColorFrame extends JFrame {
	public MyColorFrame() {
		super("색깔 있는 프레임");
		
		JPanel pnl = new JPanel();
		// 빈 판, 컨테이너를 채울 수 있는 아이
		pnl.setBackground(Color.RED);
		
		JButton btn = new JButton("컨테이너 안의 버튼");
//		MyActionListener listener = new MyActionListener();
//		// 클래스로 만들었으므로 인스턴스화해서 사용할 수 있도록
//		btn.addActionListener(listener);
		
		// 익명 클래스로 인터페이스 구현하기 -> 지역 변수에 접근할 수 있음
		btn.addActionListener(new ActionListener()  {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ActionEvent 변수 : 각 컴포넌트가 정의하고 있는 액션이 발생했을 때 발생한 이벤트 -> 클릭했을 때 발생하도록
				pnl.setBackground(Color.BLUE);
			}
		});
		
		pnl.add(btn);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyColorFrame f = new MyColorFrame();
		f.setVisible(true);
	}
}
