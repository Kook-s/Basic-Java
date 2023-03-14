package chapter06.singleton;

public class Singleton {
	private String name;

	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		if(instance ==null)//이 방법도 있지만 위에께 더 낳다는 사람도 있다
			instance = new Singleton();
		return instance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
