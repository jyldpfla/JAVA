import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main2 extends JFrame {
	public Main2() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10);
		// 비밀번호를 입력할 수 있도록 하는 필드
		
		JTextArea ta = new JTextArea(20, 20);
		// 글쓸 수 있는 공간(사용자가 여러줄의 텍스트를 입력할 수 있게함 ), 크기를 정수형태로 전달 받음
		JScrollPane scrl = new JScrollPane(ta);
		// scroll 할 수 있는 component에 담아서 앞에 배치
		// () : scroll할 수 있는 컴포넌트 받아옴
	
		pnl.add(tf);
		pnl.add(pf);
		
		add(pnl);
		add(scrl, "South");
		
		// 엔터누를 때 action이 일어나긴 하니까 action으로 가능하지만, 어떤 키를 눌렀는지 상대적으로 알기 어려움
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("엔터 누름");
			}
		});
		
		// 사용자가 입력하는 값을 textarea에 그대로 붙일 수 있도록
		// keyEvent가 enter에 일어날 때 키값 옮기도록 설정 가능
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// key가 눌러졌을 때
				int id = e.getID();
				if (id == KeyEvent.KEY_TYPED) { // id 값으로 key가 온전하게 입력됐을 때
					char ch = e.getKeyChar();
					ta.append(String.valueOf(ch) + "\n");
					// append : 기존 입력에 덧붙일 때 사용하는 메소드
				}
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
