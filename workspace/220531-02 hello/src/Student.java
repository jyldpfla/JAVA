
public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student(String name) {
		this.name = name;
	}
	// 이름만 변경할 수 있는 생성자, 기본값 없으므로 int값 나머지 0으로 나옴

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getAverage() {
		return getSum() / 3;
	}

	public int getSum() {
		return (kor + eng + math);
	}
}