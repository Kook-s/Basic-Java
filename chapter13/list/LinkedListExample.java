package chapter13.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;
		for (int a = 0; a < 10; a++) {

			startTime = System.nanoTime();
			for (int i = 0; i < 10000; i++) {
				list1.add(0, String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + "ns  "+list1.size());
			list1.clear();
			
			startTime = System.nanoTime();
			for (int i = 0; i < 10000; i++) {
				list2.add(0, String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + "ns  "+list2.size());
			list2.clear();
			System.out.println();
		
		}
		
	}
}