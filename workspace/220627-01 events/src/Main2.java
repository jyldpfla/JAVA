import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main2 extends JFrame {
	public Main2() {
		JPanel pnl = new JPanel();
		JButton btn = new JButton("버튼입니다");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("액션 이벤트 발생");
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {
			// 추상메소드가 공간을 차지 많이 하므로 하나만 메소드를 재정의 하고 싶을 때
			// MouseAdaptor라는 추상클래스
			// (MouseListener 구현, method들의 body를 다 비워둔 상태로 재정의 -> 필요한 것만 골라서 재정의 가능)
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 Pressed");
			}
		});
		
		pnl.add(btn);
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
