import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName = scnr.next();
      char firstInitial = firstName.charAt(0);
      String secondName = scnr.next();
      char middleInitial = secondName.charAt(0);
      String thirdName;
      
      if (!(thirdName = scnr.next()).isEmpty()) {
         System.out.println(thirdName + ", " + firstInitial + "." + middleInitial + ".");
         }

      else if ((thirdName = scnr.next()).isEmpty()) {
         System.out.println(secondName + ", " + firstInitial + ".");
      }
      
   }
}
