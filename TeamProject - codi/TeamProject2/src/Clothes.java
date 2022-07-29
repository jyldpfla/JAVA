
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
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Encoder;

import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialBlob;
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

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.awt.GridLayout;
import java.awt.Rectangle;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class Clothes {
	private List<CodiSet> codiSetList = new ArrayList<>();
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

		JLabel lblTop = new JLabel();
		lblTop.setBounds(12, 81, 150, 150);
//		lblTop.setPreferredSize(preferredSize);
		lblCodiSet.add(lblTop);

		JLabel lblBottom = new JLabel();
		lblBottom.setBounds(12, 260, 150, 150);
		lblCodiSet.add(lblBottom);

		JLabel lblShoes = new JLabel();
		lblShoes.setBounds(12, 439, 150, 150);
		lblCodiSet.add(lblShoes);
		

				JLabel lblAcc1 = new JLabel();
				codiSet.add(lblAcc1);
				lblAcc1.setBounds(238, 10, 150, 150);
				
		JLabel lblAcc2 = new JLabel();
		codiSet.add(lblAcc2);
		lblAcc2.setBounds(238, 264, 150, 150);
		
				JLabel lblBag = new JLabel();
				codiSet.add(lblBag);
				lblBag.setBounds(170, 170, 150, 150);
				
						JLabel lblAcc3 = new JLabel();
						codiSet.add(lblAcc3);
						lblAcc3.setBounds(159, 440, 150, 150);
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


		ItemListener checkedTop = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox eventCheckBox = (JCheckBox) e.getSource();
				if (e.getStateChange() == ItemEvent.SELECTED) {
					lblTop.setIcon(eventCheckBox.getIcon());
					lblTop.setText(eventCheckBox.getText());
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					lblTop.setIcon(null);
					lblTop.setText(null);
				}
			}
		};
		ItemListener checkedBottom = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox eventCheckBox = (JCheckBox) e.getSource();
				if (e.getStateChange() == ItemEvent.SELECTED) {
					lblBottom.setIcon(eventCheckBox.getIcon());
					lblBottom.setText(eventCheckBox.getText());
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					lblBottom.setIcon(null);
					lblBottom.setText(null);
				}
			}
		};
		ItemListener checkedBag = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox eventCheckBox = (JCheckBox) e.getSource();
				if (e.getStateChange() == ItemEvent.SELECTED) {
					lblBag.setIcon(eventCheckBox.getIcon());
					lblBag.setText(eventCheckBox.getText());
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					lblBag.setIcon(null);
					lblBag.setText(null);
				}
			}
		};
		ItemListener checkedShoes = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox eventCheckBox = (JCheckBox) e.getSource();
				if (e.getStateChange() == ItemEvent.SELECTED) {
					lblShoes.setIcon(eventCheckBox.getIcon());
					lblShoes.setText(eventCheckBox.getText());
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					lblShoes.setIcon(null);
					lblShoes.setText(null);
				}
			}
		};
		ItemListener checkedAcc = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox eventCheckBox = (JCheckBox) e.getSource();
				if (e.getStateChange() == ItemEvent.SELECTED) {
					if (lblAcc1.getIcon() == null) {
						lblAcc1.setIcon(eventCheckBox.getIcon());
						lblAcc1.setText(eventCheckBox.getText());
					} else if (lblAcc2.getIcon() == null) {
						lblAcc2.setIcon(eventCheckBox.getIcon());
						lblAcc2.setText(eventCheckBox.getText());
					} else if (lblAcc3.getIcon() == null) {
						lblAcc3.setIcon(eventCheckBox.getIcon());
						lblAcc3.setText(eventCheckBox.getText());
					}
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					if (lblAcc1.getIcon() == eventCheckBox.getIcon()) {
						lblAcc1.setIcon(null);
						lblAcc1.setText(null);
					} else if (lblAcc2.getIcon() == eventCheckBox.getIcon()) {
						lblAcc2.setIcon(null);
						lblAcc2.setText(null);
					} else if (lblAcc3.getIcon() == eventCheckBox.getIcon()) {
						lblAcc3.setIcon(null);
						lblAcc3.setText(null);
					}
				}
			}
		};

		try {
			ManagementDaoImpl dao = new ManagementDaoImpl();
			for (int j = 0; j < kind.length; j++) {
				System.out.println("옷 종류 : " + kind[j]);
				for (int i = 0; i < dao.readByKind(kind[j]).size(); i++) {
					Blob imageBlob = dao.readByKind(kind[j]).get(i).getImageUrl();
					InputStream in = imageBlob.getBinaryStream();
					BufferedImage bimg = ImageIO.read(in);
					Image blobImage = bimg;
					convertedImage = new ImageIcon(blobImage.getScaledInstance(150, 150, Image.SCALE_DEFAULT));
//					convertedImage = scaleImage(convertedImage, 150, 150);

					// 여기서 체크박스에 바로담기!!!!
					if (kind[j].equals("top")) {
						topBox = new JCheckBox[i + 1];
						topBox[i] = new JCheckBox(dao.readByKind("top").get(i).getName(), convertedImage);
						topBox[i].setHorizontalTextPosition(0); // 글자와 이미지 중간에 오게하기
						topBox[i].setForeground(new Color(0, 0, 0, 0)); // 글자 투명하게 하기
						top.add(topBox[i]);

						top.setLayout(new GridLayout(0, 2, 0, 0));

						topBox[i].addItemListener(checkedTop);
					} else if (kind[j].equals("bottom")) {
						bottomBox = new JCheckBox[i + 1];
						bottomBox[i] = new JCheckBox(dao.readByKind("bottom").get(i).getName(), convertedImage);
						bottomBox[i].setHorizontalTextPosition(0); // 글자와 이미지 중간에 오게하기
						bottomBox[i].setForeground(new Color(0, 0, 0, 0)); // 글자 투명하게 하기
						bottom.add(bottomBox[i]);

						bottom.setLayout(new GridLayout(0, 2, 0, 0));
						bottomBox[i].addItemListener(checkedBottom);
					} else if (kind[j].equals("bag")) {
						bagBox = new JCheckBox[i + 1];
						bagBox[i] = new JCheckBox(dao.readByKind("bag").get(i).getName(), convertedImage);
						bagBox[i].setHorizontalTextPosition(0); // 글자와 이미지 중간에 오게하기
						bagBox[i].setForeground(new Color(0, 0, 0, 0)); // 글자 투명하게 하기
						bag.add(bagBox[i]);
						bag.setLayout(new GridLayout(0, 2, 0, 0));
						bagBox[i].addItemListener(checkedBag);
					} else if (kind[j].equals("shoes")) {
						shoesBox = new JCheckBox[i + 1];
						shoesBox[i] = new JCheckBox(dao.readByKind("shoes").get(i).getName(), convertedImage);
						shoesBox[i].setHorizontalTextPosition(0); // 글자와 이미지 중간에 오게하기
						shoesBox[i].setForeground(new Color(0, 0, 0, 0)); // 글자 투명하게 하기
						shoes.add(shoesBox[i]);

						shoes.setLayout(new GridLayout(0, 2, 0, 0));
						shoesBox[i].addItemListener(checkedShoes);
					} else if (kind[j].equals("acc")) {
						accBox = new JCheckBox[i + 1];
						accBox[i] = new JCheckBox(dao.readByKind("acc").get(i).getName(), convertedImage);
						accBox[i].setHorizontalTextPosition(0); // 글자와 이미지 중간에 오게하기
						accBox[i].setForeground(new Color(0, 0, 0, 0)); // 글자 투명하게 하기
						acc.add(accBox[i]);

						acc.setLayout(new GridLayout(0, 2, 0, 0));
						accBox[i].addItemListener(checkedAcc);
					}

				}

			}

			for (int i = 0; i < dao.readFromCart("test1").size(); i++) {
				Blob imageBlob = dao.readFromCart("test1").get(i).getImageUrl();
				InputStream in = imageBlob.getBinaryStream();
				BufferedImage bimg = ImageIO.read(in);
				Image blobImage = bimg;
				convertedImage = new ImageIcon(blobImage.getScaledInstance(150, 150, Image.SCALE_DEFAULT));
				
				cartBox = new JCheckBox[i + 1];
				cartBox[i] = new JCheckBox(dao.readFromCart("test1").get(i).getName(),convertedImage);
				cart.add(cartBox[i]);

				cart.setLayout(new GridLayout(0, 2, 0, 0));
				switch (dao.readFromCart("test1").get(i).getCategory()) {
				case "top" :
					cartBox[i].addItemListener(checkedTop);
					break;
				case "bottom" :
					cartBox[i].addItemListener(checkedBottom);
					break;
				case "bag" :
					cartBox[i].addItemListener(checkedBag);
					break;
				case "shoes" :
					cartBox[i].addItemListener(checkedShoes);
					break;
				case "acc" :
					cartBox[i].addItemListener(checkedAcc);
					break;
				}
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
		
		Tag_ThemeDao tagDao = new Tag_ThemeDao();
		JComboBox comboBox = new JComboBox(tagDao.readTag().toArray(new String[tagDao.readTag().size()]));
		comboBox.setBounds(424, 669, 286, 30);
		pnl.add(comboBox);


		JButton btnApply = new JButton("\uB4F1\uB85D");		// 등록버튼
		btnApply.setBounds(315, 763, 97, 23);
		pnl.add(btnApply);

		btnApply.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Blob blob = null;
				DAO_cart cartId = new DAO_cart();
				
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
					// 파일로 출력
					ImageIO.write(im, "JPG", new File(
							"C:\\Users\\Administrator\\Desktop\\장예림\\TeamProject - codi\\TeamProject2\\resource\\코디셋\\shot.jpg"));
					try {
						blob = Bytes(im);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				} catch (IOException e2) {
					e2.printStackTrace();
				}
	
				CodiSet set = new CodiSet(lblTop.getText(), lblBottom.getText(), lblBag.getText(), lblShoes.getText(), lblAcc1.getText(), lblAcc2.getText(), lblAcc3.getText(), blob, "test1", comboBox.getSelectedItem().toString());
				System.out.println(set.toString());
				try {
					CodiSetDaoImpl gogo = new CodiSetDaoImpl();
					gogo.createCodi(set);
				} catch (SQLException e1) {
					e1.printStackTrace();
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
	
	public Blob Bytes(BufferedImage im) throws IOException, SQLException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(im, "PNG", baos);
		// png 형식으로 파일 baos outstream에 저장
		byte[] fileArray = baos.toByteArray();
		// png 형식의 파일을 byte로 변환
		
//		Encoder encoder = Base64.getEncoder();
//		// base64는 인코딩 형식 -> png포맷으로 넣어주면 됨
//		byte[] comFileArray = encoder.encode(fileArray);
		Blob blob = null;
		blob = new SerialBlob(fileArray);
		
		
		
		System.out.println("돼써?" + blob);
		return blob;
	}
	
	// 사진 사이즈 조절 메소드
	   public ImageIcon scaleImage(ImageIcon icon, int w, int h) {
	      int nw = icon.getIconWidth();
	      int nh = icon.getIconHeight();

	      if (icon.getIconWidth() > w) {
	         nw = w;
	         nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
	      }

	      if (nh > h) {
	         nh = h;
	         nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
	      }
	      return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
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
