import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
		
		list.remove(0);
		
		list.remove("C");
		
		LinkedList<String> down = (LinkedList<String>) list; // 다운캐스팅
		down.addFirst("asdf");
		down.removeFirst();
		down.getFirst();
	}
}
