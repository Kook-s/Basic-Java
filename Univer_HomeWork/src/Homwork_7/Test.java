package Homwork_7;
import java.util.HashSet;
import java.util.Iterator;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showData() {
		System.out.printf("%s %d \n", name, age);
	}

	public int hashCode() {
		return name.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (!this.name.equals(other.name))
			return false;

		return true;
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("Lee", 24));
		hSet.add(new Person("Hong", 29));
		hSet.add(new Person("Choi", 21));
		hSet.add(new Person("Hong", 28));
		printCollection(hSet.iterator());

		deleteCollection(hSet, "Hong");
		printCollection(hSet.iterator());

	}

	public static void printCollection(Iterator<Person> itr) {
		while (itr.hasNext())
			itr.next().showData();
		System.out.println();
	}

	public static void deleteCollection(HashSet<Person> hSet, String name) {

		Iterator<Person> iterator = hSet.iterator();

		while (iterator.hasNext())
			if (iterator.next().name.equals(name))
				iterator.remove();

	}
}
