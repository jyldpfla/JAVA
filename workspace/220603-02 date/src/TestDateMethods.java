//import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.util.Calendar;
//import java.util.Date;

public class TestDateMethods {
	public static void main(String[] args) {
		// 내일의 날짜 객체
		LocalDate today = LocalDate.now();
		System.out.println("today: " + today);
		LocalDate tomorrow = today.plusDays(1);
		System.out.println("tomorrow: " +tomorrow);
		
		// 쌤 답 - LocalDate
		// 1. LocalDate tomorrow = LocalDate.of(2022, 6, 4);
		// 2.
		// LocalDate now = LocalDate.now();
		// now라는 값을 변경불가능 setter가 없으므로 안심하고 사용
		// LocalDate nowPlusOne = now.plusDays(1); // now : 오늘
		// 자기의 값을 변경하는 것이 아닌 새로운 인스턴스를 하나 만들어서 값을 반환
		// DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		// String result = dateFormat.format(nowPlusOne);
		// System.out.println(result);
		
		// 쌤 답 - Calendar
		// Calendar now = Calendar.getInStance();
		// 자기의 값이 변경되므로 참조하는 값들은 변경될 수 있음
		// now.set(2022, Calendar.JUNE, 4);
			// set을 통해 하나하나 변경 가능
		// now.add(Calendar.DAY_OF_MONTH, 1);
		// Date date = now.getTime();

		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 형식 설정
		// String result = dateFormat.format(date); // 값 전달
		// System.out.println(result); // 문자열 서식으로 반환

	}
}
