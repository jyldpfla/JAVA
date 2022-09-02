package kr.co.greenart.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository // user 정보를 보관하는 보관소
public class UserRepositoryListImple implements UserRepository {
	private List<User> list = new ArrayList<>();
	
	@Override
	public int add(User user) {
		return list.add(user) ? 1 : 0;
	}

	@Override
	public List<User> list() {
		return list;
	}
} 