package Homwork_2;
class Animal {
	private static int animal = 0;

	public Animal() {
		animal++;
	}

	public static int getCount() {
		return animal;
	}
}

class Cat extends Animal {


}

class Dog extends Animal {

	
}

class Duck extends Animal {

	
}

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Cat();
		new Dog();
		new Duck();

		System.out.println("생선된 객체의 개수: " + Animal.getCount());
	}
}
