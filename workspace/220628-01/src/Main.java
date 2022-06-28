// 부가창 만들기
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class SubWindow extends JDialog {
	private JTextField tf;
	public SubWindow(JFrame owner) { // 파라미터 추가
		super(owner, true);
		// 부모 생성자로 던져줌
		// 필드로 가지고 있기 때문에 get으로 값 받아올 수 있음
		// 뒤에 true modal값 설정한 것
		
//		setModal(true);
		// 본 창이 켜져있는동안에는 다른 창과 상호작용할 수 없도록 막아둠
		setTitle("부가 창");
		
		tf = new JTextField(10);
		add(tf, "North");
		
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyChar());
			}
		});
		
		JButton btn = new JButton("다른 버튼");
		add(btn);
		
		// 버튼 눌렀을 때 창 닫히게 하는 메소드
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		setSize(500, 500);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 닫기 버튼을 눌렀을 때 종료가 되도록 -> 프로그램 종료
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// 프로그램이 종료되지 않고 창만 닫힘
		// 닫을 때 dispose가 된다, dispose : 창을 보이지 않도록 해줌, setVisible(false)와 비슷
	}
	
	public String showDialog() {
		setVisible(true);
		// modal값이 true일 때 프로그램이 멈춘 것처럼 보임
		
		// 닫았을 때 text값을 다른 창에서 볼 수 있도록 전달하고 싶음
		return tf.getText();
	}
}

public class Main extends JFrame {
	public Main() {
		super("주요 창");
		
		JButton btn = new JButton("버튼");
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SubWindow dialog = new SubWindow(Main.this);
				// this라고만 쓰면 actionevent 클래스를 나타내는데, Main에 있는 익명클래스라고 더 확실히 짚어주기 위해 Main 붙임
				// Main 붙이면 frame이 넘어감
				// 버튼 누르면 보이도록 설정
				// 생성자 값 넣어주기
				String result = dialog.showDialog();
				
				// 호출 전에 프로그램 멈춘 것처럼 보임
				System.out.println("이 문장은 언제 호출될까?");
				// sub창 닫으면 호출됨, but modal값이 false면 sub창 뜰때 호출됨
				btn.setText(result);
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
