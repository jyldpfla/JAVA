import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	public Main() {
		MouseListener listener = new MouseListener() {
			// 추상 메소드를 5개 가짐
			@Override
			public void mouseReleased(MouseEvent e) {
//				System.out.println("마우스 버튼을 뗌");
			}
			@Override
			public void mousePressed(MouseEvent e) {
//				System.out.println("마우스 버튼을 누름");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스를 올려두지 않았을 때
				System.out.println("EXIT!!");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// 마우스를 올려둘 때(hover)
				System.out.println("ENTER");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				// click event는 사용자 pc 마다 클릭 이벤트의 감도가 다르기 때문에 적용 정도에 차이 있을 수 있음
//				System.out.println("마우스 클릭!!");
				switch (e.getButton()) {
				// 사용자가 마우스의 어느 버튼을 눌러도 클릭 이벤트 발생 -> 버튼 확인 필요하다면
				// 사용자가 어떤 버튼을 눌렀는지 상수로 알려주는데, os 설정마다 위치별 상수 다름
				case MouseEvent.BUTTON1:
					System.out.println("1번");
					break;
				case MouseEvent.BUTTON2:
					System.out.println("2번");
					break;
				case MouseEvent.BUTTON3:
					System.out.println("3번");
				}
				
				System.out.println("왼쪽 버튼인가요? " + SwingUtilities.isLeftMouseButton(e));
				// 왼쪽 버튼인지 아닌지 boolean값으로 나타내줌
				
				if (e.getClickCount() == 2) {
					// double click할 때 event 발생하도록 설정
					// getClickCounnt()로 카운트 횟수 확인 후 동작 부여 가능
					System.out.println("더블 클릭!!");
				}
			}
		};
		
		MouseMotionListener motion = new MouseMotionListener() {
			// 마우스의 움직임 event가 일어날 때 
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스가 움직입니다~." + e.getX() + "," + e.getY() );
				// getX(), getY() : 사용자의 커서 위치  x, y 좌표, 좌상단이 0
			}
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		};
		
		JPanel pnl = new JPanel();
		pnl.addMouseListener(listener);
		// addMouseListner(참조);
		pnl.addMouseMotionListener(motion);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
