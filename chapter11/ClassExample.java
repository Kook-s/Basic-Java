package chapter11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import chapter10.Member;

public class ClassExample {
	public static void main(String[] args) throws Exception {

		Class clazz1 = Member.class;
//		Class clazz2 = Class.forName("chapter10.Menber");
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getPackage());
		System.out.println(clazz1.getPackage().getName());

		Constructor[] constructors = clazz1.getConstructors();
		Member member = null;
		for(Constructor constructor :constructors) {
			member = (Member)constructor.newInstance("1");
		}
		System.out.println(member.getId());
		
		Field[] fields = clazz1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("필드 명 " + field.getName());
			System.out.println("필드 타입 " + field.getType());
		}

		Method[] methods = clazz1.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("메소드 명 " + method.getName());
			System.out.println("메소드 타입 " + method.getReturnType());
		}

//		Member member = new Member("1");
		System.out.println(member.getId());
	}
}
