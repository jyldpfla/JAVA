package kr.co.greenart.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

// 유효성 체크 객체
@Component
public class UserValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz); // 어떤 타입으로 줄건지 정해주는 것 -> 타입 검사
	}

	@Override
	public void validate(Object target, Errors errors) {
		// target : 유효성 체크할 객체, errors : 메세지 심어줌
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.empty", "이름을 입력하세요");
		// rejectIfEmptyOrWhitespace : String이 아예 빈공간이거나,공백이 있을때, error객체에 error와 code를 넣어줌
		// error객체, 필드명, 임의로지어준 에러코드, default message순으로 넣기
		
		// 문자열길이, int값 등은 직접 써줘서 유효성 검사해야함
		User user = (User) target;
		if (user.getName().length() > 5) {
			errors.rejectValue("name", "name.toolong", "이름이 너무 깁니다.");
			// 필드명 써줘야 찾을 수 있음
		}
		if (user.getAge() > 200) {
			errors.rejectValue("age", "age.tooold", "나이 범위를 초과했습니다.");
		}
	}

}
