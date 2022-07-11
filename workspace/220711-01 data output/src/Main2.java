import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 원시형 타입을 그대로 기록하는 input/output stream
public class Main2 {
	public static void main(String[] args) {
		DataOutputStream dos = null;
		// byte 단위 출력 -> int는 int형태로 출력하므로 사람이 보는 형태와 다름
		// but 읽을 때는 형변환 없으므로 편리
		
		try {
			dos = new DataOutputStream(new FileOutputStream("d:\\filetest\\mydata.dat"));
			
			dos.writeInt(50); // 정수를 정수형태로 출력
			dos.writeDouble(123.123); // 실수형으로
			dos.writeUTF("문자열"); // 문자형은 UTF
			dos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  finally {
			if(dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(new FileInputStream("d:\\filetest\\mydata.dat"));
			
			// 순서만 안다면 편하게 값 가져올 수 있음
			int valueInt = dis.readInt(); // int형 읽기
			double valueDouble = dis.readDouble();
			String valueString = dis.readUTF();
			
			System.out.println(valueInt); // 원시형 타입 그대로 읽어올 수 있음
			System.out.println(valueDouble);
			System.out.println(valueString);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
		// 파일형을 불러오는 메소드가 너무 다양하므로 파일의 끝을 알려주는 약속이 존재하기 힘듦 => 예외로 알려줌 EOFException(IOException의 자식), 따로 예외처리 해주면 됨
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
