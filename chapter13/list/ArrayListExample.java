package chapter13.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Detabase");
		list.add("myBatis");
		list.add("myBatis");
		list.add("myBatis");
		

		System.out.println("총 개체수: " + list.size());
		System.out.println();

//		System.out.println("2: " + list.get(2));
//		System.out.println();
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i + ": " + list.get(i));
//		}
//		System.out.println();
//		list.remove(2);
//		list.remove(2);
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i + ": " + list.get(i));
//		}
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
	
			String e =iterator.next();
			if (e.equals("myBatis")) {
				iterator.remove();
			} 
			System.out.println(e);
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
