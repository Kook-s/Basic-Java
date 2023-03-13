package Homwork_8;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

class point implements Serializable {
	int age;
	String name;

	point(String name, int age) {
		this.age = age;
		this.name = name;

	}

	public String toString() {
		return ("이름: " + name + "\n나이 : " + age + "\n");
		// System.out.print("이름: " + name+"\n나이 : " + age+"\n");
		// System.out.print("나이: " + age+"\n");
	}

	public void showInfo() {
		// return ("이름: " + name + "\n나이 : " + age + "\n");
		System.out.print("이름: " + name + "\n나이 : " + age + "\n");
		// System.out.print("나이: " + age+"\n");
	}
}

public class Info {
	static ArrayList<point> person = new ArrayList<point>();
	static int a = 0;

	public static void end(Scanner scanner) {

		String name;
		int age;
		System.out.print("이름: ");
		name = scanner.next();
		System.out.print("나이: ");
		age = scanner.nextInt();
		person.add(new point(name, age));
	}

	public static void outPut() {

//		String name;
//		int age;
//		System.out.print("이름: ");
//		name = scanner.next();
//		System.out.print("나이: ");
//		age = scanner.nextInt();
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.bin"))) {
			for (point per : person)
				out.writeObject(per);
			// out.writeObject(new point(person.get(a).name,person.get(a).age));

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	public static void inPut() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.bin"))) {
			System.out.println("총" + person.size() + "명을 출력합니다. ");
			while (true) {

				try {
					point po = (point) in.readObject();
					System.out.println(po);


				} catch (EOFException e) {
					break;
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				}
			}
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.bin"))) {
		
			while (true) {
				try {
					point po = (point) in.readObject();
					//person.add(new point());


				} catch (EOFException e) {
					break;
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				}
			}
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		while (true) {
			System.out.println("== 메뉴 ==");
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 종료");
			System.out.print("무엇을 입력하시겠습니까? ");
			int a = scanner.nextInt();

			switch (a) {
			case 1:
				end(scanner);
				break;
			case 2:
				inPut();
				break;
			case 3:
				outPut();
				System.exit(0);
			}
		}
	}

}
