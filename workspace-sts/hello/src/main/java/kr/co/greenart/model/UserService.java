package kr.co.greenart.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// UserService : 사용자 목록 관리, 추가할 수 있는 기능을 관리하는 객체
@Service
public class UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository repo; // interface로 달라고 하면 구현체를 찾아서 넣어줌
	// 저장소를 구현체로 가져올 수 있도록 함
	
	public List<User> list() {
		logger.info("--유저 목록 불러오기 --"); // 목록 불러온다는 기능을 가짐
		return repo.list(); // 목록을 저장소 객체를 이용해 가져오도록 되어있음 -> 저장소를 필요로 함
	}
	
	public int add(User user) {
		logger.info("--유저 추가하기--");
		return repo.add(user);
	}
}
