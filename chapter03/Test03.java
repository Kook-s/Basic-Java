package chapter03;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
////    01  byte<<byte 자동타입 변환 때문에 오류
//		byte b = 5;
//		b = (byte)-b;
//		int result = 10 / b;
//		System.out.println(result);
		
////	02
//		int x=10;
//		int y=20;
//		int z = (++x)+(y--);
//		System.out.println(z);
//	   값: 31 >> x는 실행 전 +1 , y는 실행이 지나고 -1 

////	03
//		boolean stop =true;
//		while(!stop) { //stop!=true 
//			System.out.println(stop);		
//		}

////	04
//		int pencils = 534;
//		int student = 30;
//
//		int pencilsPerStudent =534/30;
//		System.out.println(pencilsPerStudent); //17
//		
//		int pencilsLeft =534%30;
//		System.out.println(pencilsLeft); //24

////	05
//		int var1=5;
//		int var2=2;
//		double var3 =var1/var2; //double 형변환이 되지 않아 소수점을 날려서
//		int var4 =(int)(var3*var2);
//		System.out.println(var4);

////	06
//		int value =356;
//		System.out.println(value/100*100);

////	07
//		float var1 = 10f;
//		float var2 = var1 / 100;
//		System.out.println(var2);
//		if (var2 == (float)0.1) //<<자동변환  + 0.1f도 가능 
//			System.out.println("10%입니다.");
//		else
//			System.out.println("10%가 아닙니다.");

////	08
//		int lengthTop = 5;
//		int lengthBonttom = 10;
//		int height = 7;
//		double area = (lengthTop+lengthBonttom)*height/2; 
//		System.out.println(area);

////	09
//		System.out.print("첫 번째 수: ");
//		double num1 = sc.nextDouble();
//		
//		System.out.print("두 번째 수: ");
//		double num2 = sc.nextDouble();
//		
//		System.out.println("---------------------------");
//		
//		if (num2 != 0.0)
//			System.out.println("결과:" + num1 / num2);
//		else
//			System.out.println("결과: 무한대");

////	10
//		int var1 = 10;
//		int var2 = 3;
//		int var3 = 14;
//		double var4 = var1 * var1 * var2 + '.' + var3;
//		System.out.println("원의 넓이" + var4);

////	11
//		System.out.println("아이디");
//		String name = sc.nextLine();
//
//		System.out.println("패스워드");
//		String strPassword = sc.nextLine();
//		int password = Integer.parseInt(strPassword);
//
//		if (name.equals("java")) {
//			if (password == 1234) {
//				System.out.println("로그인 성공");
//			} else {
//				System.out.println("로그인 실패:패스워드가 틀림");
//			}
//		} else {
//			System.out.println("로그인 실패:아이디 존재하지 않음");
//		}

////	12
//		int x =10;
//		int y=5;
//		System.out.println((x>7)&&(y<=5));      //true
//		System.out.println((x%3==2)&&(y%2!=1)); //false

////	13
//		int value =0;
//		value =value +10;   value+=value
//		value =value -10;   value-=value
//		value =value *10;   value*=value
//		value =value /10;   value/=value

////	14
//		int score =85;
//		String result =(!(score>90))?"가":"나";
//		String result2 =(score>90)?"가":"나";
//		System.out.println(result+" "+result2);
//		//(score>90)값이 true면 false로 반환되어 (score>90)값은 false로 나와 true가 출력됨
		sc.close();
	}
	
}
