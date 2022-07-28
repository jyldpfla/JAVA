
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
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
import java.util.ArrayList;
import java.util.Arrays;

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
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

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
		codiSet.setBounds(12, 26, 400, 600);
		codiSet.setLayout(null);
		lblCodiSet = new JLabel();
		lblCodiSet.setBounds(0, 0, 400, 600);
		lblCodiSet.setForeground(new Color(220, 220, 220));

		codiSet.add(lblCodiSet);
		Border border = new BevelBorder(BevelBorder.RAISED);
		codiSet.setBorder(border);
		pnl.add(codiSet);

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
		lblBag.setBounds(169, 432, 150, 150);
		lblCodiSet.add(lblBag);

		JLabel lblAcc3 = new JLabel("\uC545\uC138\uC0AC\uB9AC3");
		lblAcc3.setBounds(220, 292, 130, 130);
		lblCodiSet.add(lblAcc3);

		JLabel lblAcc2 = new JLabel("악세사리2");
		lblAcc2.setBounds(220, 29, 100, 100);
		lblCodiSet.add(lblAcc2);

		JLabel lblAcc1 = new JLabel("악세사리1");
		lblAcc1.setBounds(268, 150, 120, 120);
		lblCodiSet.add(lblAcc1);

		// 상의 탭 메뉴
		JPanel top = new JPanel();
		top.setBounds(245, 10, 227, 441);

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
		JPanel cart = new JPanel();
		cart.setBounds(245, 10, 227, 441);
		bottom.setLayout(null);

		// 이미지 받아오기 + blob형 이미지 imageicon으로 변환해서 gui에 표시
		ImageIcon convertedImage = null;
		JCheckBox[] topBox;
		JCheckBox[] bottomBox;
		JCheckBox[] bagBox;
		JCheckBox[] shoesBox;
		JCheckBox[] accBox;
		JCheckBox[] cartBox;

		String[] kind = { "top", "bottom", "bag", "shoes", "acc" };

		// 탭메뉴 선택의상 코디셋에 추가 및 삭제 메소드
		ItemListener checked = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox eventCheckBox = (JCheckBox) e.getSource();
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("의상 선택");
					switch (eventCheckBox.getText()) {
					case "상의":
						lblTop.setIcon(eventCheckBox.getIcon());
						break;
					case "하의":
						lblBottom.setIcon(eventCheckBox.getIcon());
						break;
					case "가방":
						lblBag.setIcon(eventCheckBox.getIcon());
						break;
					case "신발":
						lblShoes.setIcon(eventCheckBox.getIcon());
						break;
					case "악세사리":
						if (lblAcc1.getIcon() == null) {
							lblAcc1.setIcon(eventCheckBox.getIcon());
						} else if (lblAcc2.getIcon() == null) {
							lblAcc2.setIcon(eventCheckBox.getIcon());
						} else if (lblAcc3.getIcon() == null) {
							lblAcc3.setIcon(eventCheckBox.getIcon());
						}
						break;
					}

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					System.out.println("의상 선택 취소");
					switch (eventCheckBox.getText()) {
					case "상의":
						lblTop.setIcon(null);
						break;
					case "하의":
						lblBottom.setIcon(null);
						break;
					case "가방":
						lblBag.setIcon(null);
						break;
					case "신발":
						lblShoes.setIcon(null);
						break;
					case "악세사리":
						if (lblAcc1.getIcon() == eventCheckBox.getIcon()) {
							lblAcc1.setIcon(null);
						} else if (lblAcc2.getIcon() == eventCheckBox.getIcon()) {
							lblAcc2.setIcon(null);
						} else if (lblAcc3.getIcon() == eventCheckBox.getIcon()) {
							lblAcc3.setIcon(null);
						}
						break;
					}
				}
			}
		};

