import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JButton button = new JButton("버튼1"); // 버튼 생성
		JButton button2 = new JButton("버튼2");
		
		// getContentPane(). 생략 가능
		getContentPane().setLayout(new FlowLayout());
		// setLayout : 컴포넌트 위치 설정
		// 왼쪽부터 버튼을 중앙정렬해서 일자로 나열
		getContentPane().add(button); // 버튼 생성
		// 기본적으로 내용 객체 가득 채우게 설정됨
		add(button2);
		
		setLayout(new FlowLayout());
		setVisible(true);
	}	
}

public class MyFrameTest1 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
}