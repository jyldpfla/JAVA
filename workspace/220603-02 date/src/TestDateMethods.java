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
		// LocalDate nowPlusOne = now.plusDays(1); // now : 오늘
		
		// 쌤 답 - Calendar
		// Calendar now = Calendar.getInStance();
		// now.set(2022, Calendar.JUNE, 4);
			// set을 통해 하나하나 변경 가능
		// now.add(Calendar.DAY_OF_MONTH, 1);
		// Date date = now.getTime();

		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 형식 설정
		// String result = dateFormat.format(date); // 값 전달
		// System.out.println(result); // 문자열 서식으로 반환
		
	}
}
