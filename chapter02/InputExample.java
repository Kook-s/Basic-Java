package chapter02;

import java.util.*;

public class InputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
//		System.out.println("첫번째 수");
//
//		String strNum1 = scanner.next();
//
//		System.out.println("두번째 수");
//
//		String strNum2 = scanner.nextLine();
//		int num1 = Integer.valueOf(strNum1);
//		int num2 = Integer.valueOf(strNum2);
//		int result = num1 + num2;
//		System.out.println("덧셈 결과: "+result);

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = scanner.next();
		System.out.print("2. 주민번호 앞 6자리: ");
		int idNum;
		String phonNum;
		while (true) {
			idNum = scanner.nextInt();
			// int 말고 String 으로 할거면 length

			if (idNum > 999999) {
				System.out.println("6자리를 다시 입력하세요!");
				continue;
			}

			System.out.print("3. 전화번호: ");
			phonNum = scanner.next();

			if (phonNum.length() <= 12) {
				break;
			} else {
				System.out.println("11자리를 다시 입력하세요!");
				continue;
			}
		}
		System.out.println("\n[입력한 내용]");
		System.out.print(name + "\n" + idNum + "\n" + phonNum.substring(0, 3) + "-" + phonNum.substring(3, 7) + "-"
				+ phonNum.substring(7, 11));
		scanner.close();
	}
}
