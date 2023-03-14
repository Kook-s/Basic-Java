package chapter08.soundable;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}

class Dog implements Soundable {
	public String sound() {
		return "멍멍";
	}
}

class Cat implements Soundable {
	public String sound() {
		return "야옹";
	}
}
