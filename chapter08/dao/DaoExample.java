package chapter08.dao;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}

class OracleDao implements DataAccessObject{
	public String db = "Oracle";
	public void select() {
		System.out.println(db+" DB에서 검색");
	}
	public void insert() {
		System.out.println(db+" DB에 삽입");
	}
	public void update() {
		System.out.println(db+" DB를 수정");
	}
	public void delete() {
		System.out.println(db+" DB에서 삭제");
	}
}

class MySqlDao implements DataAccessObject{
	public String db = "MySql";
	public void select() {
		System.out.println(db+" DB에서 검색");
	}
	public void insert() {
		System.out.println(db+" DB에 삽입");
	}
	public void update() {
		System.out.println(db+" DB를 수정");
	}
	public void delete() {
		System.out.println(db+" DB에서 삭제");
	}
}