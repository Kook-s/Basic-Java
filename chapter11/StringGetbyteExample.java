package chapter11;

import java.io.UnsupportedEncodingException;

public class StringGetbyteExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		System.out.println(str.contains("요"));

		System.out.println("자바       프로그래     밍".replace(" ", ""));

		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);

		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes1.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);

			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes1.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
