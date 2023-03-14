package chapter08.test;

import java.util.ArrayList;
import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		// 정렬 알고리즘 sorting
		// 검색(탐색)
		int[] numbers = { 4, 2, 9, 6, 7, 8, 3 };
		String[] names = { "박승우", "배문지", "박정수", "오미나", "이지영", "정은지", "전지혜" };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		ArrayList<Integer> list = new ArrayList<Integer>();

	}
}
