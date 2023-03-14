package chapter10;

import java.util.Scanner;

public class RuntmeExceptionExample {
	public static void main(String[] args) { // String[] args={};

		String data1;
		String data2;
		Scanner sc = new Scanner(System.in);
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환 할 수 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("다시 실행하시오.");
		}

	}
}
