package chapter09;

public class AnonymousExample {
	public static void main(String[] args) {
//		MyAnnoymous myannoymous = new MyAnnoymous();
//		myannoymous.run();

		new MyAnnoymous() {
			public void run() {
				System.out.println("실행합니다");
			}
			
		};
	
		//함수형 프로그램(function programming)
		//람다(Lambda)표현식 -> 
		//Stream API를 사용할때 많이 활용
	}
}
