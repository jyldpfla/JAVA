// 이진호 학우님꺼!
package sanswer2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp extends JFrame {
	public SignUp(HashMap<String, Info> map) {
		super("회원가입");
		JPanel pnl = new JPanel();
		JPanel pnlall = new JPanel();
		JPanel pnltf = new JPanel();
		JPanel pnlbtn = new JPanel();
		JLabel lblID = new JLabel("아이디");
		JTextField signUpTf = new JTextField(10);
		JLabel lblPassword = new JLabel("비밀번호");
		JPasswordField signUpPf = new JPasswordField(10);
		JLabel lblPasswordConfirm = new JLabel("비밀번호 확인");
		JPasswordField pfConfirm = new JPasswordField(10);
		JButton btnUp = new JButton("회원가입");
		JButton btnCancel = new JButton("취소");

		BoxLayout boxpnl = new BoxLayout(pnlall, BoxLayout.Y_AXIS);
		BoxLayout boxtf = new BoxLayout(pnltf, BoxLayout.Y_AXIS);

		pnltf.setLayout(boxtf);
		pnlall.setLayout(boxpnl);

		btnUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!String.valueOf(pfConfirm.getPassword()).equals(String.valueOf(signUpPf.getPassword()))) {
					JOptionPane.showMessageDialog(SignUp.this, "비밀번호 확인이 비밀번호와 다릅니다.");
				} else if (signUpTf.getText().length() < 4 || signUpTf.getText().length() > 12) {
					JOptionPane.showMessageDialog(SignUp.this, "ID는 4자 이상 12자 이하로 해야 합니다.");
				} else if (String.valueOf(signUpPf.getPassword()).length() < 4 || String.valueOf(signUpPf.getPassword()).length() > 12) {
					JOptionPane.showMessageDialog(SignUp.this, "비밀번호는 4자 이상 12자 이하로 해야 합니다.");
				} else if (map.containsKey(signUpTf.getText())) {
					JOptionPane.showMessageDialog(SignUp.this, "이미 있는 ID입니다.");
				} else {
					JOptionPane.showMessageDialog(SignUp.this, "회원가입을 축하합니다.");
					map.put(signUpTf.getText(), new Info(signUpTf.getText(), String.valueOf(signUpPf.getPassword())));
					dispose();
				}
			}
		});
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(SignUp.this, "회원가입을 취소합니다.");
				dispose();
			}
		});

		pnltf.add(lblID);
		pnltf.add(signUpTf);
		pnltf.add(lblPassword);
		pnltf.add(signUpPf);
		pnltf.add(lblPasswordConfirm);
		pnltf.add(pfConfirm);
		pnlbtn.add(btnUp);
		pnlbtn.add(btnCancel);

		pnlall.add(pnltf);
		pnlall.add(pnlbtn);
		pnl.add(pnlall);

		add(pnl);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}