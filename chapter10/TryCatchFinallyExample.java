package chapter10;
/**
 * 
 * @author PC-20
 *
 */
public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = { "1O", "2O" };
		int value = 0;

		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스초과");
			} catch (NumberFormatException e) {
				System.out.println("숫자변형x");
			} finally {
				System.out.println(value);
			}
		}
	
	}

}
                            
                               
                            
                                    
                            
                                   
                            
                               
                            
                         