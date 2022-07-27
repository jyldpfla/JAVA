
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Blob;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.GridLayout;
import java.awt.Rectangle;

public class Clothes {
	private JPanel pnl;
	private static JLabel lblCodiSet;

	public JPanel getPnl() {
		return pnl;
	}

//	// 사진 사이즈 조절 -> nullpointerexception 발생 수정 피료해애
//	public ImageIcon scaleImage(ImageIcon icon, int w, int h) {
//		return new ImageIcon(icon.getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
//	}

	// 패널 창 만들기
	public void setPanel() throws SQLException {

		pnl = new JPanel();

		JPanel codiSet = new JPanel();
		codiSet.setForeground(new Color(0, 0, 0));
		codiSet.setBounds(12, 26, 400, 700);
		lblCodiSet = new JLabel();
		lblCodiSet.setForeground(new Color(220, 220, 220));
		lblCodiSet.setBounds(0, 0, 400, 700);

		codiSet.add(lblCodiSet);
		Border border = new BevelBorder(BevelBorder.RAISED);
		codiSet.setBorder(border);
		pnl.add(codiSet);
		codiSet.setLayout(null);

		JLabel lblTop = new JLabel("\uC0C1\uC758");
		lblTop.setBounds(12, 81, 160, 160);
//		lblTop.setPreferredSize(preferredSize);
		lblCodiSet.add(lblTop);

		JLabel lblBottom = new JLabel("\uD558\uC758");
		lblBottom.setBounds(12, 260, 160, 160);
		lblCodiSet.add(lblBottom);

		JLabel lblShoes = new JLabel("\uC2E0\uBC1C");
		lblShoes.setBounds(12, 439, 160, 160);
		lblCodiSet.add(lblShoes);

		JLabel lblBag = new JLabel("\uAC00\uBC29");
		lblBag.setBounds(216, 521, 150, 150);
		lblCodiSet.add(lblBag);

		JLabel lblAcc1 = new JLabel("\uC545\uC138\uC0AC\uB9AC2");
		lblAcc1.setBounds(246, 204, 120, 120);
		lblCodiSet.add(lblAcc1);

		JLabel lblAcc2 = new JLabel("\uC545\uC138\uC0AC\uB9AC");
		lblAcc2.setBounds(246, 65, 100, 100);
		lblCodiSet.add(lblAcc2);

		JLabel lblAcc3 = new JLabel("\uC545\uC138\uC0AC\uB9AC3");
		lblAcc3.setBounds(236, 367, 130, 130);
		lblCodiSet.add(lblAcc3);

		// 상의 탭 메뉴
		JPanel top = new JPanel();
		top.setBounds(245, 10, 227, 441);

		Toolkit kit = Toolkit.getDefaultToolkit();
		URL url = Clothes.class.getClassLoader().getResource("상의\\babo.jpg");
		ImageIcon image = new ImageIcon(kit.getImage(url).getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		
		// 이미지 받아오기  + blob형 이미지 imageicon으로 변환해서 gui에 표시
		ImageIcon convertedImage = null;
		try {
			ManagementDaoImpl dao = new ManagementDaoImpl();
			Blob imageBlob = dao.readByKind("top").get(0).getImageUrl();
			InputStream in = imageBlob.getBinaryStream();
			BufferedImage bimg = ImageIO.read(in);
			Image blobImage = bimg;
			convertedImage = new ImageIcon(blobImage.getScaledInstance(150, 10, Image.SCALE_DEFAULT));
//			convertedImage.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		for(int i = 0; i < topList.size(); i++) {
//			Toolkit kit = Toolkit.getDefaultToolkit();
//			URL url = Clothes.class.getClassLoader().getResource(topList.get(i).getProduct_Image());
//			ImageIcon image = new ImageIcon(kit.getImage(url).getScaledInstance(200, 200, Image.SCALE_SMOOTH));
//			JLabel
//		}
//		
//		
//		ManagementDaoImpl getTop = new ManagementDaoImpl();
//		System.out.println(getTop.readByKind("top").get(0).getImageUrl());
//		ImageIcon image1 = new ImageIcon(kit.getImage(getTop.readByKind("top").get(0).getImageUrl()).getScaledInstance(200, 200, Image.SCALE_SMOOTH));
//		
//		JCheckBox clothes2 = new JCheckBox("으앙", image1);
//		clothes2.setBounds(10, 6, 180, 180);
//		top.add(clothes2);

		// 하의 탭 메뉴
		JPanel bottom = new JPanel();
		bottom.setBounds(245, 10, 227, 441);

		// 신발 탭 메뉴
		JPanel shoes = new JPanel();
		shoes.setBounds(245, 10, 227, 441);

		// 가방 탭 메뉴
		JPanel bag = new JPanel();
		bag.setBounds(245, 10, 227, 441);

		// 악세사리 탭 메뉴
		JPanel acc = new JPanel();
		acc.setBounds(245, 10, 227, 441);

		// 장바구니 탭 메뉴
		JPanel basket = new JPanel();
		basket.setBounds(245, 10, 227, 441);
		bottom.setLayout(null);

		// 탭 메뉴창
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(424, 26, 400, 700);
		tabbedPane.add("상의", new JScrollPane(top));
		// 탭메뉴챵이름.add("탭메뉴명",추가할패널);
		tabbedPane.add("하의", new JScrollPane(bottom));
		tabbedPane.add("신발", new JScrollPane(shoes));
		tabbedPane.add("가방", new JScrollPane(bag));
		tabbedPane.add("악세사리", new JScrollPane(acc));
		tabbedPane.add("장바구니", new JScrollPane(basket));

		pnl.add(tabbedPane);

		JButton btnApply = new JButton("\uB4F1\uB85D");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnApply.setBounds(315, 763, 97, 23);
		pnl.add(btnApply);

		btnApply.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				BufferedImage im = new BufferedImage(lblCodiSet.getWidth(), lblCodiSet.getHeight(),
						BufferedImage.TYPE_INT_RGB);
				// 이미지 객체 만들기(넓이, 높이, 이미지 색상 타입 지정)
				Graphics g = im.createGraphics();
				// 그림 그리는 객체 생성, im.createGraphics() : 그림을 그려라
				g.setColor(Color.WHITE);
				// 그림 그리는 객체가 흰색으로 칠하도록 지정
				g.fillRect(0, 0, lblCodiSet.getWidth(), lblCodiSet.getHeight());
				// 사각형 전체를 흰색으로 칠하게 함
				lblCodiSet.paint(g);
				// 레이블에 있는 그림그리는 메소드로 이미지에 그림을 그리기 => 레이블.그림그리기(이미지 객체에 그림그려라);
				try {
					ImageIO.write(im, "JPG", new File(
							"C:\\Users\\Administrator\\Desktop\\장예림\\TeamProject - codi\\TeamProject2\\resources\\코디셋\\shot.jpg"));
					// 파일로 출력
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});

		JButton btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setBounds(424, 763, 97, 23);
		pnl.add(btnCancel);

		// 탭메뉴 선택의상 코디셋에 추가 및 삭제 메소드
		ItemListener checked = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("눌러졌자나!!!" + e.getStateChange());
					lblTop.setIcon(image);
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					System.out.println("취소했다구!!" + e.getStateChange());
					lblTop.setIcon(null);
				}
			}
		};
		top.setLayout(new GridLayout(0, 2, 0, 0));
		JCheckBox clothes1 = new JCheckBox("으앙", convertedImage);
		top.add(clothes1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		top.add(chckbxNewCheckBox);

		clothes1.addItemListener(checked);
	}

	public static void main(String[] args) throws SQLException {
		JFrame frame = new JFrame();
		Clothes codiPage = new Clothes();
		codiPage.setPanel();
		JPanel pnl = codiPage.getPnl();
		frame.getContentPane().add(pnl);
		pnl.setLayout(null);

		frame.setSize(850, 850);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(3); // exit_on_close
	}
}
