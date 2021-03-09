import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int num1 = scnr.nextInt();
      int num2 = scnr.nextInt();
      int num3 = scnr.nextInt();
      int lowNum;
      
      lowNum = (num1 < num2) ? num1 : num2;
      lowNum = (lowNum < num3) ? lowNum : num3;
      
      System.out.println(lowNum);
   }
}