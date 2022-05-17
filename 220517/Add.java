//60p Add.java 타이핑

public class Add {
    public static void main(String args[]) {
	// int : 정수형 data type(자료형)
	// 변수이름 : 영소문자로 시작(대소문자 구별),그 뒤에 숫자도 올 수 있음, 공백x (ex. bookTitle(전치사제외)), 특수문자x(-,_까지 가능), 의미가 있는 단어 안됨(ex, int int(x))
	int x; // 변수 선언(variable declare) 박스의형태 변수의이름
	int y;  // 두 번째 정수를 저장할 변수
	int sum; // 두 정수의 합을 저장하는 변수
	
	// 초기화 (initialize): 변수에 제일 먼저 값을 집어넣는 것, 초기화가 없으면 컴파일러가 에러냄
	x = 100; // = : 대입연산자 (assignment), 오른쪽에 있는 것을 왼쪽으로 집어넣는다  
	y = 200;
	sum = x + y; 

	System.out.println(sum); //"없이 변수 호출
	// return; //끝 돌아가시오!, 생략가능(뒤에 써도 도달 불가)

	System.out.println(x - y); // 연산결과 바로 출력

	int minus;
	minus = x - y;
	System.out.println(minus); // 박스에 담아두었다가 변수 이름으로 필요할 때 출력하기, 계산 결과 기억 + 필요할 때마다 이름으로 확인이 필요하면 선언하는 것이 유리
    }
}
