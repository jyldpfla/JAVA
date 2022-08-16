public class MulDiv {
    public static void main(String[] args) {
	//System.out.println("ABC" / 5);
	System.out.println(50 / 0); //예외적인 상황을 만나면 프로그램이 종료됨
	
	System.out.println("10 곱하기 5는 " + 10 * 5);
	System.out.println("22 나누기 4는 " + 22 / 4); // 소수점 안 보임
	System.out.println("22 나누기 4는 " + 22.0 / 4.0); // 소수점까지 보고 싶을 때
	System.out.println("프로그램 정상 종료");
    }
}

