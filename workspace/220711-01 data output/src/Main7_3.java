import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 3번
 * 입력을 통한 (사람 정보) 파일 기록
 * 
 * 목록으로 만들기
 * 
 * -------------
 * 1명(번호로 선택해서)만 볼 수 있는 기능
 * 1명(수정)
 * 1명 (삭제)
 */
class User {
	Integer number;
	String name;
	Integer phoneNum;
	String email;
	public User(Integer number, String name, Integer phoneNum, String email) {
		super();
		this.number = number;
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Integer phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

public class Main7_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<User> userList = new ArrayList<>();
		
		int a = 0;
		while(true) {
			System.out.println("정보를 입력하시겠습니까? \n1.예 2. 아니오");
			a = scan.nextInt();
			if(a == 1) {
				System.out.println("번호를 입력해주세요");
				Integer number = scan.nextInt();
				for(int i = 0; i <= userList.size(); i++) {
					if (userList.size() == 0) {
						i--;
					} else if(userList.contains(userList.get(i).getNumber())) {
						System.out.println("이미 존재하는 번호입니다.");
						System.out.println("번호를 입력해주세요");
						number = scan.nextInt();
					}
				}
				System.out.println("이름을 입력해주세요");
				String name = scan.next();
				System.out.println("전화번호를 입력해주세요");
				Integer phoneNum = scan.nextInt();
				System.out.println("이메일 주소를 입력해주세요");
				String email = scan.next();
				
				User user1 = new User(number, name, phoneNum, email);
				userList.add(user1);
				System.out.println(userList.toString());
			} else {
				break;
			}
		} 
		
		
		
		
		
		
	}
}
