// 문자 하나하나가 동일하게 이루어져 있는지 비교
public class StringEquals {
	public static void main(String[] args) {
		String a = "Hello"; // 문자는 참조를 함
		String b = "Hello"; 
		String llo = "llo";
		
		System.out.println (a == b); // 값이 같은지 확인하는 것이 아니라 a랑 b가 참조하는 대상이 같은지를 확인하므로 이렇게 비교하면 안됨
		// a와 b가 참조하는 대상이 같은지? a에서 만들어진 Hello라는 박스를 참조했으므로 같다고 나옴
		
		System.out.println(a == ("He" + llo)); // 값이 같지만 false가 나오는 이유 : 값은 같지만 참조하는 대상이 다르므로 false
		// a는 Hello를 가리키고 뒤 문자는 "He"와 "llo"를 합친 걸 참조 대상으로 가지므로 새로운 상자이므로 false로 나옴
		
		System.out.println("------- 문자열 값 동등 확인 -------");
		System.out.println(a.equals("He" + llo)); //자기 자신의 값과 ()에들어간 값이 같으면 true
	}
	
}