//		ItemListener checked2 = new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				ManagementDaoImpl dao = new ManagementDaoImpl();
//				JCheckBox eventCheckBox = (JCheckBox) e.getSource();
//				if (e.getStateChange() == ItemEvent.SELECTED) {
//					dao.readByKind("top").get(i).
//				}
//				
//			}
//		};

		try {
			ManagementDaoImpl dao = new ManagementDaoImpl();
			for (int j = 0; j < kind.length; j++) {
				System.out.println(kind[j]);
				for (int i = 0; i < dao.readByKind(kind[j]).size(); i++) {
					Blob imageBlob = dao.readByKind(kind[j]).get(i).getImageUrl();
					InputStream in = imageBlob.getBinaryStream();
					BufferedImage bimg = ImageIO.read(in);
					Image blobImage = bimg;
					convertedImage = new ImageIcon(blobImage.getScaledInstance(150, 150, Image.SCALE_DEFAULT));

					// 여기서 체크박스에 바로담기!!!!
					if (kind[j].equals("top")) {
						topBox = new JCheckBox[i + 1];
						topBox[i] = new JCheckBox(convertedImage);
						topBox[i].setText("상의");
						topBox[i].setHorizontalTextPosition(0); // 글자와 이미지 중간에 오게하기
						topBox[i].setForeground(new Color(0, 0, 0, 0)); // 글자 투명하게 하기
						top.add(topBox[i]);

						top.setLayout(new GridLayout(0, 2, 0, 0));

						topBox[i].addItemListener(checked);
					} else if (kind[j].equals("bottom")) {
						bottomBox = new JCheckBox[i + 1];
						bottomBox[i] = new JCheckBox(convertedImage);
						bottomBox[i].setText("하의");
						bottomBox[i].setHorizontalTextPosition(0); // 글자와 이미지 중간에 오게하기
						bottomBox[i].setForeground(new Color(0, 0, 0, 0)); // 글자 투명하게 하기
						bottom.add(bottomBox[i]);

						bottom.setLayout(new GridLayout(0, 2, 0, 0));
						bottomBox[i].addItemListener(checked);
					} else if (kind[j].equals("bag")) {
						bagBox = new JCheckBox[i + 1];
						bagBox[i] = new JCheckBox(convertedImage);
						bagBox[i].setText("가방");
						bagBox[i].setHorizontalTextPosition(0); // 글자와 이미지 중간에 오게하기
						bagBox[i].setForeground(new Color(0, 0, 0, 0)); // 글자 투명하게 하기
						bag.add(bagBox[i]);
						bag.setLayout(new GridLayout(0, 2, 0, 0));
						bagBox[i].addItemListener(checked);
					} else if (kind[j].equals("shoes")) {
						shoesBox = new JCheckBox[i + 1];
						shoesBox[i] = new JCheckBox(convertedImage);
						shoesBox[i].setText("신발");
						shoesBox[i].setHorizontalTextPosition(0); // 글자와 이미지 중간에 오게하기
						shoesBox[i].setForeground(new Color(0, 0, 0, 0)); // 글자 투명하게 하기
						shoes.add(shoesBox[i]);

						shoes.setLayout(new GridLayout(0, 2, 0, 0));
						shoesBox[i].addItemListener(checked);
					} else if (kind[j].equals("acc")) {
						accBox = new JCheckBox[i + 1];
						accBox[i] = new JCheckBox(convertedImage);
						accBox[i].setText("악세사리");
						accBox[i].setHorizontalTextPosition(0); // 글자와 이미지 중간에 오게하기
						accBox[i].setForeground(new Color(0, 0, 0, 0)); // 글자 투명하게 하기
						acc.add(accBox[i]);

						acc.setLayout(new GridLayout(0, 2, 0, 0));
						accBox[i].addItemListener(checked);
					}

				}

			}

			for (int i = 0; i < dao.readFromCart("test1").size(); i++) {
				System.out.println(dao.readFromCart("test1"));
				Blob imageBlob = dao.readFromCart("test1").get(i).getImageUrl();
				InputStream in = imageBlob.getBinaryStream();
				BufferedImage bimg = ImageIO.read(in);
				Image blobImage = bimg;
				convertedImage = new ImageIcon(blobImage.getScaledInstance(150, 150, Image.SCALE_DEFAULT));

				cartBox = new JCheckBox[i + 1];
				cartBox[i] = new JCheckBox(convertedImage);
				cart.add(cartBox[i]);

				cart.setLayout(new GridLayout(0, 2, 0, 0));
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// 탭 메뉴창
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(424, 26, 400, 600);
		tabbedPane.add("상의", new JScrollPane(top));
		// 탭메뉴챵이름.add("탭메뉴명",추가할패널);
		tabbedPane.add("하의", new JScrollPane(bottom));
		tabbedPane.add("신발", new JScrollPane(shoes));
		tabbedPane.add("가방", new JScrollPane(bag));
		tabbedPane.add("악세사리", new JScrollPane(acc));
		tabbedPane.add("장바구니", new JScrollPane(cart));

		pnl.add(tabbedPane);
		
		JLabel lblNewLabel = new JLabel("테마 선택");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(263, 669, 80, 30);
		pnl.add(lblNewLabel);
		
		/// 콤보박스에 값 넣어야 해요!!!!!!!!!!!!!!!!!!!!!!!!!!!
		Tag_ThemeDao tagDao = new Tag_ThemeDao();
		JComboBox comboBox = new JComboBox(tagDao.readTag());
		comboBox.setBounds(424, 669, 286, 30);
		pnl.add(comboBox);


		JButton btnApply = new JButton("\uB4F1\uB85D");
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
							"C:\\Users\\Administrator\\Desktop\\장예림\\TeamProject - codi\\TeamProject2\\resource\\코디셋\\shot.jpg"));
					// 파일로 출력
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});

		JButton btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblTop.setIcon(null);
				lblBottom.setIcon(null);
				lblBag.setIcon(null);
				lblShoes.setIcon(null);
				lblAcc1.setIcon(null);
				lblAcc2.setIcon(null);
				lblAcc3.setIcon(null);
			}
		});
		btnCancel.setBounds(424, 763, 97, 23);
		pnl.add(btnCancel);

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
