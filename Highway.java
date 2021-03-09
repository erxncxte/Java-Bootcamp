import java.util.Scanner; 

public class Highway {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;
      boolean primary;

      highwayNumber = scnr.nextInt();
      double prim = ((highwayNumber / 10.0) % 10.0) * 10;
      int intPrim = (int) prim;
   
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
         if ((highwayNumber % 2 == 0)){
            System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + intPrim + ", going east/west.");
         }
         else {
            System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + intPrim + ", going north/south.");
            }
      }
      
      else {
         System.out.println(highwayNumber + " is not a valid interstate highway number."); 
      }
   }
}
