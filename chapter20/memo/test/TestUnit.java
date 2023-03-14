package chapter20.memo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import chapter20.memo.MemoDAO;
import chapter20.memo.MemoVO;

class TestUnit {

	// TDD: Test Driven Development
	MemoDAO dao = new MemoDAO();

//	@Test
	void test() {
		try {
			List<MemoVO> list = dao.selectMemos("");
			assertEquals(0, list.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void selectMemo() {
		MemoVO memo = dao.selectMemo(0);
	}

	@Test
	void inserMemo() {
		try {
			int insertMemo = dao.insertMemo(new MemoVO("7번째 시간", "이제 2시간 남음", "a001"));
			
			List<MemoVO> list = dao.selectMemos("");
			assertEquals(7, list.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
