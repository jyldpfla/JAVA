//p110 ~ 111
public class StringSwitch {
	public static void main(String[] args) {
		String month = "february";
		
		int monthNumber;
		switch (month) {
			case "january":
				monthNumber = 1;
				break;
			case "february":
			System.out.println("asdf");
				monthNumber = 2;
				break;
			case "march":
				monthNumber = 3;
				System.out.println("b");
				break;
			default:
				monthNumber = 0;
				break;
		}
		System.out.println(monthNumber);
	}
}