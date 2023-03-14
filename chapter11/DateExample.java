package chapter11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		String dateString = date.toString();
		System.out.println(dateString);
		
		//날짜 포맷팅 SimpleDateFormat
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd E hh:mm:ss.S");
		String format = dateFormat.format(date);
		System.out.println(format);
		
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millisecond = calendar.get(Calendar.MILLISECOND);
		int dayOfWeek= calendar.get(Calendar.DATE);
		System.out.printf("%4d-%02d-%02d %02d:%02:%02d.%03d  %d",year,month,+1,day,hour,minute,second,millisecond,dayOfWeek);
	}
}
