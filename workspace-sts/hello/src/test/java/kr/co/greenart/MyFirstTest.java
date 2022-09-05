package kr.co.greenart;

import static org.junit.Assert.*;

import org.junit.Test;

import kr.co.greenart.model.User;

public class MyFirstTest {

	@Test // test 할 것 표시
	public void test() {
//		fail("Not yet implemented"); // fail : 무조건 실패하는 테스트
		
		// a, b 가 있을 때 합 연산 + 기대값을 두고 합 연산 잘 되었는지 확인
		int a = 10;
		int b = 20;
		
		int sum = a + b;
		assertEquals(30, sum); // 기대값과 실제값을 전달 받아서 같으면 통과, 다르면 실패
	}
	
	@Test
	public void test2() {
		// 객체가 두 개일 때
		String abc = "abc";
		String abc2 = abc;
		
		// 같은 참조면 통과
		assertSame(abc2, abc);
	}
	
	@Test
	public void test3() {
		User u = new User();
		
		// not null이면 통과, null 참조면 통과 x
		assertNotNull(u);
	}
}
