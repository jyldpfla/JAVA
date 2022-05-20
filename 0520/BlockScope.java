// 중괄호의 범위, 지역 변수
public class BlockScope {
	public static void main(String[] args) {
		int a= 10; // 지역 변수, a/b는 범위가 다름
		{
			int b = 20; // 지역 변수: 범위 밖으로 나가면 사라지므로, 범위 안에서 만들어진 변수는 범위가 끝나는 순간 사라짐
			
			int a = 99; //지역 변수 안 범위에서 똑같은 이름의 변수 가질 수 없음
			System.out.println("가능한가?");
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(b); // 지역 변수의 바깥 범위이므로 에러
		{
			{{
				{
					{
						System.out.println("이건??"); //중괄호 개수 상관없이 짝 맞으면 위에서 아래로 순차적으로 실행됨
					}
				}
			}}
		}
	}
}