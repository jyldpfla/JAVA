import java.util.Arrays;

class Member implements Comparable<Member> {
	String name; // 이름
	int height; // 키
	int weight;	// 몸무게
	
	public Member(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	// 키~를 기준
//	public ??? 비교(대상 다른멤버) {
//		if return 내가 큼
//		else if return 쟤가 큼
//		else return 똑같음  //3개를 나타내므로 boolean 아님
//	}
//	public int compare(Member member) {
//		return height - member.height; // 크면 양수, 같으면 -, 작으면 음수
//	} // 나오는 숫자로 대소비교 가능 -> 메소드로 정의
	@Override
	public int compareTo(Member o) {
		// 원래 head는 파라미터가 Object로 되어있어서 <>선언해주어야 Member형으로 사용 가능
		return this.height - o.height;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Member)) {
//			return false;
//		}
//		Member other = (Member) obj;
//		if (height != other.height) {
//			return false;
//		}
//		if (name == null) {
//			if (other.name != null) {
//				return false;
//			}
//		} else if (!name.equals(other.name)) {
//			return false;
//		}
//		if (weight != other.weight) {
//			return false;
//		}
//		return true;
//	}
}

public class Main {
	public static void main(String[] args) {
		Member[] members = {new Member("키큰놈", 190, 60)
				, new Member("키작은놈", 130, 20)
				, new Member("중간쯔음", 176, 65)
		};
//		System.out.println(members[0].compareTo(members[1]));
		Arrays.sort(members);
		System.out.println(members[0].height);
		System.out.println(members[1].height);
		System.out.println(members[2].height);
	}
}



