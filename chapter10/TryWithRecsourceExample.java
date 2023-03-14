package chapter10;

import java.util.Scanner;

public class TryWithRecsourceExample {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("첫번째");
			int fristNUm = sc.nextInt();
			System.out.println("두번째");
			int SecondNUm = sc.nextInt();
			int result =fristNUm+SecondNUm;
			System.out.println(result);
		}
		
	}
}
