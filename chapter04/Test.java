package chapter04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		2
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);

//		3
//		Random random = new Random();
//
//		while (true) {
//			int num1 = random.nextInt(6) + 1;
//			int num2 = random.nextInt(6) + 1;
//			System.out.println(num1 + " " + num2);
//			if (num1 + num2 == 5) {
//				break;
//			}
//		}

//		4
//		for (int x = 1; x <= 10; x++) {
//			for (int y = 1; y <= 10; y++) {
//				if ((4 * x + 5 * y) == 60) {
//					System.out.println("("+x + "," + y+")");
//				}
//			}
//		}

//		5
//		int con=1;
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<con;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			con++;
//		}
//		6
//		int con=3;
//		int con1=1;
//		for(int i=0;i<4;i++) {
//			
//			for(int j=0;j<con;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<con1;j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			con--;
//			con1++;
//		}

//        7
		boolean run = true;
		int boolance = 0;
		Outter: while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			switch (sc.nextLine()) {

			case "1":
				System.out.print("예금액>");
				boolance = Integer.parseInt(sc.nextLine());
				break;
			case "2":
				System.out.print("출금액>");
				boolance -= Integer.parseInt(sc.nextLine());
				break;
			case "3":
				System.out.println("잔고>" + boolance);
				break;
			case "4":
				System.out.println("프로그램 종료");
				break Outter;

			}

		}

	}

}
