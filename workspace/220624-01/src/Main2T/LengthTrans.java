// 장호 학우 답!
package Main2T;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

// cm to inch일 경우 결과값은 input.getText()*0.393701
// inch to cm일 경우 결과값은 input.getText()*2.54

public class LengthTrans extends JFrame {
	boolean check;
	double a;
	public LengthTrans() {
		JPanel pnl = new JPanel();
		JRadioButton cmToInch = new JRadioButton("cm -> inch");
		JRadioButton inchToCm = new JRadioButton("inch -> cm");
		JButton translate = new JButton("변환");
		ButtonGroup group = new ButtonGroup();
		JTextField input = new JTextField("값을 입력하세요");
		JLabel result = new JLabel("결과 영역");
		
		group.add(cmToInch);
		group.add(inchToCm);

		// 입력값에 기본값으로 값을 입력하세요 라고 지정 한 후 focus가 되었을때 아무것도 없는창
		// 만약 아무것도 입력하지 않은 경우 focus를 잃으면 다시 값을 입력하세요 라고 나오게 한다.
		input.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if (input.getText().equals("")) {
					input.setText("값을 입력하세요");
				}	
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if (input.getText().equals("값을 입력하세요")) {
					input.setText("");
				}
			}
		});
		
		 // ItemListener는 상태가 바뀔때 가능한 것이다. ItemListener의 상태변화값을 boolean check로 두었다.
		cmToInch.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				input.setText("값을 입력하세요");
				result.setText("결과 영역");
				check = e.getStateChange() == ItemEvent.SELECTED;
				System.out.println(check);
			}
		});
		
		
		translate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("결과 영역");
				// 체크 됐고 값을 입력 했을때만 설정되게 하는 조건문!
				if(check && !input.getText().equals("값을 입력하세요")) {
					a = Integer.valueOf(input.getText()) * 0.393701;
					System.out.println(a);
				} else if(!check && !input.getText().equals("값을 입력하세요")) {
					result.setText("결과 영역");
					a = Integer.valueOf(input.getText()) * 2.54;
					System.out.println(a);
				}
				// 소수 첫번째 자리까지만!
				result.setText("변환됨" + Math.round(a*100)/100.0);
				
			}
		});
		
		///////////////// 레이아웃 /////////////////
		SpringLayout sl_pnl = new SpringLayout();
		sl_pnl.putConstraint(SpringLayout.NORTH, result, 30, SpringLayout.SOUTH, input);
		sl_pnl.putConstraint(SpringLayout.SOUTH, result, 53, SpringLayout.SOUTH, input);
		sl_pnl.putConstraint(SpringLayout.EAST, result, 0, SpringLayout.EAST, translate);
		sl_pnl.putConstraint(SpringLayout.SOUTH, input, 80, SpringLayout.SOUTH, cmToInch);
		sl_pnl.putConstraint(SpringLayout.EAST, input, 0, SpringLayout.EAST, translate);
		sl_pnl.putConstraint(SpringLayout.WEST, result, 0, SpringLayout.WEST, cmToInch);
		sl_pnl.putConstraint(SpringLayout.NORTH, input, 40, SpringLayout.SOUTH, cmToInch);
		sl_pnl.putConstraint(SpringLayout.WEST, input, 0, SpringLayout.WEST, cmToInch);
		sl_pnl.putConstraint(SpringLayout.NORTH, translate, 5, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, translate, 229, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, inchToCm, 5, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, inchToCm, 135, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, cmToInch, 5, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.WEST, cmToInch, 41, SpringLayout.WEST, pnl);
		///////////////// 레이아웃 /////////////////
		
		pnl.setLayout(sl_pnl);

		pnl.add(cmToInch);
		pnl.add(inchToCm);
		pnl.add(translate);
		pnl.add(input);
		pnl.add(result);
		
		getContentPane().add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
		
	public static void main(String[] args) {
		new LengthTrans().setVisible(true);
	}

}

