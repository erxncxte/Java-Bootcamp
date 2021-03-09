import java.util.Scanner;

public class ConditionalExpressions {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String condStr;
      int userVal;

      userVal = scnr.nextInt();

      condStr = (userVal < 0) ? "negative" : "non-negative";

      System.out.println(userVal + " is " + condStr + ".");
   }
}