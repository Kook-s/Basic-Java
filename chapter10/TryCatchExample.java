package chapter10;

public class TryCatchExample {
	public static void main(String[] args) {

		try {
			System.out.println("시작");
			Class.forName("java.ang.String");
//			System.out.println("종료");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("패키지나 클래스 이름이 틀림");
			
		}finally {
			System.out.println("실행끝");
		}
	}
}
