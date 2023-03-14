package chapter20.memo;

import java.sql.Timestamp;

//VO: Value Object 값을 저장하는 객체
//DTO: Data Transfer Object 저장된 값을 전달하는 객체
//Bean: 자바가 커피원두에서 따온 이름이라 객체를 Bean으로 표현하기로 함
//Model: 데이터와 관련된 객체를 Model이라고 부르기도 함
//Item: 각각의 데이터를 표현하는 의미로 아이템이라고 부리기도 함
//Java Beans 패턴 VS Builder 패턴
//객체 선언 도구 => Lombok이 boilerplate Code 없에는 역할
public class MemoVO {
	private int no;
	private String title;
	private String content;
	private String writer;
	private Timestamp registeraDate;
	private Timestamp modifyDate;

//insert 할때
	public MemoVO(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

//update 할때
	public MemoVO(int no, String titel, String content, String writer) {
		this.no = no;
		this.title = titel;
		this.content = content;
		this.writer = writer;
	}

//select 할때 
	public MemoVO(int no, String title, String content, String writer, Timestamp registeraDate, Timestamp modifyDate) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.registeraDate = registeraDate;
		this.modifyDate = modifyDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Timestamp getRegisteraDate() {
		return registeraDate;
	}

	public void setRegisteraDate(Timestamp registeraDate) {
		this.registeraDate = registeraDate;
	}

	public Timestamp getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\t%s\t%s\n", no, title, content, writer, registeraDate, modifyDate);
	}

}
