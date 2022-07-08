import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Memo extends JFrame {
	private File file;

	public Memo() {
		JPanel pnl = new JPanel();
		JPanel buttonsAll = new JPanel();
		JButton open = new JButton("열기");
		JButton save = new JButton("저장");
		JPanel textAll = new JPanel();
		JTextArea text = new JTextArea();
		text.setPreferredSize(new Dimension(400, 200));

		buttonsAll.add(open);
		buttonsAll.add(save);

		textAll.add(text);

		pnl.add(buttonsAll);
		pnl.add(textAll);

		add(pnl);

		BoxLayout result = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(result);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		save.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("저장");
				writer(text);
				chooser();

			}
		});

		open.addMouseListener(new MouseAdapter() {
		});
	}

	public void writer(JTextArea ta) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(file.getAbsolutePath()));

			pw.println(ta.getText());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}

	public void chooser() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(null);

		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			System.out.println("사용자가 선택한 파일 : " + file.getAbsolutePath());
		}
	}

	public void reader() {
		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Memo().setVisible(true);
	}
}
