package Homwork_7;
import java.util.Scanner;
import java.util.HashMap;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);
		String number;
		while (true) {
			System.out.print("번호화 단어를 입력하세요(99=quit): ");
			number = scanner.next();
			dic.put(number, scanner.next());

			if (number.equals("99"))
				break;
		}

		System.out.print("찾는 단어의 번호를 입력하시오:  ");
		number = scanner.next();
		System.out.println(dic.get(number) + " 입니다. ");
	}
}