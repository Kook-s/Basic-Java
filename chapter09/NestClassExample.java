package chapter09;

import chapter09.OuterClass.InnerClass;

public class NestClassExample {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
//		outerClass.method();
		
//		InnerClass innerClass = outerClass.new InnerClass();
//		innerClass.method();
//		
//		InnerClass outerC = new OuterClass().new InnerClass();
//		
		//static 붙이면 아래 가능
		InnerClass outer = new OuterClass.InnerClass();
	}
	}