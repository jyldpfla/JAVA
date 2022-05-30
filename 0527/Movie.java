// 3번
// 영화
// 제목, 평점, 감독, 발표된 연도
// 모든 값을 콘솔 출력하는 기능

public class Movie {
	String title2;
	int rating; // 쌤은 double로 하셨움
	String director;
	int year2;
	
	public Movie(String t
					, double s 
					, String d
					, int p) {
		// 필드 초기화 <<
		String title22 = t;
		double score = s;
		String director22 =d;
		int publishYear = p;
		
	}
		
	void printAll3 () {
		System.out.println("영화 제목: " + title2);
		System.out.println("영화 평점: " + rating);
		System.out.println("영화 감독: " + director);
		System.out.println("개봉 연도: " + year2);
	}
}