package chapter07.test;

public class PTtest {
	
	public static void main(String[] args) {

		Ptest parent = new Ctest();
		parent.field1 = "date";
		parent.method1();
		parent.method2();
		
//		parent.method3();
		
		Ctest child = (Ctest)parent;
		child.field2="yyy";
		child.method3();
		
		parent.method1();
	}

}
