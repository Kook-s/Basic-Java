package chapter20.memo;

import java.util.List;
import java.util.Scanner;

public class MemoView {

	public void printMemos(List<MemoVO> list) {
		System.out.println("메모 전체 목록");
		for (MemoVO vo : list) {
			System.out.println(vo);

		}
	}

	public MemoVO inputInsertMemo(Scanner scanner) {
		System.out.print("제목: ");
		String title = scanner.nextLine();
		System.out.print("내용: ");
		String content = scanner.nextLine();
		System.out.print("작성자: ");
		String writer = scanner.nextLine();

		return new MemoVO(title, content, writer);
	}

	public void insertResult(int count) {
		if (count > 0) {
			System.out.println("메모가 정상적으로 등록되었습니다.");
		} else {
			System.out.println("메모가 정상적으로 등록되 않았습니다. 관리자에게 문의하세요.");
		}
	}

	public int inputSearchNo(Scanner scanner) {
		System.out.println("메모 번호를 입력하세요");
		return Integer.parseInt(scanner.nextLine());

	}

	public void printMemo(MemoVO vo) {
		System.out.println(vo);
	}
}
