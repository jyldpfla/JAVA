import java.util.Deque;
import java.util.LinkedList;

public class Main4 {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>();
		// Deque -> stack 사용할 때
		stack.push("10"); // 값 넣어주기
		stack.push("20");
		stack.push("30");
		
		System.out.println(stack.pop()); // 제일 마지막 하나 튀어나오게!
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		// LinkedList안에 Queue, Stack, Deque 들어가 있음
		
		
		
		
	}
}
