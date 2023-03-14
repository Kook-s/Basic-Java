package chapter04;

public class ForMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int m = 2; m <= 10; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
		
	}
}
