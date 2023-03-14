package chapter06;

public class Member {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;

	Member(String title, String content) {
		this(title, content, "로그인한 회원아이디", "현재 날짜", 0);
	}

	Member(String title, String content, String writer) {
		this(title, content, writer, "현재 날짜", 0);
	}

	Member(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);
	}

	Member(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

}
