package chapter09;

public class OuterClass {
String name;
void method(){
	System.out.println("outer");
}

//OuterClass 자바가 실행될때 필요한 클래스 정보를 method area에 올려둔다.
// InnerClass는 OuterClass처럼 method area에 정보를 올리지 않는다.
// OuterClass가 생성되어야만 InnerClass를 생성할 수 있다.
static class InnerClass{
	public InnerClass(){}
	String name;
	void method() {
		System.out.println("inner");
	}
}

interface MestedInterface{
	void run();
}

}
