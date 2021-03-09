import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;
      boolean primary;

      highwayNumber = scnr.nextInt();
      int prim = ((highwayNumber / 10) % 10) * 10;
   
      if (highwayNumber < 100 && highwayNumber > 0) {
         primary = true;
         if ((highwayNumber % 2 == 0)){
            System.out.println("I-" + highwayNumber + " is primary, going east/west.");
         }
         else {
            System.out.println("I-" + highwayNumber + " is primary, going north/south.");
         }
      }
      else if (highwayNumber < 1000 && highwayNumber > 0) {
         System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + prim + ", going east/west.");
      }
      
      else {
         System.out.println(highwayNumber + " is not a valid interstate highway number."); 
      }
   }
}
