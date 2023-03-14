package chapter08.test;

public class Member implements Comparable<Member> {
	private String name;
	private int age;

	public Member(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + "  " + age;
	}

	public int compareTo(Member o) {
		return name.compareTo(o.name); 
	}
}
