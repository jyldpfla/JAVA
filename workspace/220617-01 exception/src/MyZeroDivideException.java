import java.time.LocalTime;

// 상속 사용하면 나만 사용 가능한 예외 생성 가능
public class MyZeroDivideException extends Exception {
	public MyZeroDivideException(String message) {
		super(message + ", " + LocalTime.now() + "에 발생하였음");
	}
}
