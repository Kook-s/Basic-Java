package chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
	public static void main(String[] args) {
		// LocalDate >> 날짜만 사용가능
		// localDateTime >> 날짜와 시간도 사용가능
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		// Method chaning 방식
		String format =LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd E hh:mm:ss.SSS"));
		System.out.println(format);
	}
}
