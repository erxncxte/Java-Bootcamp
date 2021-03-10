import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      String userString = "";
      boolean keepGoing = true;
     
      if ((userString.contains("Done")) || (userString.contains("done")) || (userString.contains("d"))) {
        keepGoing = false;
        System.exit(0);
      }
      else {
        keepGoing = true;
        while (keepGoing == true) {
            userString = scnr.nextLine();
            int strLen = userString.length();
            for (int i = (strLen - 1); i >= 0; i--) {
                System.out.print(userString.charAt(i));
            }
            System.out.println("");
        }
         System.out.println("");
      }

      scnr.close();
   }
}
