package chapter06;

public class MemberService {

	boolean login(String id, String password) {

		if ("hong".equals(id) && "12345".equals(password)) {
			return true;
		} 
			return false;		
	}
	
	void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("로그아웃되었습니다");
		}
	}

}
