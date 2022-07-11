import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// p.644 2번
public class Main7_2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		for(char a = 65; a <= 87; a++) {
			String c = Character.toString(a);
			String d = Character.toString((char) (a + 3));
			map.put(c.toLowerCase(), d);
		}
		map.put("x", "A");
		map.put("y", "B");
		map.put("z", "C");
		map.put(" ", " ");
		map.put("\n", "\n");
		map.put("\r", "\r");
		System.out.println("맵: " + map);
	
		BufferedReader br = null;
		List<Integer> list = new ArrayList<>();
		List<String> alphabet = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(new File("d:\\filetest\\Hello.txt")));
			int line;
			while (( line = br.read() )!= -1) { // 한 줄의 문자열을 읽을 수 있는 메소드, 파일 끝을 만나면 null을 반환;
				System.out.println((char)line);
				String a = map.get(Character.toString((char)line));
				System.out.println(a);
				alphabet.add(a);
			}
			System.out.println(alphabet);
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
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter(new File("d:\\filetest\\Hello.txt")));
			for(int i = 0; i < alphabet.size(); i++) {
				pw.write(alphabet.get(i));				
			}
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
	}
}
