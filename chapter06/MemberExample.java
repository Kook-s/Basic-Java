package chapter06;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("홍길동","hong");
		
    System.out.println(member.title+" "+member.content+" "+ member.writer+" "+member.date+" "+ member.hitcount);
	}

}
