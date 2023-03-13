package Homwork_7;
import java.util.Scanner;
import java.util.ArrayList;

public class Namelength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> v = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);		
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>> ");
			v.add(scanner.next());
		}

		for (int i = 0; i < 4; i++) {
			System.out.print(v.get(i) + " ");
		}

		int max = v.get(0).length();

		if (v.get(1).length() >= max)
			max = v.get(1).length();
		
		if (v.get(2).length() >= max)
			max = v.get(2).length();
		
		if (v.get(3).length() >= max)
			max = v.get(3).length();
		
		for(int i=0;i<4;i++)
		if(max==v.get(i).length())
			System.out.println("\n가장 긴 이름은 : "+v.get(i));

	}
}
