package chapter10;

public class ExxeptionExample {
	public static void main(String[] args) {
		
        //일반예외(Exception)
//		class.forName("java.lang.String");
		
		//실행예외 (Runtime Exception)
//		String name=null;
//		System.out.println(name.contains("홍"));
		
	method(null);
	}
	private static void method(String name) {
		if(name!=null)
		System.out.println(name.contains("홍"));
	}
}
