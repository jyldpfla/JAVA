
public class Main2T {
	public static void main(String[] args) {
		CupNoodle c1 = new CupNoodle("농심", "육개장", 1000);
		CupNoodle c2 = new CupNoodle("삼양", "육개장", 1200);
		CupNoodle c3 = new CupNoodle("농심", "육개장", 800);
		
		System.out.println(c1.toString());
//		System.out.println(c1.hashCode());
		System.out.println(c2);
		System.out.println(c3);
		
//		System.out.println(c1 == c2);
//		System.out.println(c1 == c3);
		System.out.println(c1.equals(c1));
		System.out.println(c1.equals(c3));
	}
}
