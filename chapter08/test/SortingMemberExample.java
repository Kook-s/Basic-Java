package chapter08.test;

import java.util.Arrays;

public class SortingMemberExample {
	public static void main(String[] args) {
		Member[] members = new Member[5];

		members[0] = new Member("가기현", 20);
		members[1] = new Member("다기현", 26);
		members[2] = new Member("하기현", 31);
		members[3] = new Member("파기현", 39);
		members[4] = new Member("키기현", 19);

		for (Member member : members) {
			System.out.println(member);
		}

		Arrays.sort(members);
		System.out.println();
		for (Member member : members) {
			System.out.println(member);
		}
	}
}
