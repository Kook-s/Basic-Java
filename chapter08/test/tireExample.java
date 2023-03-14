package chapter08.test;

public class tireExample {
	public static void main(String[] args) {
		
		tire t = new tire() {
			
			public void roll() {
				System.out.println("asd");
			};

			public void ro() {
				System.out.println("qwer");
			};
		};
		t.roll();
		t.ro();
	}
}
