import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main4T extends JFrame implements ActionListener {
	private JButton btnEnable;
	private JButton btnDisable;
	private List<JButton> list;

	public Main4T() {
		super("버튼 활성화 테스트~");
		list = new ArrayList<>();
		
		JPanel pnl = new JPanel();
		
		btnEnable = new JButton("활성화");
		btnDisable = new JButton("비활성화");
		JButton btnNotShown = new JButton("보이나?");
		
//		ActionListener aEnable = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JButton btn = (JButton) e.getSource();
//				if (btn.getText() == "활성화") {
//					btn1.setEnabled(false);
//				} else {
//					btn1.setEnabled(false);
//				}
//			}
//		};
		
//		btnDisable.setEnabled(false);
		btnNotShown.setVisible(false);
		
		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);
		for (int i = 1; i <= 5; i++) {
			JButton btn = new JButton(String.valueOf(i));
			// btn 지역 변수라서 기억해야함 -> List
			pnl.add(btn);
			
			list.add(btn); // 관리를 위해서 list에도 추가
		}
		
		add(pnl);
		
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnEnable) {
			// 버튼 5개를 참조해서 전부 다 활성화
			for (JButton btn : list) {
				btn.setEnabled(true);
			} 
		} else {
			for (JButton btn : list) {
				btn.setEnabled(false);
			}
		}
		
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}

