package Homwork_2;
class Man {
	private String name;

	public Man(String name) {
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("My name is " + name);
	}

}

class BusinessMan extends Man {
	private String company;
	private String position;

	public BusinessMan(String name, String company, String position) {
			super(name);//name을 넘겨준
			this.company = company;
			this.position = position;
		}

	public void tellYourInfo() {
		tellYourName();
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
	}
}

public class Homework1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessMan man1 = new BusinessMan("Jack", "Hannam", "Student");
		man1.tellYourInfo();
	}

}
