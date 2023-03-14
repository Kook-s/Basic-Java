package chapter20.memo;

import java.util.List;
import java.util.Scanner;

public class MemoController {
	private MemoService service = new MemoService();
	private MemoView view = new MemoView();

	public void selectMemos(Scanner scanner) throws Exception {
		List<MemoVO> list = service.selectMemos("");
		view.printMemos(list);
	}

	public MemoVO selectMemo(Scanner scanner) {
		int searchNo = view.inputSearchNo(scanner);
		return service.selectMemo(searchNo);
	}

	public void insertMemo(Scanner scanner) throws Exception {
		MemoVO vo = view.inputInsertMemo(scanner);
		int insertMemo = service.insertMemo(vo);
		view.insertResult(insertMemo);
	}

	public int updateMemo(MemoVO vo) {
		return service.updateMemo(vo);
	}

	public int deleteMemo(int deleteNo) {
		return service.deleteMemo(deleteNo);
	}
}
