public class Graduate extends Student {
	private String assistant;
	private double scholarship;
	
	public Graduate(String name, int studentId, String department, int grade, int credits, String assistant,
			double scholarship) {
		super(name, studentId, department, grade, credits);
		this.assistant = assistant;
		this.scholarship = scholarship;
	}

	public String getAssistant() {
		return assistant;
	}

	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}

	public double getScholarship() {
		return scholarship;
	}

	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}
	
	public String toString() {
		return super.toString() + ", 조교 유형: " + assistant + ", 장학금 비율: " + scholarship;
	}
}
