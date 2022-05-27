// 객체 만들기

public class Box {
	// 가로, 세로, 높이를 가지고 있다고 명명
	int length;
	// 값/상태 -? 멤버변수 (member variable) / 필드 (fields)
	int width;
	int height;
	int volume = length * width * height;
	
	// 메소드/기능 or 동작
	public void printAllState() { //public 타입 이름
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
	}
	
	// 박스는 자기자신의 부피를 구해서 정수형 값으로 알려줄 수 있음 (반환)
	public int getVolume() {
		return width * length * height;
		
		// return volume; 하고 TestBox에서 값을 넣고 volume 구해도 0이 나오는 이유
		// 인스턴스화를 하면 Box{} 안을 읽는데, 선언을 int length; 값을 주지 않고 초기화만 했기때문에, 인스턴스화를 할 때 값을 0이라고 임의로 지정
		// 그 상태로 순차적으로 읽으면 0*0*0이 된 상태로 return 값이 이미 나온 상태이므로, TestBox에서 값을 줘도 순서가 뒤에 있으므로 volume 명령 재수행x
		// 0으로 그대로 출력
	}
} 
