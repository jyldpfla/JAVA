import java.util.Arrays;
import java.util.Comparator;

// 멤버 관리 프로그램
// 키 순(오름차순)으로 멤버를 조회하기
//----------------------------------
// 몸무게 순(오름차순)으로 멤버를 조회하기 << 어제거랑 위에거 다 하고 난 후~~
class WeightComparator implements Comparator<Member> {
	// downcasting 대신 generic 이용
	@Override
	public int compare(Member o1, Member o2) {
		return o1.weight - o2.weight;
	}	
}

//class NameComparator implements Comparator<Member> {
//	@Override
//	public int compare(Member o1, Member o2) {
//		return o1.name.compareTo(o2.name); // compareTo가 name안에 메소드 만들어뒀으므로 호출
//		// String은 compareTo를 원래 implement하고 있으므로 바로 사용 가능
//	}
//}
public class OrderByWeightMember {
	public static void main(String[] args) {
		Member[] members = { new Member("키큰놈", 190, 60)
				, new Member("키작은놈", 130, 30)
				, new Member("중간쯔음", 176, 65)
		};
	
		WeightComparator comparator = new WeightComparator(); // 대소비교할 인터페이스 생성
		int result = comparator.compare(members[0], members[1]);
		System.out.println(result);
		
		Arrays.sort(members, comparator); // member의 참조를 comparator에게 전달 + compartor로 비교해서 정렬
		System.out.println(members[0].weight);
		System.out.println(members[1].weight);
		System.out.println(members[2].weight);
		
//		Comparator<Member> c = new Comparator<Member>() { // 이 인스턴스를 Comparator형으로 참조
//			// c : 참조형 지역변수
//			@Override
//			public int compare(Member o1, Member o2) {
//				return o1.name.compareTo(o2.name);
//			}
//		};
//		// // 이름이 없고 인터페이스를 구현하고 있는 클래스라서 인스턴스화 가능
		
		Arrays.sort(members, new Comparator<Member>() { // 익명 클래스(anomymous class)
			@Override
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name);
			}
		}); // member의 참조를 comparator에게 전달 + compartor로 비교해서 정렬
		System.out.println(members[0].name);
		System.out.println(members[1].name);
		System.out.println(members[2].name);
	}
}
