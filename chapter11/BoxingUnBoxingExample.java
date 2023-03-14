package chapter11;

import java.util.Iterator;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {

		int a = 10;
		Integer b = new Integer(10);
		int bb = b.intValue();
		Boolean c = new Boolean(false);

		Integer d = 10;
		int e = new Integer(10);

		Integer obj = new Integer(200);
		int value1 = obj;
		int value2 = obj + 100;

		System.out.println(obj==value1);
		
		
		long startTime = System.nanoTime();
		Integer sum=0;
		for(int i=1;i<10000;i++) {
			
			sum=sum+i;
			
		}
		System.out.println(sum);
		long endTime = System.nanoTime();
		System.out.println(endTime-startTime);
		
		Integer int1 =100;
		Integer int2 =200;
		int sum2 = Integer.sum(int1, int2);
		System.out.println(sum2);
	}
}