import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class ExitDialog extends JDialog {
	private boolean exit;
	// 필드 두고 있다가 종료버튼 누르면 필드 값 변경하면 됨
	
	public ExitDialog(JFrame owner) {
		super(owner, "종료하시겠습니까?", true);
		
		JPanel pnl = new JPanel();
		JButton btnYes = new JButton("종료");
		JButton btnNo = new JButton("취소");
		
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				exit = (e.getSource() == btnYes);
				// 버튼 참조로 종료 눌렀는지 boolean값으로
				dispose();
				// 버튼 누르면 창 닫히도록
			}
		}; 
		
		btnYes.addActionListener(actionListener);
		btnNo.addActionListener(actionListener);
		
		pnl.add(btnYes);
		pnl.add(btnNo);
		
		add(pnl);
		setSize(250, 250);
	}
	
	public boolean showDialog() {
		setVisible(true);
		// 종료 버튼은 true, 취소는 false이게 하고 싶음
		
		return exit;
	}
}

public class Main2 extends JFrame {
	public Main2() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				ExitDialog dialog = new ExitDialog(Main2.this);
//				boolean result = dialog.showDialog();
				
//				if(result) {
//					setDefaultCloseOperation(EXIT_ON_CLOSE);
//					// 종료버튼 누르면 화면 닫히도록
//				}
				
				int result = JOptionPane.showConfirmDialog(Main2.this
						, "종료하시겠습니까?", "종료 확인", JOptionPane.YES_NO_OPTION);
				// 사용자가 선택할 수 있도록 하는 메소드 가짐
//				JOptionPane.showInputDialog(Main2.this, " 입력창");
								
				if (result == JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					// yes option이면 창 닫기
				}
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		// 행동은 아무것도 일어나지 않지만 사용자가 닫기를 눌렀다는 event는 일어남
	}
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
