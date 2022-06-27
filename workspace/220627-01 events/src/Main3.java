import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main3 extends JFrame {
	public Main3() {
		JPanel pnl = new JPanel(null);
		// JPanel은 기본적으로 컴포넌트를 full layout으로 가져오는데 값을 주지 않음 -> 직접 정해줄 수 있음
		pnl.setPreferredSize(new Dimension(500, 500));
		// 좌표와 크기를 직접 지정
		
		JButton btn = new JButton("Click Me");
		btn.setBounds(150, 150, 100, 100);
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setLocation((int) (Math.random() * 400), (int) (Math.random() * 400));
				// 마우스가 올라갔을 때 버튼의 위치 변경
			}
		});
		
		pnl.add(btn);
		add(pnl);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
