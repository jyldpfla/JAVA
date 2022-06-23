import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("제목입니다");
		// 제목 설정
		
		//contentPane(내용을 나타냄)이라는 객체를 참조해서 글자를 보이도록 하기
		frame.getContentPane().add(new JLabel("Hello World"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 닫기 버튼을 눌렀을 때 프로그램을 종료해라
		// EXIT_ON_CLOSE : public, static, final, int 인 것 알 수 있음
		
		frame.setSize(500, 500);
		// 설정해주고 싶을 때 -> set 메소드 사용
		frame.setVisible(true);
		// 크기나 위치를 설정해주고 보여줘라고 명령해야 보임
	}
}
