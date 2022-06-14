package student;
public class Student {
	private String name;
	private int studentId;
	private String department;
	private int grade;
	private int credits;
	
	public Student(String name, int studentId, String department, int grade, int credits) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.department = department;
		this.grade = grade;
		this.credits = credits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public String toString() {
		return "이름: " + name + ", 학번: " + studentId + ", 소속 학과: " + department + ", 학년: " + grade + "학년, 이수 학점: " + credits;
	}
}
