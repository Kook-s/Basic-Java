package Homwork_4;
class Animal {
	public void animalSpeak() {
		System.out.println("animal Speak");
	}
}

class Dog extends Animal {
	public void animalSpeak() {
		System.out.println("woof");		
	}
}

class Cat extends Animal {
	public void animalSpeak() {
		System.out.println("meow");	
	}
}

public class Homework4_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();		
		speak(animal);
		speak(dog);
		speak(cat);
			
	}

	public static void speak(Animal a) {				
			a.animalSpeak();
	}
}
