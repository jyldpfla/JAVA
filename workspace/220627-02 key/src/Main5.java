import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main5 extends JFrame {
//	private String a;

	public Main5() {
//		CardLayout layout = new CardLayout();
//		JPanel pnl = new JPanel(layout);
		
		Map<String, String> user1 = new HashMap<>();
		user1.put("yerim", "12345");
		
		JPanel pnl1 = new JPanel();
		JButton btn1 = new JButton("로그인");
		JButton btn2 = new JButton("회원가입");
		JLabel lb1 = new JLabel("Id");
		JTextField tf = new JTextField(20);
		JLabel lb2 = new JLabel("Password");
		JPasswordField pf = new JPasswordField(20);
		
		JPanel pnl2 = new JPanel();
		JLabel lbi = new JLabel("Id");
		JTextField id = new JTextField(20);
		JLabel longId = new JLabel("아이디는 4자 이상 12자 이하로 설정하여야 합니다.");
		JLabel lbp = new JLabel("Password");
		JPasswordField pw = new JPasswordField(20);
		JLabel lbpp = new JLabel("Password");
		JPasswordField pwc = new JPasswordField(20);
		JButton join = new JButton("가입");
		
		// 로그인 메소드
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
//				a = tf.getText();
				// 아이디나 비밀번호를 입력하지 않았을 때
				if (tf.getText().equals("") || pf.getText().equals("")) {
					JOptionPane.showMessageDialog(pnl1, "아이디와 비밀번호를 모두 입력하세요.");
				} else if(user1.containsKey(tf.getText())) {	// 아이디가 같고
					if(user1.get(tf.getText()).equals(pf.getText())) {	// 비밀번호도 같을 때
						JOptionPane.showMessageDialog(pnl1, "로그인되었습니다.");
					} else if(!user1.get(tf.getText()).equals(pf.getText())) { // 비밀번호가 틀렸을 때
						JOptionPane.showMessageDialog(pnl1, "재로그인해주세요. 로그인에 실패하였습니다.");
					}
				} else if(!user1.containsKey(tf.getText())) { // 아이디가 틀렸을 때
					JOptionPane.showMessageDialog(pnl1, "재로그인해주세요. 로그인에 실패하였습니다.");
				}
			} 
		});
		
		// 회원가입 눌렀을 때 회원가입 창으로 이동
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				layout.next(pnl);
				// 새 창 띄우기
				JDialog bin = new JDialog();
				bin.add(pnl2);
				bin.setVisible(true);
				bin.setSize(400, 400);
			}
		});
		// 회원가입 3-2-1순 영빈쌤 추천
		
		// 회원가입 - 아이디와 비밀번호 입력 길이
		if(!(lbi.getText().length() >= 4 || lbi.getText().length() <= 12)) {
		}
		// 회원가입 - 비밀번호 간 일치 여부
		join.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lbp.getText().equals(lbpp.getText())) {
					
				}
			}
		});
		
		
		pnl1.add(lb1);
		pnl1.add(tf);
		pnl1.add(lb2);
		pnl1.add(pf);
		pnl1.add(btn1);
		pnl1.add(btn2);
		
		pnl2.add(lbi);
		pnl2.add(id);
		pnl2.add(longId);
		pnl2.add(lbp);
		pnl2.add(pw);
		pnl2.add(lbpp);
		pnl2.add(pwc);
		pnl2.add(join);
		
//		pnl.add(pnl1, "A");
//		pnl.add(pnl2, "B");
		// 패널은 한 곳에서만 사용해야함 -> 한곳에서의 참조한 컴포넌트는 다른 곳에서 사용하면 x(객체의 유효성이 깨짐)
		
//		getContentPane().add(pnl);
		getContentPane().add(pnl1);
		
	
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	
	
	public static void main(String[] args) {
		new Main5().setVisible(true);
	}
}
