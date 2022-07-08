import java.io.File;

import javax.swing.JFileChooser;

public class Main {
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
//		chooser.showOpenDialog(null);  
		int result = chooser.showSaveDialog(null); // 저장창을 보여줌, int값 반환
		// 사용자가 열기, 저장을 하면 0이 나옴, 나머진 1
		if (result == JFileChooser.APPROVE_OPTION) {
			System.out.println(result);

			File file = chooser.getSelectedFile();
			System.out.println("사용자가 선택한 파일 : " + file.getAbsolutePath());
			// 선택한 파일을 알려주는 것, 저장한 것 아님
		}
	}
}
