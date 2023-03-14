package chapter07.child;

public class ChildExample {
	public static void main(String[] args) {
		Parent child = new Child();
		Child parent = (Child) child;
		run(child);
		run(parent);
	}
	static void run(Parent parent) {}
}
