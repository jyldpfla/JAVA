// 1~10000까지 출력하세요.


public class Loop2 {
	public static void main(String[] args) {
		/*
		int i = 1;
		while (i <= 10000) {
			System.out.println(i);
			i++;
		}
		*/
		
		
		// 20 ~ 29까지 출력하기
		/*
		int j = 20;
		while (j <= 29) {
			System.out.println(j);
			j++;
		}
		*/
		
		// 10 9 8 ~~~ 0 까지
		/*
		int k = 10;
		while (k >= 0) {
			System.out.println(k);
			k--;
		}
		*/
		
		//3의 배수를 출력해보세요 ~~ 무한히
		/*
		int l = 1;
		while(true) {
			System.out.println(l * 3);
			l++;
		}
		*/
		
		/*
		int l = 0;
		while(true) {
			System.out.println(l);
			l += 3;
		}
		*/
		
		//0 ~ 100미만의 정수 중 3의 배수를 출력해보세요.
		/*
		int l = 0;
		while(l < 100) {
			System.out.println(l);
			l += 3;
		}
		*/
		
		//☆★순으로 8개 출력해보세요.
		/*
		int m = 0;
		while (m < 8) {
			System.out.print("☆★");
			m++;
		}
		*/
		
		int q = 0;
		while (q < 8) {
			System.out.println( (q % 2 == 0) ? "☆" : "★" );
			q++;
		} //홀짝을 이용해서 조건에 맞게 출력
	} 
	
} 




