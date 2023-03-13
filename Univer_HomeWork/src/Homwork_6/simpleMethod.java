package Homwork_6;
import java.util.Scanner;

public class simpleMethod {

	public static void main(String[] args) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				String end = "z";
				String answer;

				System.out.print("입력하시오(종료:z) ");
				answer = scanner.next();

				if (answer.equals(end)) {
					System.out.println("프로그램을 종료합니다!!");
					break;
				}

				Integer.parseInt(answer);
			} catch (NumberFormatException e) {
				System.out.println("문자입니다!!");
				continue;
			}
			{
				System.out.println("숫자입니다!!");
			}
		}
	}
}