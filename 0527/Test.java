// 위의 클래스를 테스트할 수 있는 main메소드를 포함하는 클래스를 작성하고
// 인스턴스화 하여, 필드값을 대입연산 후 출력메소드를 호출하여 콘솔에서 값 확인.

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Book book1 = new Book();
		System.out.println("책 제목과 저자를 입력하세요.");
		book1.title = scan.nextLine();
		book1.author = scan.nextLine();
		book1.printAll();
		
		Date date1 = new Date();
		System.out.println("연도, 월, 일을 입력하세요.");
		date1.year = scan.nextInt();
		date1.month = scan.nextInt();
		date1.day = scan.nextInt();
		System.out.println("원하는 출력 방식을 선택하세요. \n 1.nnnn-nn-nn 2. nn/nn/nn");
		date1.choice = scan.nextInt();
		date1.printAll2();
		
		Movie movie1 = new Movie();
		System.out.println("영화의 제목, 평점(5점 기준), 감독, 연도를 입력하세요.");
		scan.nextLine();
		movie1.title2 = scan.nextLine();
		movie1.rating = scan.nextInt();
		movie1.director = scan.next();
		movie1.year2 = scan.nextInt();
		movie1.printAll3();
		
	}
}