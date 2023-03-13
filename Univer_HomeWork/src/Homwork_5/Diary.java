package Homwork_5;
import java.util.Scanner;

enum Week {
	MON, TUE, WED, THU, FRI, SAT, SUN;

}

public class Diary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] aa = new String[7];
		Scanner sc = new Scanner(System.in);

		while (true) {
			int count = 0;
			System.out.print("요일을 입력하세요 :");
			String choice = sc.next();
			if (choice.equals("XXX")) {
				System.out.print("프로그랩을 종료합니다.");
				break;
			}

			for (Week week : Week.values()) {
				if (choice.equals(week.name())) {
				} else {
					count++;
				}
			}
			if (count == Week.values().length) {
				System.out.println("잘못 입력 하였습니다.");

			} else {
				switch (Week.valueOf(choice)) {
				case MON:
					System.out.println("주간회의가 있습니다.");
					break;
				case TUE:
					System.out.println("프로젝트 기획 회의가 있습니다.");
					break;
				case WED:
					System.out.println("진행사항 보고하는 날입니다.");
					break;
				case THU:
					System.out.println("사내 축구시합이 있는 날입니다.");
					break;
				case FRI:
					System.out.println("프로젝트 마감일입니다.");
					break;
				case SAT:
					System.out.println("가족과 함께 즐거운 시간을 보내세요.");
					break;
				case SUN:
					System.out.println("오늘은 휴일입니다.");
					break;

				}
			}
		}
	}
}
