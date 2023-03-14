package chapter01;

public class Hello {
	public static void main(String[] args) {

		System.out.println("Holle World!");

//		String srt = 100 + "";
//		String s = String.valueOf(100);
//		int a = Integer.valueOf(100);
//		System.out.println(srt);
		char c1 = 'a';
		char c2 = (char) (c1 + 1);
		int c3 = c1 + 1;
		System.out.println(c2 + "  " + (c1 + 1) + " " + c3);

		// p.87
//		8 
//		double var1 =3.5;
//		double var2 =2.7;
//		int reslut = (int)(var1+var2);

		// 9
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int) (var1 + var2 + var3) + (int) (Float.parseFloat(var4));
		System.out.println(result);

		// 10
		// 전부 23

		// 11
//		byte value1 = Byte.parseByte("10");
//		int value2 = Integer.parseInt("1000");
//		float value3 = Float.parseFloat("20.5");
//		double value4 = Double.parseDouble("3.14159");

	}
}