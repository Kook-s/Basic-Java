package chapter10;

public class ThrowsExample {
	public static void main(String[] args)  {
          //		method();
	     //예외를 발생시키기 => 예외를 만든다.         
		//throw
//		throw new IllegalArgumentException();
//		method();
		try {
			method();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("예외 처리");
		}
	}

	public static void method() {
//		Class.forName("java.lang.String");
		int a=0;		
		
		if(a==0)
		throw new IllegalArgumentException();
//		System.out.println();
		
	}
}
 