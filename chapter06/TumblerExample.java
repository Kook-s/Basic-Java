package chapter06;

public class TumblerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      ↓stack에 만들어짐  ↓heap area에 만들어짐
		Tumbler tumbler1 = new Tumbler();
		Tumbler tumbler2 = new Tumbler();
		Tumbler tumbler3 = new Tumbler();
		Tumbler tumbler4 = new Tumbler();

		tumbler1.a();
	}

}
