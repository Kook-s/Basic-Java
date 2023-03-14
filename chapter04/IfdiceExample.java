package chapter04;

import java.util.Random;

public class IfdiceExample {// 선생님이 알려주신 랜덤으로 변경

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = (int) (Math.random() * 6) + 1;
		Random random = new Random();
		int num = random.nextInt(6) + 1;
		
		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
		for (int i = 1; i <= 10; i++)
			System.out.println(random.nextInt(6) + 1);
//		Random random = new Random(88);  
//		int ranNum1 =random.nextInt(6)+1;
//		int ranNum2 =random.nextInt(6)+1;
//		int ranNum3 =random.nextInt(6)+1;
//		int ranNum4=random.nextInt(6)+1;
//		int ranNum5 =random.nextInt(6)+1;
//		int ranNum6 =random.nextInt(6)+1;
//		int ranNum7 =random.nextInt(6)+1;
//		int ranNum8 =random.nextInt(6)+1;
//		int ranNum9 =random.nextInt(6)+1;
//		System.out.println(ranNum1);
//		System.out.println(ranNum2);
//		System.out.println(ranNum3);
//		System.out.println(ranNum4);
//		System.out.println(ranNum5);
//		System.out.println(ranNum6);
//		System.out.println(ranNum7);
//		System.out.println(ranNum8);
//		System.out.println(ranNum9);

	}

}
