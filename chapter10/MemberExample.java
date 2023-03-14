package chapter10;

public class MemberExample {
	public static void main(String[] args) {
   Member obj1 = new Member("blue",1);
   Member obj2 = new Member("blue",1);
   Member obj3 = new Member("red",1);
   System.out.println(obj1.equals( obj2));
   System.out.println(obj1.equals(obj3));
   
	}
}
