/*
	오늘:2022-06-03 금
	일  월   화   수   목   금   토
	         01 02 03 04 
	05 06 07 08 09 10 11 
	12 13 14 15 16 17 18 
	19 20 21 22 23 24 25 
	26 27 28 29 30
 */
// 이번 달
// 1일의 요일
// 마지막 일(한 달에 며칠이나 있는지)

// 응용: 원하는 달마다 달력 입출력되도록

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class PrintCalendar {
	public static void main(String[] args) {
		// 오늘 날짜
		LocalDate today = LocalDate.now();
		// 오늘 날짜 형식 설정
		String day = today.format(DateTimeFormatter.ofPattern("오늘:yyyy-MM-dd E", Locale.KOREAN));
		// 이번 달 첫 날짜
		LocalDate day1 = LocalDate.of(2022, 6, 1);
		// 이번 달 첫 날 요일
		int day11 = day1.getDayOfWeek().getValue();
		// 이번 달 일수 
		int month = today.lengthOfMonth();
		
		// 오늘 날짜,요일 출력
		System.out.println(day);
		// 일~토 출력
		System.out.println("일    월    화    수    목    금    토");
		/*for(int j = 0; j <= day11;j++) {
			System.out.print(" ");
		}*/
		
		for(int i = 1; i <= month;i++) {
			System.out.printf("%02d ", i);
			if(i % 7 == 0) {
				System.out.println();
			}
		}	
	}
}
