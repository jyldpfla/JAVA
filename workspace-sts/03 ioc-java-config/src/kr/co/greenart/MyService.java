package kr.co.greenart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service // 부가 설명을 위해 Component 이름만 변경 
public class MyService {
	@Autowired // 의존성 부여
	@Qualifier(value = "mylist") // 특정한 객체를 찾기 위한 이름 지정
	private MyDataRepository repo;
	
	public Iterable<Integer> numberService() {
		return repo.getMyNumbers();
	}
}
