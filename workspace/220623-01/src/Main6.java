import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main6 extends JFrame {
	public Main6() {
		JPanel pnl = new JPanel();
//		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);  // 왼오중앙가능
//		pnl.setLayout(flow);
		// 기본적으로 중앙에 배치되도록 설정 -> 배치 가꾸기 ex. lowLayout(FlowLayout.RIGHT); // 왼오중앙가능
//		BorderLayout border = new BorderLayout();
//		//  자기 영역에 컴포넌트를 가득 채움
//		pnl.setLayout(border);
//		BoxLayout box = new BoxLayout(pnl, BoxLayout.X_AXIS);
//		// 박스쌓듯이 쌓아주기만하는데, 쌓는 방향 결정 가능
//		pnl.setLayout(box);
//		GridLayout grid = new GridLayout(2, 2);
//		pnl.setLayout(grid);
		// n행 n열로 나뉨(왼쪽 위부터 채워감), 크기에 대한 설정은 전부 무시
		pnl.setLayout(null);
		// 패널에 레이아웃 추가해도 하나도 안보임, 버튼 위치/크기 설정이 안돼있으므로

		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		
		btn1.setLocation(10, 30);
		btn1.setSize(200, 300);

		btn2.setBounds(220, 50, 50, 160);
		
		btn1.setPreferredSize(new Dimension(300, 300));
		// Dimension : 2d 크기 지정지정할 때
		btn1.setMinimumSize(new Dimension(300, 300));
		btn1.setMaximumSize(new Dimension(300, 300));
		
		pnl.add(btn1);
		pnl.add(btn2); //
		pnl.add(btn3); 
//		pnl.add(btn3, BorderLayout.SOUTH); // 맨 마지막에 추가한 것으로 적용
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main6().setVisible(true);
	}
}
