package kr.co.greenart.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class User {
	// 유효성 검사 필드 위에 써주기!
	@NotBlank(message = "이름을 입력해주세요") // 공백이거나 비어있으면 error
	@Size(min = 1, max = 4, message = "이름은 1 ~ 4자 사이여야 합니다.") // 문자열 길이
	private String name;
	@Positive(message = "양수를 입력해주세요") // 양수 조건
	@Max(value = 100, message = "최대값(100)을 초과했습니다.") // 최대값
	private int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
