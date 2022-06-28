// 이진호 학우님꺼!
package sanswer2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

// 사용자 입력을 받을수 있는 GUI를 만들고 
// 간단한 더하기 문제(랜덤한 정수) 문제영역
// 입력 받는 영역, 확인 버튼 , 정답, 오답 확인하는 란
// 다 되면 다시 하는 기능도 만들어 보기
public class quizquiz extends JFrame {
	int a; 
	int b;
	private int count = 0; 
	public quizquiz() {
		super("퀴즈퀴즈");

		Random r = new Random();
		 a = r.nextInt(9) + 1;
		 b = r.nextInt(9) + 1;
		JLabel lbl = new JLabel(a + " + " + b + " = ? ");
		JLabel score = new JLabel("점수: " + count);		
		JTextField tf = new JTextField(20);
		JButton btn1 = new JButton("제출");
		JButton btnRE = new JButton("다시");
		JLabel lblResult = new JLabel("결과");
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlResult = new JPanel();
		JPanel pnlBox = new JPanel();
		JPanel pnlscore = new JPanel();

		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (tf.getText().equals(String.valueOf(a + b))) {
					lblResult.setText("정답");
					pnlResult.setBackground(Color.green);
					btn1.setVisible(false);
					btnRE.setVisible(true);
					count++;
					score.setText("점수: " + count);
				} else {
					lblResult.setText("오답");
					pnlResult.setBackground(Color.red);
					btn1.setVisible(false);
					btnRE.setVisible(true);
				}
			}
		});

		btnRE.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 a = r.nextInt(9) + 1;
				 b = r.nextInt(9) + 1;
				lblResult.setText("결과");
				pnlResult.setBackground(null);
				tf.setText("");
				lbl.setText(a + " + " + b + " = ? ");
				btn1.setVisible(true);
				btnRE.setVisible(false);
				
			}
		});
		pnlscore.setBackground(new Color(250,232,162));
		btnRE.setVisible(false);
		
		pnlscore.add(score);
		pnlResult.add(lblResult);
		pnlTop.add(lbl);
		pnlTop.add(pnlscore);
		pnlBottom.add(tf);
		pnlBottom.add(btn1);
		pnlBottom.add(btnRE);
		pnlBottom.add(pnlResult);

		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);

		add(pnlBox);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new quizquiz().setVisible(true);
	}
}