public class UnderGraduate extends Student {
	private String club;

	public UnderGraduate(String name, int studentId, String department, int grade, int credits, String club) {
		super(name, studentId, department, grade, credits);
		this.club = club;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
	
	public String toString() {
		return super.toString() + ", 소속 동아리: " + club;
	}
}
