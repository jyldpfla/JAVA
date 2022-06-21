// 일기 관리 프로그램
// 일기 (날짜, 제목, 날씨, 내용 등등)

// 일기 등록
// 같은 일자에는 일기 중복x

// 일기 목록도 볼 수 있음.
// 날짜 순
// 내용 길이 순

// 날짜를 선택해서 해당 일기 내용을 수정 가능

// 삭제 - 가장 오래된 일기가 삭제됨.
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Diary {
	private int date;
	private String title;
	private String weather;
	private String contents;
	
	public Diary(int date, String title, String weather, String contents) {
		super();
		this.date = date;
		this.title = title;
		this.weather = weather;
		this.contents = contents;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Diary> list = new LinkedList<>();
		
			while (true) {
			System.out.println("-------------------------------");
			System.out.println("1. 일기 등록");
			System.out.println("2. 일기 목록");
			System.out.println("3. 일기 수정");
			System.out.println("4. 일기 삭제");
			System.out.println("5. 프로그램 종료");
			int a = scan.nextInt();
			
			if(a == 1) {
				System.out.println("몇 개의 일기를 입력하시겠습니까?");
				int count = scan.nextInt();
				for(int i = 1; i <= count; i++) {
				System.out.println("날짜를 입력하세요.(8자리 수로 입력)");
				int d = scan.nextInt();
				
				scan.nextLine();
				
				System.out.println("제목을 입력하세요.");
				String t = scan.nextLine();
				
				System.out.println("날씨를 입력하세요.");
				String w = scan.nextLine();
				
				System.out.println("내용을 입력하세요.");
				String c = scan.nextLine();
				
				list.add(new Diary(d, t, w, c));
				System.out.println("날짜: " + d + ", 날씨 : " + w + "\n제목: " + t + "\n" + c );
				}
			} else if (a == 2) {
				System.out.println("1. 날짜 순 출력   2.내용 길이 순 출력");
				int choice = scan.nextInt();
				if(choice == 1) {
					Comparator<Diary> comparator = new Comparator<Diary>() {
						@Override
						public int compare(Diary o1, Diary o2) {
							return o1.getDate() - o2.getDate();
						}
					};
					Collections.sort(list, comparator);
					System.out.println(list);
				}
			} else if(a == 3) {
				
			} else if (a == 4){
				
			} else {
				break;
			}
		}
	}
}
