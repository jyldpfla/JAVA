//class Date {
//	int year;
//	int month;
//	int day;
//	public int getYear() {
//		return year;
//	}
//	public int getMonth() {
//		return month;
//	}
//	public int getDay() {
//		return day;
//	}
//}

import java.time.LocalDate;
import java.util.Calendar;

public class Main {
//	static {
//		System.out.println("스태틱 블록안입니다.");
//	}
//	
//	public void print() {
//		System.out.println("non-static");
//	} // 동적인 건 문장을 만나야 그 때서야 만들어짐
//	
//	public static void printStatic() {
//		System.out.println("static");
//	}
	
	public static void main(String[] args) {
		// java.util.Calendar
//		Calendar now = Calendar.getInstance();
		// getInstance: 오늘 날짜 객체를 만들어줌, static method
		
		// now.get(field);
		// field칸에 정수를 넣게
		
//		System.out.println("상수값 확인 : " + Calendar.YEAR);
		
//		System.out.println(now.get(Calendar.YEAR)); // 오늘의 연도
//		System.out.println(now.get(Calendar.MONTH) + 1); // 오늘의 달
//		// 1월을 0으로 만들어서 +1 해줌
//		System.out.println(now.get(Calendar.DAY_OF_MONTH)); // 오늘의 일자
//		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 요일(일~토)
		
		// java.time.LocalDate
		LocalDate now = LocalDate.now();
		//now 메소드 : static 메소드
		System.out.println(now.getYear());
		
		System.out.println(now.getMonth());
		// getMonth라는 객체를 둠
		System.out.println(now.getMonthValue());
		
		System.out.println(now.getDayOfMonth());
		
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfWeek().getValue());
		

	}

}
