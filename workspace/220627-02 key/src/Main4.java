import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame {
	public Main4() {
		CardLayout layout = new CardLayout();
		JPanel center = new JPanel(layout);
	
		JPanel pnl1 = makePanel("첫번째");
		JPanel pnl2 = makePanel("두번째");
		JPanel pnl3 = makePanel("세번째");
		
		center.add(pnl1, "A");
		// 패널과 문자열을 같이 넣기
		center.add(pnl2, "B");
		center.add(pnl3, "C");
		
		add(center);
		
		// 화면 전환이 필요할 때, 같이 넣은 문자열로 화면전환이 바로 가능
//		layout.show(center, "C");
		// (관리하고 있는 패널 참조, 보여주고 싶은 패널의 문자열) -> 해당하는 컴포넌트만 보여줌
		
		JButton btnNext = new JButton("다음");
		JButton btnPrev = new JButton("이전");
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(btnPrev);
		pnlSouth.add(btnNext);
		
		add(pnlSouth,"South");
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("다음")) {
					layout.next(center);
					// layout.next(패널) : 넣은 순서대로 다음 것 보여줌, 순환
				} else {
					layout.previous(center);
					// 넣은 순서대로 이전 것 보여줌, 순환
				}
			}
		};
		btnNext.addActionListener(listener);
		btnPrev.addActionListener(listener);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	// 패널 만드는 메소드
	private JPanel makePanel(String text) {
		JPanel pnl = new JPanel();
		pnl.add(new JLabel(text));
		return pnl;
	}
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
