import java.util.Scanner;

public class Member {
	private String name;
	private double height;
	private double weight;
	private double bmi;
	private double bmiI;
	
	public Member() {}
	
	public Member(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double bmi() {
		bmiI = weight / (height * height);
		return Math.round(bmiI * 100.0) / 100.0; // Math.round : 반올림, 100.0으로 쓰면 뒤에 소수점 자리 1개면 2번째 자리에서 반올림해서 1개만 보여줌
	}
	
	// 고도 비만: 35 이상
	// 중도 비만 (2단계 비만) : 30 이상 - 35 미만
	// 경도 비만 (1단계 비만) : 25 이상 - 30 미만
	// 과체중 : 23 이상 - 25 미만
	// 정상 : 18.5 이상 - 23 미만
	// 저체중 : 18.5 미만
	public String bmiIndex() {
		if (bmiI >= 35) return "고도 비만";
		else if (bmiI >= 30) return "중도 비만";
		else if (bmiI >= 25) return "경도 비만";
		else if (bmiI >= 23) return "과체중";
		else if (bmiI >= 18.5) return "정상";
		else return "저체중";
	}
}
