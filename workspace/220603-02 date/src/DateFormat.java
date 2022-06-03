import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Calendar; // 시간, 날짜 표현 가능
import java.util.Date;


public class DateFormat {
	public static void main(String[] args) {
//		LocalDate date = LocalDate.now();
//		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		//DateTimeFormatter : 메소드를 통해서 불러옴, 생성자를 직접 부르지 않음
//		String result = dateFormat.format(date);
//		System.out.println(result);
		
		Calendar cal = Calendar.getInstance(); // 날짜 
		Date date = cal.getTime(); // 시간, public한  getter를 만듦
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 형식 설정
		String result = dateFormat.format(date); // 값 전달
		System.out.println(result); // 문자열 서식으로 반환
	}
}
