package Homwork_3;
class Person {

	private String name;

	public Person(String name) {

		this.name = name;
	}

	public void printPersonMessage() {

		System.out.println(name + "는 Person로 캐스팅 할 수 있다");
	}

	public void printStudentMessage() {

		System.out.println(name + "는 Student로 캐스팅 할 수 있다");
	}

	public void printProfessorMessage() {

		System.out.println(name + "는 Professor로 캐스팅 할 수 있다");
	}

	public void printResearcherMessage() {

		System.out.println(name + "는 Researcher로 캐스팅 할 수 있다");
	}
}

class Student extends Person {

	public Student(String name) {

		super(name);
	}
}

class Researcher extends Person {

	public Researcher(String name) {

		super(name);
	}
}

class Professor extends Researcher {

	public Professor(String name) {

		super(name);
	}
}

public class Hwork4 {
	public static void main(String[] args) {

		Person jee = new Student("jee");

		Person kim = new Professor("kim");

		Person lee = new Researcher("lee");

		if (jee instanceof Person) {

			jee.printPersonMessage();
		}

		if (jee instanceof Student) {

			jee.printStudentMessage();
		}

		if (kim instanceof Student) {

			kim.printStudentMessage();
		}

		if (kim instanceof Professor) {

			kim.printProfessorMessage();
		}

		if (kim instanceof Researcher) {

			kim.printResearcherMessage();
		}

		if (lee instanceof Professor) {

			lee.printProfessorMessage();
		}
	}
}
