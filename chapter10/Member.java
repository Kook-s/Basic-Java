package chapter10;

import java.util.Objects;

public class Member {
	private String id;

	public Member(String id, int i) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		
		return Objects.equals(id, other.id);
	}

	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}


}
