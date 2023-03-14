package chapter11;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
		System.out.println(member);

	}
}

class Member {
	private String id;
	private String name;

	public Member(String id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return String.format("%s : %s", id, name);
	}
	
	
}
