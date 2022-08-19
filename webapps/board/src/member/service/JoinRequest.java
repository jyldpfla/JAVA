package member.service;

import java.util.Map;

public class JoinRequest {
	private String id;
	private String name;
	private String password;
	private String confirmPassword;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	public boolean isPasswordEqualToConfirm() {
		return password != null && password.equals(confirmPassword);
	}
	
	public void validate(Map<String, Boolean> errors) {
		// 필드들을 checkEmpty메소드에 전달해서 값이 비어있는지 확인함 -> 유효범위 확인
		checkEmpty(errors,id,"id");
		checkEmpty(errors, name, "name");
		checkEmpty(errors, password, "password");
		checkEmpty(errors, confirmPassword, "confirmPassword"); // 비밀번호 확인
		if(!errors.containsKey("confirmPassword")) {
			if(!isPasswordEqualToConfirm()) {
				errors.putIfAbsent("notMatch", Boolean.TRUE);
			}
		}
	}
	
	public void checkEmpty(Map<String, Boolean> errors, String value, String fieldName) {
		System.out.println(value);
		if (value == null || value.isEmpty()) {
			errors.put(fieldName, Boolean.TRUE); // true면 문제가 있는 것 -> errors라는 map에 값 들어감
		}
	}
}
