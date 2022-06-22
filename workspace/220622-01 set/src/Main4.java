import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
		// 두 개의 모든 Set값을 포함하는 Set을 만들고 싶을 때 -> for-each문, iterator, addAll 사용
		
		Set<Integer> setUnion = new HashSet<>();
		setUnion.addAll(setA);
		setUnion.addAll(setB);
		
		System.out.println(setUnion);
		
		// 교집합
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setA);
		// retainAll() : 두 Set이 가지고 있는 중복되는 원소만 남기고 지워줌, 교집합만 남도록
		
		// 차집합(중복되지 x값만)
		Set<Integer> setLeftOuter = new HashSet<>();
		setLeftOuter.addAll(setA);
		setLeftOuter.removeAll(setB);
		// removeAll() : 한 Set의 원소들에서 다른 Set과 중복되는 원소는 전부 지워줌, 차집합(중복되지 않는 부분)만 남도록
		System.out.println(setLeftOuter);
		
		Set<Integer> setSame = new HashSet<>(Arrays.asList(7, 6, 5, 4, 3, 2, 1));
		System.out.println(setSame.equals(setUnion));
	}
}
