package Homwork_5;
interface PersonalNumberStorage {
	void addPersonalInfo(String name, int age);// 동적 바인딩
	String searchName(int age);// 동적 바인딩
}

class Test {
	public static void main(String[] args) {
		PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
		storage.addPersonalInfo("Jack", 22);
		storage.addPersonalInfo("King", 33);

		System.out.println(storage.searchName(22));
		System.out.println(storage.searchName(33));
		System.out.println(storage.searchName(44));
	}
}

class PersonalNumberStorageImpl implements PersonalNumberStorage {
	PersonalNumInfo[] perArr;
	int numOfPerInfo;

	PersonalNumberStorageImpl(int sz) {
		perArr = new PersonalNumInfo[sz];
		numOfPerInfo = 0;
	}

	public void addPersonalInfo(String name, int age) {
		perArr[numOfPerInfo] = new PersonalNumInfo(name, age);
		numOfPerInfo++;
	}

	public String searchName(int age) {
		for (int i = 0; i < numOfPerInfo; i++) {
			if (age == perArr[i].getAge())
				return perArr[i].getName();
		}
		return "no one";
	}
}

class PersonalNumInfo {
	String name;
	int age;

	public PersonalNumInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}
}
