/*
1번
*
**
***
****
*****
*/

public class Star1 {
	public static void main(String[] args) {
		String s = "*";
		int i = 1;
		while (i <= 5) {
			System.out.println(s);
			s = s + "*";
			i++;
		}
	}
}