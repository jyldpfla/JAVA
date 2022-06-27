import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class Main3 extends JFrame {
	public Main3() {
		JPanel red = new JPanel();
		red.setBackground(Color.red);
		
		JPanel blue = new JPanel();
		blue.setBackground(Color.blue);
		
		JTabbedPane tab = new JTabbedPane();
		// 탭화면 만들기, 사용자가 변화할 수 있도록
		tab.add("빨강", red);
		tab.add("파랑", blue);
		add(tab);
		
//		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, red, blue);
//		split.setDividerLocation(150);
//		// 어떻게 나누어져있을지 초기 설정 가능
//		add(split);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
