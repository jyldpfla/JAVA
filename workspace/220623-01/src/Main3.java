import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		// 내 프레임으로 title 변경할 수 있게
		
		setSize(500, 500);
		// this 참조 빼도 상속됐으므로 사이즈 설정 가능
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Main3 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("나만의 프레임");
		// 상속받고 있으므로 JFrame frame = new MyFrame(); 가능
		frame.setVisible(true);
	}
}
