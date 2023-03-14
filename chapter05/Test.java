package chapter05;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4
//		int max = 0;
//		int[] array = { 1, 5, 3, 8, 2 };
//		Arrays.sort(array);
//		max = array[array.length - 1];

//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > max)
//				max = array[i];
//		}
//		System.out.println("max: " + max);
//5
//		int[][] array = {
//				{ 95, 86 }, 
//				{ 83, 92, 96 }, 
//				{ 78, 83, 93, 87, 88 } 
//				};
//		int sum = 0;
//		double avg = 0.0;
//		
//		int coun =0;
//		for(int i=0;i<array.length;i++) {
//			for(int j=0;j<array[i].length;j++) {
//				sum+=array[i][j];
//				coun++;
//			}
//		}
//		avg=sum/coun;
//
//		System.out.println("sum: " + sum);
//		System.out.println("avg: " + avg);

		// 6
		boolean run = true;
		int studenNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.print("학생 수> ");
				studenNum = Integer.parseInt(sc.nextLine());
				scores = new int[studenNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("score[" + i + "]>");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("score[" + i + "]>" + scores[i]);
				}
			} else if (selectNo == 4) {
				int sum = 0;
				Arrays.sort(scores);
				System.out.println("최고 점수:" + scores[scores.length - 1]);
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				System.out.println("평균 점수" + (double) sum / scores.length);
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
		sc.close();
	}

}
