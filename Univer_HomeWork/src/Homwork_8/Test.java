package Homwork_8;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class personInfo {
   String nameInfo;
   String ageInfo;

   personInfo(String name, String age) {
      this.nameInfo = name;
      this.ageInfo = age;
   }

   public String outputName() {
      return nameInfo;
   }

   public String outputAge() {
      return ageInfo;
   }
}

public class Test {
   public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);
      String name;
      String outputData;
      String age;
      int answer;
      int personNum = 0;
      int infoNumber = 0;

      ArrayList<personInfo> person = new ArrayList<personInfo>();

      while (true) {
         System.out.println("== 메뉴 ==");
         System.out.println("1. 입력");
         System.out.println("2. 출력");
         System.out.println("3. 종료");
         System.out.print("무엇을 입력하시겠습니까?");
         answer = scanner.nextInt();

         if (answer == 1) {
            System.out.print("이름 : ");
            name = scanner.next();
            System.out.print("나이 : ");
            age = scanner.next();

            person.add(new personInfo(name, age));
         }

         else if (answer == 2) {
            System.out.println("총 " + personNum + "명을 출력합니다.");
            
            BufferedReader in = new BufferedReader(new FileReader("String.txt"));
            while (true) {
               outputData = in.readLine();
               if (outputData == null)
                  break;
               
               System.out.println(outputData);
            }
            in.close();
         }

         else if (answer == 3) {
            BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
            for (int i = 0; i < person.size(); i++) {
               out.write("이름 : ");
               out.write(person.get(i).outputName());
               out.newLine();

               out.write("나이 : ");
               out.write(person.get(i).outputAge());
               out.newLine();
               personNum++;
            }
            out.close();
            
            System.out.println("프로그램을 종료합니다");
            break;
         }
      }
   }
}