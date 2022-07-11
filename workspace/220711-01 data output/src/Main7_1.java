import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//p.644 1번

public class Main7_1 {
	public static void main(String[] args) {
		DataInputStream dis = null;
		List<Integer> numberList = new ArrayList<>();
		
		try {
			dis = new DataInputStream(new FileInputStream(new File("d:\\filetest\\numbers.txt")));
		
			while (true) {
				String a = dis.readLine();
				Integer num = Integer.valueOf(a);
				System.out.println(num);
				numberList.add(num);
			}
		} catch (NumberFormatException e) {
			System.out.println("오류났지롱 메롱");
		}catch (EOFException e) {
			System.out.println("꺅");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Collections.sort(numberList);
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileOutputStream(new File("d:\\filetest\\numbers.txt")));
			
			for(int i = 0; i < numberList.size(); i++) {
				pw.println(String.valueOf(numberList.get(i).toString()));
			}
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				pw.close();
		}
	}
}
