package Homwork_4;
import java.util.Scanner;

class FreindInfoHandler {
	private HighSchoolFreind[] highSchoolFreindArray;
	private UnivSchoolFreind[] univSchoolFreindArray;
	private int numOfHighSchoolFreind = 0;
	private int numOfUnivSchoolFreind = 0;

	public FreindInfoHandler(int num) {
		highSchoolFreindArray = new HighSchoolFreind[num / 2];
		univSchoolFreindArray = new UnivSchoolFreind[num / 2];

	}

	private void AddHighFriendInfo(HighSchoolFreind fren) {
		highSchoolFreindArray[numOfHighSchoolFreind++] = fren;
	}

	private void AddUnivFriendInfo(UnivSchoolFreind fren) {
		univSchoolFreindArray[numOfUnivSchoolFreind++] = fren;
	}

	public void AddFriend(int choice) {
		String name, phoneNum, address, major, job;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n이름: ");
		name = sc.nextLine();
		System.out.print("전화: ");
		phoneNum = sc.nextLine();
		System.out.print("주소: ");
		address = sc.nextLine();

		if (choice == 1) {
			
			System.out.print("직업: ");
			job = sc.nextLine();			
			AddHighFriendInfo(new HighSchoolFreind(name, phoneNum, address, job));
		
		} else if (choice == 2) {

			System.out.print("전공: ");
			major = sc.nextLine();
			AddUnivFriendInfo(new UnivSchoolFreind(name, phoneNum, address, major));
		}
		System.out.println("입력 완료\n");
	}

	public void ShowAllData() {
		for (int i = 0; i < numOfHighSchoolFreind; i++) {
			highSchoolFreindArray[i].ShowAllData();
			System.out.println("");
		}
		for (int i = 0; i < numOfUnivSchoolFreind; i++) {
			univSchoolFreindArray[i].ShowAllData();
			System.out.println("");
		}
	}

	public void ShowAllSimpleData() {
		for (int i = 0; i < numOfHighSchoolFreind; i++) {
			highSchoolFreindArray[i].ShowBasicData();
			System.out.println("");
		}
		for (int i = 0; i < numOfUnivSchoolFreind; i++) {
			univSchoolFreindArray[i].ShowBasicData();
			System.out.println("");
		}
	}
}

class HighSchoolFreind {
	String name, phoneNum, address, job;

	public HighSchoolFreind(String name, String phoneNum, String address, String job) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
		this.job = job;
	}

	public void ShowAllData() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phoneNum);
		System.out.println("주소: " + address);
		System.out.println("직업: " + job);
	}

	public void ShowBasicData() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phoneNum);

	}
}

class UnivSchoolFreind {
	String name, phoneNum, address, major;

	public UnivSchoolFreind(String name, String phoneNum, String address, String major) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
		this.major = major;
	}

	public void ShowAllData() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phoneNum);
		System.out.println("주소: " + address);
		System.out.println("전공: " + major);
	}

	public void ShowBasicData() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phoneNum);
		System.out.println("전공: " + major);

	}
}

public class Homework4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreindInfoHandler handler = new FreindInfoHandler(10);
		while (true) {
			System.out.println("###메뉴 선택###");
			System.out.println("1.고교 친구 저장");
			System.out.println("2.대학 친구 저장");
			System.out.println("3.전체 정보 출력");
			System.out.println("4.기본 정보 출력");
			System.out.println("5.프로그램 종료");
			System.out.print(">>선택 ");
			Scanner sc = new Scanner(System.in);

			int choice = sc.nextInt();

			switch (choice) {

			case 1, 2:
				handler.AddFriend(choice);
				break;

			case 3:
				handler.ShowAllData();
				break;
			case 4:
				handler.ShowAllSimpleData();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다");
				return;

			}
		}
	}
}