// 2번
// 날짜 클래스
// 필드: 연도, 월, 일
// 메소드(기능) : "2022-05-27" 
//             "05/27/22"
// 				서식을 선택적으로 다양하게 출력할 수 있도록 생성

public class Date {
	int year;
	int month;
	int day;
	int choice;
	
	void printAll2 () {
		if (choice == 1) {
			System.out.printf("%d-%02d-%02d", year, month, day);
		} else {
			System.out.printf("%02d-%02d-%d", day, month, year % 100);
		} // %d 사이에 2넣으면 2칸차지, 0 넣으면 1자리수면 앞에 0 도출
		System.out.println();
	}
}