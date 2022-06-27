import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame {
	public Main4() {
		JPanel pnl = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit();
		// 이미지를 받기 위해 Toolkit을 이용하기
		
		// src폴더 기준으로 파일 찾아서 가져올 때 경로 설정
//		URL url = Main4.class.getClassLoader().getResource("춘식9.png");
//		// URL - java.net 안에 존재하는 클래스
//		// getClassLoader() : reflection을 통해 class path 안에 있는 자원을 참조할 수 있도록 찾음
//		// getResource("찾고자하는 자원명") : 자원이 있는 위치를 나타내는 url 명시
//		// this.getClass() = Main4.class 
//		ImageIcon image = new ImageIcon(kit.getImage(url));
//		URL url2 = Main4.class.getClassLoader().getResource("춘식8.png");
//		ImageIcon image2 = new ImageIcon(kit.getImage(url2));
		
		// 폴더 안 패키지에 파일이 들어가있을 때 경로설정, resources만 담을 source 폴더를 새로 만들어서 담은 후 경로 설정
		URL url = Main4.class.getClassLoader().getResource("images/춘식9.png");
//		 폴더 안 경로 /로 폴더 안을 의미해줌(내부 경로 표시)
//		 URL - java.net 안에 존재하는 클래스
//		 getClassLoader() : reflection을 통해 class path 안에 있는 자원을 참조할 수 있도록 찾음
//		 getResource("찾고자하는 자원명") : 자원이 있는 위치를 나타내는 url 명시
//		 this.getClass() = Main4.class 
		ImageIcon image = new ImageIcon(kit.getImage(url));
		URL url2 = Main4.class.getClassLoader().getResource("images/춘식8.png");
		ImageIcon image2 = new ImageIcon(kit.getImage(url2));
		
		
//		Image image = kit.getImage("춘식8.png");
//		// 이미지 받아오기 -> 폴더안에 이미지파일 있어야함
//		Image image2 = kit.getImage("춘식9.png");
		
		JLabel lbl = new JLabel(image);
		// 텍스트뿐만 아니라 이미지도 표현 가능
		// 아이콘으로 받기 때문에 icon 인터페이스로 넣어줌
		pnl.add(lbl);
		
		lbl.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
			// 마우스 클릭했을 때 사진 변경하는 메소드 재정의
				lbl.setIcon(image2);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		
		add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
