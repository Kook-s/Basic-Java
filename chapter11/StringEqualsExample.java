package chapter11;

public class StringEqualsExample {
	public static void main(String[] args) {
    String strValue1 = new String("신민철");
    String strValue2 = "신민철";
    
    if(strValue1==strValue2) {
    	System.out.println("같은 String 객체를 참조");
    }else {
    	System.out.println("다른 String 객체를 참조");
    }
    
    if(strValue1.equals(strValue2)) {
    	System.out.println("같은 문자열을 가짐");
    }else {
    	System.out.println("다른 문자열을 가짐");
    }
	}
}
